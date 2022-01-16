#include <stdio.h>
#include <stdlib.h>

int main()
{

    int flag=1,arr[5];
    for(int i=0; i<5; i++)
    {
        scanf("%d",&arr[i]);
    }
    int minimum=arr[0];

    for(int i=0; i<5; i++)
    {
        if(arr[i]<minimum)
        {
            minimum=arr[i];
        }

    }

    checkDivisor(arr,5,minimum);

    return 0;
}

void checkDivisor(int arr[],int n,int number)
{

    int flag=0;

    int i=0;
    while( i<5)
    {
        if(arr[i]%number!=0)
        {
            flag=0;
        }
        i++;
    }

    printf("%d,",number);
    if(flag==0)
    {
        printf("strong Divisor",number);
    }
    else
    {
        printf("weak Divisor",number);
    }




}
