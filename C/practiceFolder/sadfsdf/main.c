#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main()
{

int n=3;


    int arr[n][n];

    for(int i=0; i<n; i++)
    {

        for(int j=0; j<n; j++)
        {
            arr[i][j]=generateRandomNumber();
            printf("%d ",arr[i][j]);

        }
        printf("\n");
    }


    for(int i=0; i<n; i++)
    {

        for(int j=0; j<n; j++)
        {
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }


    return 0;
}

int generateRandomNumber()
{

    srand(time(NULL));
    int max=100;
    int min=1;
    int n;
    n = rand() % (max - min + 1) + min;
    return n;
}
