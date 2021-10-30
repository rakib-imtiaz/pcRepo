#include <stdio.h>
#include <math.h>

void output_short_format(double loan_amount, double interest_rate, double
                         term_years);

void output_amortized(double loan_amount, double interest_rate, double
                      term_years);

void output_extra_monthy(double loan_amount, double interest_rate, double
                         term_years, double extra);


void output_extra_yearly(double loan_amount, double interest_rate, double
                         term_years, double extra);

int main()
{


    double loan;
    double interest_rate;
    double term;
    double extra;

    int choice;
    do
    {
        menu();
        scanf("%d",&choice);
        if(choice==1)
        {


            printf("Enter Loan Amount: ");
            scanf("%lf",&loan);

            printf("Interest Rate: ");
            scanf("%lf",&interest_rate);

            printf("Term : ");
            scanf("%lf",&term);
            output_short_format(loan,interest_rate,term);

        }
        else if(choice==2)
        {
            printf("Enter Loan Amount: ");
            scanf("%lf",&loan);

            printf("Interest Rate: ");
            scanf("%lf",&interest_rate);

            printf("Term : ");
            scanf("%lf",&term);
            output_amortized(loan,interest_rate,term);



        }
        else if(choice==3)
        {
            printf("Enter Loan Amount: ");
            scanf("%lf",&loan);

            printf("Interest Rate: ");
            scanf("%lf",&interest_rate);

            printf("Term : ");
            scanf("%lf",&term);

            printf("extra: ");
            scanf("%lf",&extra);
            output_extra_monthy(loan,interest_rate,term,extra);


        }
        else if(choice==4)
        {
            printf("Enter Loan Amount: ");
            scanf("%lf",&loan);

            printf("Interest Rate: ");
            scanf("%lf",&interest_rate);

            printf("Term : ");
            scanf("%lf",&term);

            printf("extra: ");
            scanf("%lf",&extra);
            output_extra_yearly(loan,interest_rate,term,extra);
        }



    }
    while(choice!=5);




    return 0;
}


void menu()
{
    system("cls");
    printf("---------------------------------------------------------------\n");
    printf("            Welcome to Mortgage Calculator \n");

    printf("---------------------------------------------------------------\n");
    printf("Enter your options from Below: \n\n");
    printf("1.Calculate Loan terms\n");
    printf("2.Amortized Schedule\n");
    printf("3.Early Payments: monthly\n");
    printf("4.Early Payments: Yearly\n");
    printf("5.exit\n");

}
void output_short_format(double loan_amount, double interest_rate, double
                         term_years)
{

    interest_rate=(interest_rate/12.0)/100.0;
    double months=term_years*12;

    double part1=pow((1+interest_rate),months);
    double part2=(pow((1+interest_rate),months)-1);
    printf("part 1: %lf\n",part1);
    printf("part 2: %lf\n",part2);

    double monthly_payment=loan_amount*interest_rate*(part1/part2);

    double total_amount=monthly_payment*months;
    double  total_interest=total_amount-loan_amount;





    system("cls");
    printf("-------------------------------------\n");
    printf("              LOAN TERMS \n");
    printf("-------------------------------------\n");
    printf("Loan Amount             :    %.lf\n",loan_amount);
    printf("Interest Rate           :    %.2lf%%\n",interest_rate*12.0*100);
    printf("Term                    :    %.lf years\n",term_years);

    printf("-------------------------------------\n");

    printf("Monthly Payment is      :    %.2lf\n",monthly_payment);
    printf("Total Interest is       :    %.2lf\n",total_interest);
    printf("Total amount paid is    :    %.2lf\n",total_amount);


}
void output_amortized(double loan_amount, double interest_rate, double
                      term_years)
{

    system("cls");


    interest_rate=(interest_rate/12.0)/100.0;
    int  months=term_years*12;


    double part1=pow((1+interest_rate),months);
    double part2=(pow((1+interest_rate),months)-1);

    double monthly_payment=loan_amount*interest_rate*(part1/part2);//1110



    double interest;
    double principal,balance,INTEREST,PRINCIPAL;
    balance=loan_amount;//150000

    int k=1;
    int yr=term_years;
    for(int i=1; i<=yr; i++)
    {


        printf("-----------------------------------------------------------------------\n");
        printf("Year   Month  Interest Principal   Balance  |  INTEREST    PRINCIPAL   \n");


        printf("-----------------------------------------------------------------------\n");
        printf("%d",i);
        for(int j=1; j<=12; j++)
        {
            interest=interest_rate*balance;

            principal=monthly_payment-interest;//1110-500=610
            balance=balance-principal;
            PRINCIPAL+=principal;
            INTEREST+=interest;
            if(balance<=0)
            {
                break;
            }


            printf("        %d      %.lf     %.lf       %.lf         %.lf         %.lf\n",k,interest,principal,balance,INTEREST,PRINCIPAL);
            k++;

        }
        printf("\n");


    }


}

void output_extra_monthy(double loan_amount, double interest_rate, double
                         term_years, double extra)
{


    system("cls");


    interest_rate=(interest_rate/12.0)/100.0;
    int  months=term_years*12;


    double part1=pow((1+interest_rate),months);
    double part2=(pow((1+interest_rate),months)-1);

    double monthly_payment=loan_amount*interest_rate*(part1/part2);//1110


    double interest;
    double principal,balance,INTEREST,PRINCIPAL;
    balance=loan_amount;//150000

    int k=1;
    int yr=term_years;
    for(int i=1; i<=yr; i++)
    {


        printf("-----------------------------------------------------------------------\n");
        printf("Year   Month  Interest Principal   Balance  |  INTEREST    PRINCIPAL   EXTRA\n");


        printf("-----------------------------------------------------------------------\n");
        printf("%d",i);
        for(int j=1; j<=12; j++)
        {
            interest=interest_rate*balance;
            principal=monthly_payment-interest;//1110-500=610
            balance=balance-(principal+extra);

            PRINCIPAL=PRINCIPAL+principal+extra;
            INTEREST+=interest;
            if(balance<=0)
            {
                break;
            }


            printf("        %d      %.lf     %.lf       %.lf         %.lf         %.lf  %.lf\n",k,interest,principal,balance,INTEREST,PRINCIPAL,extra);
            k++;

        }
        printf("\n");


    }



}


void output_extra_yearly(double loan_amount, double interest_rate, double
                         term_years, double extra)
{


    system("cls");


    interest_rate=(interest_rate/12.0)/100.0;
    int  months=term_years*12;


    double part1=pow((1+interest_rate),months);
    double part2=(pow((1+interest_rate),months)-1);

    double monthly_payment=loan_amount*interest_rate*(part1/part2);//1110


    double interest;
    double principal,balance,INTEREST,PRINCIPAL;
    balance=loan_amount;//150000

    int k=1;
    int yr=term_years;

    int EXTRA=extra;

    for(int i=1; i<=yr; i++)
    {


        printf("-----------------------------------------------------------------------\n");
        printf("Year   Month  Interest Principal   Balance  |  INTEREST    PRINCIPAL   EXTRA\n");


        printf("-----------------------------------------------------------------------\n");
        printf("%d",i);
         if(balance<=0)
            {
                break;
            }

        for(int j=1; j<=12; j++)
        {

            if(balance<=0)
            {
                break;
            }
            ///

            interest=interest_rate*balance;

            principal=monthly_payment-interest;//1110-500=610
            INTEREST+=interest;



            if(j==12)
            {

                balance=balance-(principal+extra);
                PRINCIPAL+=principal+extra;


            }
            else
            {
                balance=balance-principal;
                PRINCIPAL+=principal;
                extra=0;




            }



if(j==12)
{
extra=EXTRA;
}


            printf("        %d      %.lf     %.lf       %.lf         %.lf         %.lf  %.lf\n",k,interest,principal,balance,INTEREST,PRINCIPAL,extra);
            k++;

        }



        printf("\n");



    }



}
