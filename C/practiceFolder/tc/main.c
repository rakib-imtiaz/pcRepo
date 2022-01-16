#include <stdio.h>
#include <stdlib.h>
// Write a C program to print the first n perfect ns where n is an input.

int main()
{
    int n;

    printf("Enter n: ");
    scanf("%d",&n);


    printf("Perfect Numbers are: \n");

    for(int i=0; n!=0; i++)
    {

        if(isPerfectNumber(i)==1)
        {
            printf("%d \n",i);
            n--;
        }

    }





    return 0;
}
int isPerfectNumber(int n)
{

    int sum=0;

    for(int i = 1 ; i < n ; i++)
    {
        if(n % i == 0)
            sum = sum + i ;
    }

    if (sum == n)
    {
        return 1;
    }
    else
    {
        return 0;

    }

    return 0 ;
}

