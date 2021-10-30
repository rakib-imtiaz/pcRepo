#include <stdio.h>

#include <stdlib.h>

int main()
{

    char name[20],blood[5];
    int age;
    int number;
    int birth_month,birth_day,birth_year;
    int inputed_pass,imported_pass,x,prev_pass,new_pass,new_pass1,pass;
    FILE*file;



    file=fopen("Information.txt","r");
    if(file==NULL)
    {


        printf("Currently you are not an user!\n\nPlease SignUp first.\n");
        printf(" _ _ _ _ _ _\n");
        printf("|           |\n");
        printf("|  sign up  |\n");
        printf("|_ _ _ _ _ _|\n\n\n");



        printf("Enter your name :\n");
       gets(name);
       fflush(stdin);
       printf("\n");
        printf("Age:\n");
       scanf("%d",&age);
        fflush(stdin);
        printf("\n");
        printf("Blood group:\n");
       gets(blood);
        fflush(stdin);
        printf("\n");
        printf("Phone Number\n");
       scanf("%d",&number);
        fflush(stdin);
        printf("\n");

        printf("Birth year: ");
       scanf("%d",&birth_year);
       fflush(stdin);
       printf("\n");

        printf("Birth month(1-12):");
       scanf("%d",&birth_month);
        fflush(stdin);
        printf("\n");

        printf("Birth day: ");
       scanf("%d",&birth_day);



       FILE*file=fopen("Information.txt","a");
       fprintf(file,"%s %d %s %d\n",name,age,blood,number);
       fclose(file);

      file=fopen("Birthday.txt","a");
      fprintf(file,"%d %d %d \n",birth_day,birth_month,birth_year);
      fclose(file);
      system("cls");
      printf("\n\n\nCongratulations %s!\n\nYou've successfully signed up\n",name);





    }

    else{


    //start

    printf("1.Log in\n\n");
    printf("2.change password\n\n");
    printf("3.Birthdays\n\n");
    printf("4.exit\n");
    scanf("%d",&x);
    system("cls");

if(x==2)
{
    goto change_password;
}
switch(x)
{
case 1://login


    {

    FILE*file=fopen("password.txt","r");

    if(file==NULL)
    {
        printf("password does not exist!\ncreate a new one!\n");
         file=fopen("password.txt","w");
         scanf("%d",&pass);
         fprintf(file,"%d",pass);
         printf("password sucessfully created!\n");
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
            char show_name[20];

        file=fopen("Information.txt","r");
        fscanf(file,"%s",&show_name);

        printf("welcome %s!\n\n",show_name);


        printf("1.Search the day of a specific Date\n");
        printf("2.calender\n");
        printf("3.profile\n");
        printf("4.exit\n");
        int y;
        scanf("%d",&y);

        switch(y)
        {


         case 1: //search
    {

    int year,month,day;
    system("cls");
    printf("Search your date and get the result!\n\n\n");
    printf("Enter year:");
    scanf("%d",&year);
    printf("Enter month(1-12):");
    scanf("%d",&month);
    printf("Enter day:");
    scanf("%d",&day);

   int day_name=zellens_algorithm(day,month,year);

   month_printer(month);
   printf(" %d,%d is ",day,year);
   day_printer(day_name);
   printf("\n");
   int a;

   printf("\n\n\nwant to see the full calender?\n1.yes\n2.no\n");
   scanf("%d",&a);

   if(a==1){
       system("cls");
   printf("Calender for ");
   month_printer(month);
   printf(" %d",year);

   printf("\n\n\n");

   printf("\tSat\tSun\tMon\tTue\tWed\tThu\tFriday\n");
   calender(month,year);
   printf("\n\n\n");
   return 0;
   }

   else{
    printf("Thank you\n");
    }

    break;
}


         case 2:
            {

    int year,month,day;
    system("cls");
    printf("Enter year:");
    scanf("%d",&year);
    printf("Enter month(1-12):");
    scanf("%d",&month);
    printf("Enter day:");
    scanf("%d",&day);

   int day_name=zellens_algorithm(day,month,year);

   month_printer(month);
   printf(" %d,%d is ",day,year);
   day_printer(day_name);
   printf("\n");
   printf("Calender for %d %d\n",month,year);
   printf("\n\n\n\n");

   printf("\tSat\tSun\tMon\tTue\tWed\tThu\tFriday\n");
   calender(month,year);
   printf("\n\n\n\n");
    return 0;

//end of case 2
}

         case 3:
            {

     file=fopen("Information.txt","r");
     fscanf(file,"%s %d %s %d\n",&name,&age,&blood,&number);
     system("cls");
     printf("\t\t\t\t\t\tProfile page\n");

    printf("Name=%s\n\nAge=%d\n\nBlood group=%s\n\nphone number:0%d\n",name,age,blood,number);

    fclose(file);

    file=fopen("Birthday.txt","r");
    fscanf(file,"%d %d %d \n",&birth_day,&birth_month,&birth_year);
    printf("\nBirthday: %d/%d/%d",birth_day,birth_month,birth_year);
    fclose(file);
    return 0;

    break;
            }
         case 4:
            {

                break;
            }


            }
        }// end of switch y;

    }


change_password:
    {




    file=fopen("password.txt","r");
    if(file==NULL)
    {
        printf("password does not exist!\n please create a password first!\n ");
    }
    else
    {
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
               return 0;
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

}

birthdays:
    {
        printf("1.Add friends and family?");
        printf("2.view birthdays");
        int k;
        char name[40];
        switch(k){
    case 1:
        {
        printf("Enter your name :\n");
       gets(name);










              }//case1


        }//switch


    }
//case 3 switch x;
}
    }


    }


 return 0;
    }





//user Defined Functions

int zellens_algorithm(int q ,int m , int y)
{
    if(m==1 || m==2)
    {
        y=y-1;
    }

    int f1=((26*(m+1))/10);
    int f2=y/4;
    int f3=6*(y/100);
    int f4=y/400;

    int h=((q+f1+y+f2+f3+f4)%7);


    return h;


}

void day_printer(int day)
{
    switch(day)
    {
    case 0:
        printf("Saturday");
        break;

    case 1:
        printf("Sunday");
        break;

    case 2:
        printf("Monday");
        break;

    case 3:
        printf("Tuesday");
        break;

    case 4:
        printf("Wednesday");
        break;

    case 5:
        printf("Thursday");
        break;
    case 6:
        printf("Friday");
        break;

        }
    }





void month_printer(int month)
{
    switch(month)
    {
    case 1:
        printf("January");
        break;

    case 2:
        printf("February");
        break;

    case 3:
        printf("March");
        break;

    case 4:
        printf("April");
        break;

    case 5:
        printf("May");
        break;

    case 6:
        printf("June");
        break;
    case 7:
        printf("July");
        break;
    case 8:
        printf("August");
        break;
    case 9:
        printf("September");
        break;
    case 10:
        printf("October");
        break;
    case 11:
        printf("November");
        break;
    case 12:
        printf("December");
        break;

        }
    }

void calender(int month,int year)
{
    int slot[40],k=1,l=1;
    for(int i= 1; i<=31;i++)
    {
        slot[k]=i;
        k++;
    }



int trigger=zellens_algorithm(1,month,year)+1;




    if(month==4 || month==6 || month==9 || month==11 )
    {
          //this is the part for swithing


  for (int i=1; i<=30+trigger;i++)

            {

                if(i<trigger)
                {
                    printf("\t");
                }
                else{

                printf("\t%d",slot[l]);
                l++;
                if(i%7==0)
                    {
                    printf("\n");

                    }
            }


                }





}    else if(month==2)
    {
for (int i=1; i<=28+trigger;i++)

            {
                if(i<trigger)
                {
                    printf("\t");
                }
                else{

                printf("\t%d",slot[l]);
                l++;
                if(i%7==0)
                    {
                    printf("\n");

                    }
            }


                }









}    else
        {


 for (int i=1; i<=30+trigger;i++)

            {
                if(i<trigger)
                {
                    printf("\t");
                }
                else{

                printf("\t%d",slot[l]);
                l++;
                if(i%7==0)
                    {
                    printf("\n");

                    }
            }


                }





}

}

