#include <stdio.h>
int main()
{

    int input[3][4]= {

    {6,4,1,7},
    {9,4,7,10},
    {5,56,47,10}


    };

    int sum2=0;
    int coun2=0;
    int sum1=0;
    int sum3=0;

    for(int i=0; i<3; i++)
    {

        for(int j=0; j<4; j++)
        {

            if(i==1)
            {
                sum1=sum1+input[i][j];
                sum3++;
            }
            if(j==3)
            {
                sum2=sum2+input[i][j];

                coun2++;
            }

        }

    }


    double arg=sum1/4.0;
    double colav=sum2/4.0;


    printf("Row sum : %d\n",sum1);
    printf("col sum : %d\n",sum2);


    printf("Row average : %lf\n",arg);
    printf("col average : %lf\n",colav);



}
