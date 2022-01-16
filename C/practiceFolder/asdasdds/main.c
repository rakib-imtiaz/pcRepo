#include <stdio.h>
int main()
{
    int inp[10],filterArray[10]= {0},count=0;

    printf("Enter numbers(make sure its unique and not less than 2 :)\n ");
    int n=10;

    for(int i=0; i<n; i++)
    {
        scanf("%d",&inp[i]);

    }



    for(int i=0; i<n; i++)
    {

    int a=prime(inp[i]);
        if(a==0)
        {

            filterArray[count]=inp[i];
            count++;
        }

    }


    int highest=filterArray[0];

    for(int i=0; i<n; i++)
    {
        if(filterArray[i]>highest)
        {
            highest=filterArray[i];
        }
    }

    printf("Highest prime : %d",highest);


    return 0;
}


int prime(int n)
{
    int i=2;
    while(i<=n/2)
        for(i=2; i<=n/2; i++)
        {
            if(n%i!=0)
            {
                continue;
            }
            else
            {
                return 1;
            }
            i++;
        }
    return 0;
}
