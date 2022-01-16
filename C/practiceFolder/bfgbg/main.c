#include<stdio.h>

int main()
{


    int arr[4][5]= {0};

    for(int i=0; i<4; i++)
    {
        for(int j=0; j<5; j++)
        {
            printf("%d %d =%d ",i,j,&arr[i][j]);
        }
        printf("\n");
    }
}
