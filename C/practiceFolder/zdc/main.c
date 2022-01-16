#include <stdio.h>

int main()
{
    int userInputArray[10];
    int newArray[10]= {0};
    int n=10;


    printf("Please Enter Value not less than 2 and please dont repeat values :\n");
    takeInput(userInputArray,n);
    primeStorer(userInputArray,newArray,n);


    printf("Max prime: %d",getMaxPrime(newArray,n));


    return 0;
}

void takeInput(int userInputArray[],int n)
{



    for(int i=0; i<n; i++)
    {

        printf("%d. ",i+1);
        scanf("%d",&userInputArray[i]);

    }






}


int getMaxPrime(int newArray[],int n)
{
    int max=newArray[0];

    for(int i=0; i<n; i++)
    {
        if(newArray[i]>max)
        {
            max=newArray[i];
        }
    }

    return max;

}

void primeStorer(int userInputArray[],int newArray[],int n)
{

    int elements=0;



    for(int i=0; i<n; i++)
    {

        if(is_prime(userInputArray[i])==0)
        {

            newArray[elements]=userInputArray[i];
            elements++;
        }

    }





}
int is_prime(int n)
{
    int i;
    for(i=2; i<=n/2; i++)
    {
        if(n%i!=0)
        {
            continue;
        }
        else
            return 1;
    }
    return 0;
}
