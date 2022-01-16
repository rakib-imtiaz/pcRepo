#include <stdio.h>
#include <stdlib.h>

int checkNiven(int num)
{

    int sum=0;
    int rem=0;
    int temp=num;

    while(num!=0)
    {

        rem=num%10;
        sum=sum+rem;
        num=num/10;
    }

    if(temp%sum==0)
    {

    printf("Sum : %d and Niven Numbers is : ",sum);

        return 1;

    }
    else
    {

        return 0;
    }



}
int main()
{


int a,b;
printf("Enter the Starting Number for printing Niven numbers: ");
scanf("%d",&a);
printf("Enter the ending Number for printing Niven numbers: ");
scanf("%d",&b);

    for(int i=b; i>a; i--)
    {
        if(checkNiven(i)==1)
        {
            printf("%d \n",i);
        }


    }


    return 0;
}
