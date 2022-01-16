#include<stdio.h>
#include<string.h>

struct student
{
    char course_name[20];
    float marks;
    int credit;
} obj[100];

char current_session[100];
char current_mail[100];

void view_history();


void signUp()
{

    char email[200];
    char name[200];
    char password[200];
    char re_password[200];


    gets(stdin);
    printf("\n\nEnter your Name: \n");
    gets(name);
    printf("Enter your email: \n");
    gets(email);

    printf("Password: \n");
    gets(password);

    printf("Re- enter your Password: \n");
    gets(re_password);

    if(strcmp(re_password,password)==0)
    {
        printf("Registration sucessfull\n");

    }
    else
    {
        printf("Incorrect password\n");
        signUp();
    }

    char ext[]=".txt";
    char temp_mail[100];
    strcpy(temp_mail,email);
    strcat(temp_mail,ext);


    FILE *file;
    file=fopen(temp_mail,"w");

    fprintf(file,"%s %s %s",name,email,password);
    fclose(file);


}

float four_gpa(int marks)
{
    float point;

    if(marks<=59)
    {
        point=0.00;
    }
    if(marks>=60 && marks<=66)
    {
        point=1.00;

    }
    if(marks>=67 && marks<=69)
    {
        point=1.30;

    }
    if(marks>=70 && marks<=72)
    {
        point=1.70;

    }
    if(marks>=73 && marks<=76)
    {
        point=2.0;

    }
    if(marks>=77 && marks<=79)
    {
        point=2.3;

    }
    if(marks>=80 && marks<=82)
    {
        point=2.7;
    }
    if(marks>=83 && marks<=86)
    {
        point=3.0;
    }
    if(marks>=87 && marks<=89)
    {
        point=3.3;
    }
    if(marks>=90 && marks<=92)
    {
        point=3.7;
    }
    if(marks>=93 && marks<=100)
    {
        point=4.0;
    }

    return point;

}


int main()
{
    student_login();
    return 0;
}

void cgpa_calulate()
{

    int course;
    printf("Enter your total no of course\n");
    scanf("%d",&course);


    int total_credit=0;
    float total_point=0;
    for(int i=0; i<course; i++)
    {
        system("cls");
        printf("Course No: %d\n",i+1);
        gets(stdin);
        printf("Course Name : \n");
        gets(obj[i].course_name);
        printf("Credit : \n");
        scanf("%d",&obj[i].credit);
        printf("Marks: \n");
        scanf("%f",&obj[i].marks);

        total_point=total_point+(four_gpa(obj[i].marks)*obj[i].credit);

        total_credit=total_credit+obj[i].credit;

        printf("\n");

    }
    float cgpa=total_point/total_credit;

    printf("Your CGPA : %.2f\n",cgpa);
    printf("Total credit Completed :%d\n\n",total_credit);

    printf("Want to write this information to file?\n1.yes\n2.NO\n");
    int option;
    scanf("%d",&option);
    if(option==1)
    {
        FILE *file;

        char ext[]="info.txt";
        strcat(current_session,ext);

        file=fopen(current_session,"a");
        char semester[100];
        gets(stdin);
        printf("Enter your Semester name: ");
        gets(semester);


        for(int i=0; i<course; i++)
        {
            fprintf(file,"Course Name: %s   ",obj[i].course_name);
            fprintf(file,"Marks:   %.2f   ",obj[i].marks);
            fprintf(file,"Credits:   %d\n",obj[i].credit);


        }

        fprintf(file,"\nSemester Name: %s\nCGPA :%.2f\nTotal Credit Completed : %d\n\n",semester,cgpa,total_credit);
        fprintf(file,"----------------------------------------------------------\n");
        fclose(file);

        printf("File Successfully Saved\n");

    }


}
void logout()
{
    strcpy(current_session," ");
    gets(stdin);
    student_login();

}


void delete_history()
{

    printf("Are you sure?\n1.yes\n2.No");
    int option;
    scanf("%d",&option);
    if(option==1)
    {

        FILE *file3;

        char ext[]="info.txt";
        strcat(current_session,ext);
        file3=fopen(current_session,"w");
        fclose(file3);
    }
    else
    {
        exit(1);
    }



}
void view_history()
{
    FILE *file2;

    char ext[]="info.txt";
    strcat(current_session,ext);

    file2=fopen(current_session,"r");


    char string[150];

    if(fgets(string,150,file2)==NULL)
    {
    system("cls");
    printf("No Data Available\n");
    }


    while(fgets(string,150,file2)!=NULL)
    {

        printf("%s",string);
    }

    fclose(file2);


}


void std_portal()
{

    int course;
    FILE *file;

    file=fopen(current_session,"r");
    char name[20];
    fscanf(file,"%s",name);
    printf("\t\tWelcome %s\n",name);
    printf("1.Calculate CGPA\n");
    printf("2.View History\n");
    printf("3.Delete all History\n");
    printf("4.Log Out\n");
    printf("5.EXIT\n");

    int option;
    scanf("%d",&option);
    switch(option)
    {

    case 1:
    {
        cgpa_calulate();
    }
    break;

    case 2:
    {
        view_history();
        break;
    }
    case 3:
    {
        delete_history();
        break;

    }
    case 4:
    {
        logout();
        break;

    }
    case 5:
    {
        exit(0);
        break;

    }
    }


}

void student_login()
{
    char mail[100];


    printf("Enter your mail: \n");
    gets(mail);
    strcpy(current_mail,mail);

    char ext[]=".txt";
    strcat(mail,ext);



    FILE *file;
    file=fopen(mail,"r");

    if(file==NULL)
    {
        printf("\n\nYou arent Registered yet\n");
        printf("1.Sign UP\n");
        printf("2.Exit\n");
        int option;
        scanf("%d",&option);
        if(option==1)
        {
            signUp();
        }
        else
        {
            exit(0);
        }
    }

    else
    {
        char f[122],fetch_pass[100];
        fscanf(file,"%s %s %s",f,f,fetch_pass);
        fclose(file);

        char password[20];
        printf("Enter password: \n");
        gets(password);
        if(strcmp(fetch_pass,password)==0)
        {


            strcpy(current_session,mail);


            std_portal();

        }
        else
        {

            printf("Pass incorrect\n");
            exit(0);
        }





    }





}
