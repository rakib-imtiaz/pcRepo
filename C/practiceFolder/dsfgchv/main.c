#include <stdio.h>
#include <string.h>

int main()
{

    printf("Enter 3x3 matrix : ");
    int n=3;


    int matrix[3][3];
    for(int i=0; i<3; i++)
    {

        for(int j=0; j<3; j++)
        {
            scanf("%d",&matrix[i][j]);
            if(matrix[i][j]<0)
            {
                matrix[i][j]=0;
            }
        }
    }

    for(int i=0; i<3; i++)
    {

        for(int j=0; j<3; j++)
        {
            printf("%d",matrix[i][j]);

        }
        printf("\n");
    }





    return 0;
}
