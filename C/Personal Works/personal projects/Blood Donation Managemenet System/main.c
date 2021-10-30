#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Information
{
   char name[20];
   int age;
   char blood[5];
   char phone_number[20];
   char last_date[20];
   int serial;


};
void Homepage();

void admin_login();
void change_password();
void admin_portal();
void donar_registration();
void delete_dataBase();
void check_whom_you_can_donate();
void donation_eligibility();
void search_donor();
void display_all_info();









int main()
{
    Homepage();
}





void Homepage()
{
        system("cls");
        printf("1.Administrator panel\n");
        printf("2.Search a Donor\n");
        printf("3.Display all existing Donors Information\n");
        printf("4.Test your eligibility for donating blood\n");
        printf("5.Check whom you can donate blood\n");
        printf("6.Exit\n");
        printf("enter your option no:\n");
        int option;
        scanf("%d",&option);
        system("cls");

      switch(option)
      {
          case 1:{

            admin_login();

        break;

        }
        case 2:{
            search_donor();

        break;

        }
        case 3:{

            display_all_info();

        break;

        }
        case 4:{

            donation_eligibility();
        break;

        }
        case 5:{

            check_whom_you_can_donate();
        break;

        }
        case 6:{

            exit(1);

            break;

        }
        default: {

            printf("Incorrect Option!\nTry again...\n");
            Homepage();

        }

    }



}

/*
this function will open the password.txt file and it will rewrite the new password in that file
but before changing the old password,it will ask the user for entering the old password,after verifying the odl passowrd it will
tale
*/

void change_password()
{
    system("cls");

    int imported_pass,prev_pass,new_pass1,new_pass;
    FILE*file=fopen("password.txt","r");



        printf("enter your old password:\n");
        scanf("%d",&prev_pass);

        fscanf(file,"%d",&imported_pass);
        if(prev_pass==imported_pass)
        {
            printf("enter your new password:\n");
            scanf("%d",&new_pass);
            printf("Retype the password again:\n");
            scanf("%d",&new_pass1);
            if(new_pass==new_pass1)
            {
               file=fopen("password.txt","w");
               fprintf(file,"%d",new_pass);
               printf("your password has sucessfully changed!\n");
               fclose(file);
            }
            else
            {
                printf("password does not matched!\n");
            }
        }
         else
         {
           printf("your old password is incorrect!\n");
         }
}




/*

after verifying the password,the program will let the admin to add an donar data to the file
and the 2nd option will erase all the donar data from the database

*/

void admin_portal()
{
    system("cls");

    int pass,inputed_pass,imported_pass;
    FILE *file;
    file=fopen("password.txt","r");

    if(file==NULL)
    {
        printf("password does not exist!\ncreate a new one!\n");
         file=fopen("password.txt","w");
         scanf("%d",&pass);
         fprintf(file,"%d",pass);
         printf("password successfully created!\n");
         fclose(file);
    }

    else
    {
        printf("please enter your password:\n");
        scanf("%d",&inputed_pass);
        fscanf(file,"%d",&imported_pass);

        if(inputed_pass==imported_pass)
        {
            system("cls");
        printf("1.Add a new Donor\n");
        printf("2.Delete of whole Donor data base\n");
        printf("3.exit\n");


        int option;
        scanf("%d",&option);

        switch(option)
        {
            case 1:{

            donar_registration();

            break;
            }

            case 2:{

            delete_dataBase();

            break;
            }
        }
        }
        else{

            printf("Incorrect Password\n");
            printf("try again\n");
            sleep(1);
            admin_portal();
        }


}
}


/*
this part will register the donar data into the file
strutcure hasbeen used to take the inputs and store them into file

*/

void donar_registration()
{
    system("cls");
    struct Information donor;
    int n=1;

    FILE*file=fopen("Information.txt","a");
    gets(stdin);

    while(n!=2)
    {

        printf("Donor name :\n");
        gets(donor.name);

        printf("Age:\n");
        scanf("%d",&donor.age);
        gets(stdin);


        printf("Blood group:\n");
        gets(donor.blood);

        printf("Phone Number\n+88");
        gets(donor.phone_number);

        printf("Last date of donation:\n");
        gets(donor.last_date);

        printf("Donor serial no:\n");
        scanf("%d",&donor.serial);
        gets(stdin);

       fprintf(file,"%s %d %s %s %s %d\n",donor.name,donor.age,donor.blood,donor.phone_number,donor.last_date,donor.serial);
       printf("continue?\n1.Yes\n2.No\n");
       scanf("%d",&n);
       gets(stdin);
       printf("\n\n");

    }
    printf("file successfully saved!\n");
    fclose(file);



}
/*
simply open the file in write mode to delete all the data from database

*/
void delete_dataBase()
{
    system("cls");
    int sure;
    FILE*file;

    printf("Are you sure?\n1.yes\n2.No\n");
    scanf("%d",&sure);

    if(sure==1)
    {
        file=fopen("Information.txt","w");
        fclose(file);
        printf("Whole data base deleted successfully\n");
    }
    else{

        exit(1);
    }




}

/*

admin can login by giviing the passowrd
*/

void admin_login()
{
            system("cls");
            printf("1.Log in\n\n");
           printf("2.Change password\n\n");
           printf("3.exit\n");
           int option;
           scanf("%d",&option);
           switch(option)
           {
               case 1:{

                   admin_portal();

               break;
               }

               case 2:{

                   change_password();

               break;
               }
           }


}
/*

this function will tell the user to what bloood group people they can donate the blood to

*/
void check_whom_you_can_donate()
{
        system("cls");
        int blood;
        printf("Enter your blood group from below:\n");
        printf("1.A+\n2.A-\n3.B+\n4.B-\n5.o+\n6.o-\n7.AB+\n8.AB-\n");
        scanf("%d",&blood);
        switch(blood)
        {
             case 1:
        {
            printf("you can donate to A+ and Ab+ patients\n ");
        }
        break;
        case 2:
        {
            printf("you can donate to A+,AB+,A- and AB- patients\n ");
        }
        break;
    case 3:
        {
            printf("you can donate to B+ and AB+ patients\n ");
        }
        break;
    case 4:
        {
            printf("you can donate to B+,B-,AB+and AB- patients\n ");
        }
        break;
    case 5:
        {
            printf("you can donate to A+,B+,O+ and AB+ patients\n ");
        }
        break;
    case 6:
        {
            printf("you are an universal donor\n ");
        }
        break;
    case 7:
        {
            printf("you can donate to AB+ patients\n ");
        }
        break;
    case 8:
        {
            printf("you can donate to AB+ and AB- patients\n ");
        }
        break;
        }



}


/*
by calculating the given condition the function will tell if the user is eligible to donate blood or not

*/

void donation_eligibility()
{
    system("cls");
        int age,weight;
        float height;

       printf("enter your age\n");
       scanf("%d",&age);

       printf("Enter your weight(in kg)\n");
       scanf("%d",&weight);

       printf("enter your height (in ft) \n");
       scanf("%f",&height);

       if(age>17 && height>5.1 && weight>45)
       {
        printf("you are eligible for donating blood");
       }
       else{

        printf("You are not Eligible\n");
       }




}

/*
this function will seacrh the donar data by given seacrh field,and display it to the console
*/

void search_donor()
{
    system("cls");
    int c;
    struct Information donor;
    FILE*file=fopen("Information.txt","a");

    printf("1.search by Name:\n");
    printf("2.search by Blood group\n");
    scanf("%d",&c);
    gets(stdin);
switch(c)
{
 case 2:

  {
     file=fopen("Information.txt","r");
    char blood1[20];
    int compare;
    printf("enter the blood group you want to search:\n");
    scanf("%s",blood1);

    int i=0;
    while(fscanf(file,"%s %d %s %s %s %d\n",donor.name,&donor.age,donor.blood,donor.phone_number,donor.last_date,&donor.serial)!=EOF)
    {
        compare=strcmp(blood1,donor.blood);
        if(compare==0)
        {
            printf("Person No: %d\nName:\t\t\t\t%s\nAge:\t\t\t\t%d\nBlood group:\t\t\t%s\nPhone number:\t\t\t%s\nLast date of donation:\t\t%s\nSerial no:\t\t\t%d\n\n\n",i+1,donor.name,donor.age,donor.blood,donor.phone_number,donor.last_date,donor.serial);
            i++;

        }


    }
 fclose(file);
break;
  }

 case 1:
    {
    file=fopen("Information.txt","r");
    char name1[20];
    int compare2;
    printf("enter the name you want to search:\n");
    scanf("%s",name1);

    while(fscanf(file,"%s %d %s %s %s %d\n",donor.name,&donor.age,donor.blood,donor.phone_number,donor.last_date,&donor.serial)!=EOF)
    {
        compare2=strcmp(name1,donor.name);
        int i=0;
        if(compare2==0)
        {
            printf("\nPerson No: %d\nName:\t\t\t\t%s\nAge:\t\t\t\t%d\nBlood group:\t\t\t%s\nPhone number:\t\t\t%s\nLast date of donation:\t\t%s\nSerial no:\t\t\t%d\n\n\n",i+1,donor.name,donor.age,donor.blood,donor.phone_number,donor.last_date,donor.serial);
            i++;

        }


    }
 fclose(file);

break;
    }

}
}

/*
this function will display all information stored in the file
*/


void display_all_info()
{
    system("cls");

    struct Information donor;

    FILE *file=fopen("Information.txt","r");
    if(file==NULL)
    {
        printf("Cant open file\n");
    }
    int i=0;

    while(fscanf(file,"%s %d %s %s %s %d\n",donor.name,&donor.age,donor.blood,donor.phone_number,donor.last_date,&donor.serial)!=EOF)
        {
            printf("\nPerson No: %d\nName:\t\t\t\t%s\nAge:\t\t\t\t%d\nBlood group:\t\t\t%s\nPhone number:\t\t\t%s\nLast date of donation:\t\t%s\nSerial no:\t\t\t%d\n\n\n",i+1,donor.name,donor.age,donor.blood,donor.phone_number,donor.last_date,donor.serial);
            i++;

}
 fclose(file);


}
