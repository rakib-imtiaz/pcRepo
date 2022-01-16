#include <stdio.h>
#include <stdlib.h>

int main()
{


    int row,col;

    printf("Enter n: ");
    scanf("%d",&row);

    printf("Enter m: ");
    scanf("%d",&col);


    int array[row][col];


    printf("Enter matrix element : ");


    for(int i=0; i<row; i++)
    {

        for(int j=0; j<col; j++)
        {
            printf("element no : [%d][%d] = ",i,j);
            scanf("%d",&array[i][j]);
        }

    }

    int sum=0;
    for(int i=0; i<row; i++)
    {

        for(int j=0; j<col; j++)
        {

            if(i==0)
            {
                sum=sum+array[i][j];

            }

            else if(j==col-1)
            {
                sum=sum+array[i][j];

            }
        }

    }


    printf("sum of first row and last column:  %d",sum);
    return 0;
}
