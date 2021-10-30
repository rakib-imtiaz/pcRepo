#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void student_portal();
void student_login();
void registration();
void admission_test();
void admin_portal();
void admin_login();
void score_sorter();

int is_user_exists(char * userName);
void file_maker();

// global variable for detecting current user;

char current_name[20];
char current_userName_with_extension[50];


struct information{

    char name[20];
    int marks;

};



int main()
{
    int option;
    file_maker();
/*

the program will start execute from here,
this is the home page.



*/

    printf("Welcome To NSU Admission Test\n\n");
    printf("Are You Student or Admin(choose 1 or 2)?\n");
    printf("1.Student\n2.Admin\n");

    scanf("%d",&option);

/*

this variable will take the user input,triggers the switch


*/

    fflush(stdin);

    switch(option)
    {
    case 1:
        {
            gets();
            //gets will absorb the leading space from the previous scanfs
            student_portal();
            break;
        }

    case 2:
        {
            gets();
            admin_portal();
            break;
        }

    default:
        {
            printf("Invalid option! \n");
            //system("cls");
            gets();
            main();
            break;
        }
    }




    return 0;
}


void logout()
{

    student_portal();



}

void student_portal()
{

    printf("\n\n\t\t\tWelcome to Student Portal\n");
    printf("Choose your Prepared Options\n");
    int option;
    printf("1.Login\n");
    printf("2.Registration\n");
    scanf("%d",&option);
    fflush(stdin);

    switch(option)
    {
        case 1:{
            student_login();
            break;
        }
        case 2: {
            registration();
            break;

        }
        default:
            {
                printf("Invalid Option!\n");
                exit(1);
            }
    }


}

void student_login()
{
    FILE *file;
    char user_name[20],password[30],fetched_pass[40],fetched_userName[40];
    gets();

    printf("\n\n\t\t\tStudent Login: \n\n");
    printf("Enter User Name: \n");
    scanf("%s",user_name);

    printf("Enter Password: \n");
    scanf("%s",password);

    //this part will add the .txt extension with the username

    char extension_added_usr_name[40];

    char txt_extension[5]=".txt";

    //adding the .txt extension by concatenating and copying the user name to a global variable

    strcpy(extension_added_usr_name,user_name);
    //this line will concate the user name with the .txt extension
    strcat(extension_added_usr_name,txt_extension);
    //this line will copy the contents to the destination variable.
    strcpy(current_userName_with_extension,extension_added_usr_name);



/*
this function is made for the verification of whether the provided username is already exists or not
if its exits,the function will return 1, which is true,and the if condition will be executed.
then the program will open the file containing the users info in read format and it will start fetching data
from the file until EOF(end of line )occurs.

it will read the users credentials from the file and will try to match with the given credentials .
if it matches, user will be logged into the student portal.



*/
    if(is_user_exists(user_name))
    {
        file=fopen(extension_added_usr_name,"r");

        fscanf(file,"%s %s",fetched_userName,fetched_pass);

        if(strcmp(fetched_pass,password)==0)
        {
            //system("cls");
            printf("\n\n\nWelcome %s \n",fetched_userName);
            strcpy(current_name,fetched_userName);

            printf("1.Admission test\n2.Logout\n");
            int option;
            scanf("%d",&option);
            if(option==1)
            {
                admission_test();
            }
            else{

            printf("Logged Out Successfully\n");
            //system("cls");
            logout();

            }


        }
        else{

            printf("Invalid Credentials\n");
            //system("cls");

            //student_portal();
            exit(1);
        }



    }
     else{

            printf("Invalid Credentials\n");
            //system("cls");


            student_portal();
            exit(1);
        }











}





void registration()
{
    FILE *file;

    char name[20],user_name[20],password[20];

    char txt_extension[5]=".txt";
    char extension_added_usr_name[30];
    gets();


    printf("\n\n\t\t\tRegistration: \n\n");


    printf("Name: \n");
    scanf("%s",name);

    printf("User Name: \n");
    scanf("%s",user_name);

    printf("Password: \n");
    scanf("%s",password);

/*
when the user enters their username, it needs to be check whether this user already registered with this user name or not
for that purpose, every user will have a text file of their own,the text files will be containing their credentials.
so for making multiple files dynamically and making them unique with each other, we have developed an idea.
At registration period, the program will fetch the username given by the user,check if it is already registered or not
if it isnt , the program will concatenate ".txt" with the username, making it a valid text file name format.

for example if the user enters his username : abul2020

the text file will be generated with the name of abul2020.txt

*/
    strcpy(extension_added_usr_name,user_name);
    strcat(extension_added_usr_name,txt_extension);

    if(is_user_exists(user_name))
    {
        printf("User name already Exists\n");
        printf("Retry\n");
        registration();

    }





        file=fopen(extension_added_usr_name,"w");
        fprintf(file,"%s %s\n",name,password);
        fclose(file);

        file=fopen("UserNameList.txt","a");
        fprintf(file,"%s\n",user_name);
        fclose(file);

        printf("Registration Successful!\n");

        printf("Do you want to login?(Y/N)\n");
        char option;
        fflush(stdin);
        scanf(" %c",&option);

        switch(option)
        {
        case 'Y':
            {
                student_login();
                break;
            }
        case 'y':
            {
                student_login();
                break;
            }
        case'N':
            {
                exit(0);
                break;
            }
        case'n':
            {
                exit(0);
                break;
            }
            default:{
                printf("Invalid option!\n");
                exit(0);

            }

        }

}

// if the user exists the function will return 1(true) else, the function will return 0(false)
int is_user_exists(char *user_name)
{
    FILE *file;

     file=fopen("UserNameList.txt","r");
        char fetch_username[30];

        while(fscanf(file,"%s\n",fetch_username)!=EOF)
            {
                if(strcmp(fetch_username,user_name)==0)
            {

                return 1;

            }
            else{
                continue;
            }
        }
        fclose(file);

        return 0;


}












void admission_test()
{
    //system("cls");
    FILE *file_of_question, *file_of_options,*file;

 char ques[150],opt[150];
/*

from three separated files, we are fetching the questions,options and answers at the same time....
by the fgets function we are reading about 70 character per line for questions and crossponding options for the
questions from two different files and at the same time matching the answers with the user-entered answers
and increasing a mark variable for every correct answer.
and finally the program will add the marks and the user name in the "MarkList.txt" file.




*/

 file_of_question=fopen("questions.txt","r");
 file_of_options=fopen("options.txt","r");
 file=fopen("answer.txt","r");

 int mark_counter=0;

file=fopen("answer.txt","r");

int digit;
char temp,fetched_ans,given_ans;

printf("\n\t\t\tAdmission Test\n");

while(fscanf(file,"%d %c %c",&digit,&temp,&fetched_ans)!=EOF)
{
    fgets(ques,70,file_of_question);
    fgets(opt,70,file_of_options);


    //printing the questions
    printf("%s",ques);
    //printing the answers
    printf("%s",opt);

    //fetching the answers from the file

    scanf(" %c",&given_ans);
/*
checking if the given_answer matches with fetched answers or not

*/

  if(given_ans==fetched_ans)
     {
         mark_counter++;

     }
     else{

        continue;
     }


}

printf("\n\n\t\t\t\tExam ends!\n\n\n");




fclose(file);
fclose(file_of_options);
fclose(file_of_question);

/*
After closing all the files,finally appending the current users scores with their name into another file called
MarkedList.txt.

*/
file=fopen("MarkList.txt","a");
fprintf(file,"%s  %d",current_name,mark_counter);
fclose(file);





}

void file_maker()
{
    FILE *file;

    file=fopen("UserNameList.txt","a");
    fclose(file);

    file=fopen("questions.txt","a");
    fclose(file);

    file=fopen("options.txt","a");
    fclose(file);

    file=fopen("answer.txt","a");
    fclose(file);

    file=fopen("admin.txt","a");
    fclose(file);




}

void admin_portal()
{
    char fetched_userName[20],fetched_pass[20];
    char id[20],pass[20];

    FILE *file;
    file=fopen("admin.txt","r");
    fscanf(file,"%s %s",fetched_userName,fetched_pass);


    printf("\n\n\t\t\tAdmin Login: \n\n");
    printf("Enter admin Id: ");
    gets(id);
    printf("Enter Password: ");
    gets(pass);
/*
by comparing the fetched data from the file with the inputted data,
admin will able to login to the admin portal

*/

        if(strcmp(fetched_pass,pass)==0)
    {
        //system("cls");
        printf("\t\t\tWelcome Admin\n");

    printf("\n\n1.View Result\n");
    int option;
    FILE *file;

    file=fopen("MarkList.txt","r");

    char name[20];
    int mark;

    scanf("%d",&option);
    if(option==1)
    {
       score_sorter();
    }


    }
    else{

        printf("Incorrect credentials!\n");
        admin_portal();
    }





}

/*
this function will fetch the data from the "MarkList.txt" in a structure array and then sort the data in descending
order and then print the data to console


*/

void score_sorter()
{

    struct information info[50],temp;
    int i,j;
    FILE *file;
    file=fopen("MarkList.txt","r");

    int counter=0;

    /*

  fetching data from the file



  */
    while(fscanf(file,"%s %d",&info[counter].name,&info[counter].marks)!=EOF)
            {
                counter++;
        }
  /*

  sorting the whole structure Array in Descending order



  */
    for (i = 1; i < counter; i++)
      for (j = 0; j < counter - i; j++) {
         if (info[j + 1].marks > 0) {
            temp = info[j];
            info[j] = info[j + 1];
            info[j + 1] = temp;
         }
      }


    printf("\nName:\t\tMark Obtained: \n\n");

   for (i = 0; i < counter; i++)
    {
      printf("\n%s\t\t%d",info[i].name,info[i].marks);
   }




}
