#include <stdio.h>

int main()
{

    int n;
    printf("Enter value of N: ");
    scanf("%d",&n);
    int row=n,col=n;

    int array[row][col];

    for(int i=0; i<row; i++)
    {
        for(int j=0; j<col; j++)
        {
            printf("Array[%d][%d]: ", i,j);
            scanf("%d",&array[i][j]);

        }
        printf("\n");
    }


int border=0;
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<col; j++)
        {


            if (i == 0 || j == 0 || i == row-1 || j == col-1)
            {
                border=border+array[i][j];
            }

        }
    }




    printf("The sum is %d",border);


}
