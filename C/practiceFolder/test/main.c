#include <stdio.h>

int main()
{

    int number;

    do
    {
        printf("Enter postive integer (or 0) to terminate : ");
        scanf("%d",&number);
        if(number<0)
        {
            continue;
        }
        else
        {
            printf("The sum of Digits for %d is %d\n",number,sum_digits(number));
        }



    }
    while(number!=0);
    return 0;


}

int sum_digits(int n)
{
    int temp=n;

    int rem=0;

    int sum=0;
    while(temp!=0)
    {
        rem=temp%10;
        sum=sum+rem;
        temp=temp/10;

    }


    return sum;

}
