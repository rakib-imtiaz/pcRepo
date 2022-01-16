#include<stdio.h>
#include <stdlib.h>
#include <time.h>

int ROW, COL,a=0,x,y,trans=0;
int** arr;
int** transpose_matrix;
int  c1=0,c2=0,c3=0;
void transpose()
{
    int matrix[ROW][COL];

    for (int i = 0; i < ROW; i++)
        for (int j = 0; j < COL; j++)
            matrix[i][j] = arr[i][j];
    for (int i = 0; i < ROW; i++)
        for (int j = 0; j < COL; j++)
            transpose_matrix[j][i] = matrix[i][j];
}
void  check()
{
    int matrix[ROW][COL];
    for (int i = 0; i < ROW; i++)
        for (int j = 0; j < COL; j++)
            matrix[i][j] = arr[i][j];
    for(int k=0; k<1; k++)
    {
        for (int i = 0; i < ROW; i++)
            for (int j = 0; j < COL; j++)
                if (matrix[i][j] != transpose_matrix[i][j])
                {
                    a++;
                    printf("NOT SYMETRIC\n");
                    break;
                }
        if(a>0)
            break;
        if(a==0)
        {
            c1++;
            printf("SYMETRIC\n");
        }
        else
        {
            break;
        }

    }
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


void antisymetric()
{
    for (int i = 0; i < ROW; i++)
    {
        for( int j = 0; j < COL; j++)
        {
            if (arr[i][j] !=arr[j][i])
                x = 1;
            else if (arr[i][j] == -arr[j][i])
                y = 1;
        }
    }
    if (x == 0)
        printf( "The matrix is symmetric.\n");
    else if (y == 1)
        printf("The matrix is Anti symmetric.\n");
    else
        printf("It is neither symmetric nor skew-symmetric.\n");
}
void transitive()
{
    for (int i = 0; i < ROW; i++)
    {
        for (int j = 0; j < ROW; j++)
        {
            for (int k = 0; k < ROW; k++)
            {
                if ((i!=j && j!=k) && !(arr[i][j] == 1 && arr[j][k] == 1 && arr[k][i] == 1))
                    trans ++;
            }
        }
    }

    if (trans==0)
    {
        printf("NOT TRANSITIVE\n");
    }
    else
    {
        printf("TRANSITIVE\n");
        c2++;
    }
}
void reflexsive()
{
    int matrix[100][100];
    for(int i=0; i<ROW; i++)
    {
        for(int j=0; j<COL; j++)
        {
            matrix[i][j]=arr[i][j]*arr[i][j];
        }
    }
    for(int i=0; i<ROW; i++)
    {
        for(int j=0; j<ROW; j++)
        {
            a=0;
            if(matrix[i][j]!=arr[i][j])
            {
                a++;
                printf("NOT REFLEXSIVE\n");
                break;
            }
        }
        if(a>0)
        {
            break;
        }
    }
    if(a==0)
    {
        c3++;
        printf("REFLEXSIVE\n");
    }
}
int main()
{
    int n;
    while(1)
    {
        printf("\n\nPRESS 1 FOR GENERATE MATRIX\n");
//        printf("PRESS 2 FOR FIND WHETHER IT SYMETRIC OR NOT\n");
//        printf("PRESS 3 FOR FIND WHETHER IT ANTISYMETRIC OR NOT\n");
//        printf("PRESS 4 FOR FIND WHETHER IT TRANSITIVE OR NOT\n");
//        printf("PRESS 5 FOR FIND WHETHER IT REFLEXSIVE OR NOT\n");
//        printf("PRESS 6 FOR CHECK WHETHER EQUAVALENCE OR NOT\n");
        printf("PRESS 2 FOR VIEW MATRIX\n");
        printf("PRESS 3 FOR EXIT\n");
        printf("ENTER YOUR CHOICE\n");
        int choice;
        scanf("%d",&choice);
        if(choice==1)
        {
            printf("Enter N : ");
            scanf("%d", &n);
            printf("Generating random numbers....\n");

            ROW = COL = n;
            arr = (int**) malloc(n * sizeof(int*));
            transpose_matrix = (int**) malloc(n * sizeof(int*));
            for (int i = 0; i < n; i++)
            {
                arr[i] = (int*)malloc(n * sizeof(int));

                transpose_matrix[i] = (int*)malloc(n * sizeof(int));
            }

            for (int i = 0; i < n; ++i)
            {
                for (int j = 0; j < n; ++j)
                {
                    arr[i][j]=generateRandomNumber();
                    sleep(1);


                }
            }


            transpose();
          //  check();

            antisymetric();

            transitive();

            reflexsive();

            //transpose();
            //check();
           // transitive();
            //reflexsive();
            if((c1>0 && c2>0) || (c1>0 && c3>0) || (c3>0 && c2>0))
            {
                printf("EQUAVALENCE\n");
            }
            else
            {
                printf("NOT EQAVALENCE\n");
            }
        }

        else if(choice==2)
        {
            for (int i = 0; i < n; ++i)
            {
                for (int j = 0; j < n; ++j)
                {
                    printf("%d ",arr[i][j]);
                }
                printf("\n");
            }
        }
        else if(choice==3)
        {
            printf("THANK YOU FOR VISITING\n");


        }
    }
    return 0;
}
