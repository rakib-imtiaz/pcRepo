#include <stdio.h>

struct Customer
{

    int Accountnumber;
    char Name[100];
    double Balance;
} customers[200];

int main()
{
    int n;
    printf("Enter n: ");
    scanf("%d",&n);

    for(int i=0; i<n; i++)
    {

        printf("name : ");
        gets(customers[i].Name);
        printf("Account number : ");
        scanf("%d",&customers[i].Accountnumber);
        printf("Balance : ");
        scanf("%lf",customers[i].Balance);

    }



    lowBalance(n);

    int acc;
    printf("Enter acc number : ");
    scanf("%d",&acc);
    printf("Enter balance to withdraw : ");
    double balance;
    scanf("%lf",&balance);

    WithdrawalStatus(acc,balance,n);

    return 0;
}

void lowBalance(int n)
{

    for(int i=0; i<n; i++)
    {
        if(customers[i].Balance<100)
        {
            printf("Account number : %d\n",customers[i].Accountnumber);
            printf("Name :  %s\n",customers[i].Name);

        }
    }

}

void WithdrawalStatus (int accNUmber,int amount,int n)
{

    for(int i=0; i<n; i++)
    {
        int flag=customers[i].Balance-amount;

        if(flag>100 && customers[i].Accountnumber==accNUmber)
        {
            printf("Cheers! You’re eligible to withdraw %d TK from your account\n",amount);

        }
        else
        {
            printf("Sorry! You’re not eligible to withdraw %d TK from your account",amount);
        }
    }

}
