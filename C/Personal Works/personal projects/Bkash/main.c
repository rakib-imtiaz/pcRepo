#include <stdio.h>
#include <stdlib.h>
#include<string.h>
//#include <dos.h>

void log_in_panel();
void main_menu();
void sendMoney();
void sendMoney_To_NonUser();
void Mobile_Recharge();
void Payment();
void Cash_Out();
void Pay_Bill();
void App_Registration();
void My_bkashn();
void Helpline();
void transaction_history();

void registration();
void try_again_animation();
int if_id_exists(int target_id);
int password_fetcher(char *name[200]);
double fetch_balance(char *balance_file_name[] );
void balance_session_generator();
void transaction(float amount);
void balance_session_generator();
void set_balance_to_global_and_file(float balance);
void recharge();



typedef struct User_info data;

struct User_info{
    int  phone_number;
    char name[50];
    long long int national_id;
    char Dob[100];
    int password;
    float balance;





};

 //data info.balance=1000;//globally defined data for new user;

char id_session[100];//  variable containing the file name of the current user
char balance_session[500];// varibale containning the balance file name of the current user
float global_balance;//current balance;

    int setUp_num=12345678;
    int setUp_pass=12345;
    int pass,num;

int main()
{


log_in_panel();


return 0;
}

void log_in_panel()
{
    int id,inputed_pass,fetched_pass;
printf("\t\t\t\t\t*****LOG IN PANEL***** \n\n\n");

    printf("Enter your number:\n+880");
    scanf("%d",&id);


    int pswrd_inputing_attempt=3;


    while(pswrd_inputing_attempt!=0)
    {
         if(if_id_exists(id))
            {


                printf("Enter your password:\n");
                scanf("%d",&inputed_pass);
               // printf("pass: %d\n",inputed_pass);
               // puts(id_session);

                int fetched_pass=0;
                fetched_pass=password_fetcher(id_session);

                if(inputed_pass==fetched_pass)
                {
                main_menu();

                }
                else{
                    printf("Incorrect password!\n");
                    pswrd_inputing_attempt--;
                    printf("\n%d Attempt left\n",pswrd_inputing_attempt);
                    sleep(1);
                    system("cls");
                    system("color 4F");

                    try_again_animation();
                    system("color 0F");





                    }
    }
              else{
                    int option;
                system("color 0F");
                printf("you aren't registered yet\n\n\n1.REGISTER/SIGN UP\n\n2.Exit\n");
                scanf("%d",&option);
                if(option==1)
                {
                    registration();
                }
                else{
                    exit(0);
                }
}

}
    system("cls");
    printf("Too many attempts...");
    sleep(2);
    exit(0);



}


int password_fetcher(char *name[200])
{
    FILE *file;

    int a,b,c,password;
    int store;

    file=fopen(name,"r");
    fscanf(file,"%s %d %s %d",&a,&b,&c,&password);
    return password;
    fclose(file);



}




void registration()
{
    system("cls");
    data info;
     int flag=1,pass,confirm_pass;
   // fflush(stdin);
    FILE * file;
    char file_name[100];
    char balance_file_name[100];
    char balance[50]={"Balance_"};
    char txt_extension[50]={".txt"};


    fflush(stdin);

    printf("\t\t\t\t\t*****REGISTRATION*****\n");

    printf("Enter your name: ");
    gets(info.name);
    printf("\n");
    printf("NID NO : ");
    scanf("%lld",&info.national_id);
    printf("\n");

    getchar();
    printf("phone Number: ");
    scanf("%d",&info.phone_number);
    getchar();
    printf("\n");

    printf("Date of Birth: (DD/MM/YYYY)\n");
    scanf("%s",info.Dob);

    int temp=info.phone_number;


    //system("cls");


    itoa(temp,file_name,10);// converting integer to string
    strcat(file_name,txt_extension);
    strcpy(balance_file_name,file_name);// adding a separate balance sheet for individual id
    strcat(balance,balance_file_name);
    strcpy(balance_file_name,balance);// adding a separate balance sheet for individual id
    //adding the .txt extention
   // printf("%s\n",file_name);
    printf("%s\n",balance_file_name);

    strcpy(balance_session,balance_file_name);// copying the balance_file_name to a global variable;


    while(flag)
    {
        printf("Enter 4 Digit Pin:");
        scanf("%d",&pass);
        printf("Confirm your Pin:");
        scanf("%d",&confirm_pass);
         if( pass == confirm_pass)
            {
                info.password=pass;
                file=fopen(file_name,"w");
                fprintf(file,"%s %lld %s %d\n",info.name,info.national_id,info.Dob,info.password);
                fclose(file);
                file=fopen(balance_file_name,"w");
                fprintf(file,"%f",info.balance);
                fclose(file);


                flag=0;



            }
            else{
                //system("cls");
                system("color 4F");
                printf("Incorrect pass!\n");
                try_again_animation();

               }
        }

        printf("Registration Successful!\n");




}


void main_menu()
{
        system("cls");
       printf("Logged in successfully\n");
            system("color 10");
            sleep(1);
            system("color 2F");
            sleep(1);
            system("color 60");
            sleep(1);
            system("color 3F");
            sleep(1);
            system("color F1");
            system("cls");
        printf("\n***Welcome To Bkash***\n\n");

        int option;

        set_global_balance_from_file();
        printf("1.Send Money\n2.Mobile Recharge\n3.Cash Out\n4.Check Balance\n5.Helpline\n6.Transaction History\n7.Logout\n\n");
        printf("Enter your option\n");
        scanf("%d",&option);

        switch(option)
        {
        case 1:
            {
                system("cls");
                system("color F1");
                sendMoney();
                break;
            }

        case 2:
            {
                recharge();
                 break;
            }
        case 3:
            {   cash_out();
                break;
            }
        case 4:
            {
                check_balance();

                break;
            }
       case 5:
            {
                printf("Helpline\nPlease contact\n\nMohammad Noman\nFounder and CEO of Bkash\n\nThank You for Being With Us.\n");
                break;
            }
       case 6:
            {
                transaction_history();
                break;
            }
       case 7:
            {
                log_out();
                break;
            }

        }
}



void sendMoney()

{

                int amount,reference,num;
                printf("\nSend Money\n\n");
                printf("Enter Receiver Bkash Account No:\n");
                scanf("%d",&num);
                printf("Enter Amount:\n");
                scanf("%d",&amount);

                transaction(amount);
                printf("Enter reference\n");
                scanf("%d",&reference);
                printf("Send Money.\n");
                printf("To:0%d\n",num);
                printf("Amount:Tk %d\n",amount);
                printf("Reference:%d\n",reference);

                printf("Enter Menu PIN to confirm:\n");
                scanf("%d",&pass);

                 if(pass==password_fetcher(id_session))
                 {
                      printf("Send Money Tk %d to 0%d Successful Ref %d. \n",amount,num,reference);
                 }
                 else
                 {
                     printf("Incorrect Password...Please Try Again");
                 }




}









void cash_out()
{
int amount,reference,num;
                printf("\nCash out\n\n");
                printf("Enter Receiver Number:\n");
                scanf("%d",&num);
                printf("Enter Amount:\n");
                scanf("%d",&amount);

                transaction(amount);
                printf("Cash Out.\n");
                printf("To:0%d\n",num);
                printf("Amount:Tk %d\n",amount);
                printf("Enter Menu PIN to confirm:\n");
                scanf("%d",&pass);

                 if(pass==password_fetcher(id_session))
                 {
                      printf("Send Money Tk %d to 0%d Successful Ref %d. \n",amount,num,reference);
                 }
                 else
                 {
                     printf("Incorrect Password...Please Try Again");
                     cash_out();
                 }






}

void try_again_animation()
{

                printf("Try again in \n");
                sleep(1);
                printf("3..");
                sleep(1);
                printf("2..");
                sleep(1);
                printf("1...");
                system("cls");
}


int  if_id_exists(int target_id)
{

    char file_name[100];
    char txt_extension[5]={".txt"};
    itoa(target_id,file_name,10);// converting integer to string
    strcat(file_name,txt_extension);//adding the .txt extention
    strcpy(id_session,file_name);// copying the file_name containing the id name to a globally declared id_session variable
    balance_session_generator();



    FILE *file;
    if ((file = fopen(file_name, "r")))
    {
        balance_session_generator();

        fclose(file);

        return 1;
    }



    return 0;







}


void transaction(float amount)
{
    if(global_balance<amount)
    {
        printf("In sufficicent fund!\n");
        printf("1.Go Back\n2.Exit");
        int option;
        if(option==1)
        {
            main_menu();
        }
        else{

            exit(0);
        }


    }

    else{

        float temp;
        temp=global_balance-amount;
        set_balance_to_global_and_file(temp);
        }
}


void log_out()
{
    //puts(id_session);
    strcpy(id_session,"0");
    //puts(id_session);
    log_in_panel();



}
void set_global_balance_from_file()
{
        float get_balance;
         FILE * file;
         file=fopen(balance_session,"r");
         fscanf(file,"%f",&get_balance);
         global_balance=get_balance;
         fclose(file);


}



void balance_session_generator()
{

    char bln[200]={"Balance_"};
    strcat(bln,id_session);
   strcpy(balance_session,bln);
}
void set_balance_to_global_and_file(float balance)
{
    FILE * file;
    file=fopen(balance_session,"w");
    fprintf(file,"%f",balance);
    fclose(file);
    global_balance=balance;


}
void check_balance()
{
    printf("Your Current balance is : %.2f",global_balance);

}

void recharge(){

                        int amount,num,option;
                        printf("Welcome To Bkash Mobile Recharge\n");

                        printf("1.Prepaid\n2.Postpaid\n\n");
                        printf("Enter your option\n");
                        scanf("%d",&option);

                        printf("Enter Mobile No:\n");
                        scanf("%d",&num);

                        printf("Enter Recharge Amount:\n");
                        scanf("%d",&amount);
                        transaction(amount);


                        printf("Bkash Mobile Recharge\n");
                        printf("To:0%d\n",num);
                        printf("Amount:Tk %d\n",amount);

                        printf("Enter Menu PIN to confirm:\n");
                        scanf("%d",&pass);

                    if(pass==password_fetcher(id_session))
                        {
                    printf("Send Money Tk %d to 0%d Successful\n",amount,num);
                        }
                    else
                    {
                     printf("Incorrect Password...Please Try Again");
                    }


}


void transaction_history()
{


}
