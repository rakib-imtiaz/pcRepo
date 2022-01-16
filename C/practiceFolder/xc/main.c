#include <stdio.h>

int main()
{
    int row,col;
    printf("Enter row: ");
    scanf("%d",&row);

    printf("Enter col: ");
    scanf("%d",&col);

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


    int sumOFBorderPart=0;
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<col; j++)
        {

            if (i == 0 || j == 0 || i == row-1 || j == col-1)
            {
            printf("%d ",array[i][j]);
            }
            else{
            printf("  ");
            }

        }
        printf("\n");
    }
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<col; j++)
        {


            if (i == 0 || j == 0 || i == row-1 || j == col-1)
            {
                sumOFBorderPart=sumOFBorderPart+array[i][j];
            }

        }
    }

//1 2 3 4 4 5 6 7 7 8 9 9



    printf("The sum is %d",sumOFBorderPart);


}
