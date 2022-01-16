#include<stdio.h>


int main()
{
    double grades[3][4];
    double grde[3];
    printf("enter grades for sub1  sub2  sub3  sub4:\n");
    for(int i=0; i<3; i++)
    {
        printf("student%d grades: ",i+1);
        for(int j=0; j<4; j++)
        {
            scanf("%lf",&grades[i][j]);
            //printf("%f",grades[i][j]);
        }


    }
    for(int i=0; i<3; i++)
    {
        double temp =(double)(grades[i][0]*3.0 +grades[i][1]*3.0 + grades[i][2]*3.0 + grades[i][3]*3.0);
        grde[i] = (double)(temp /(3.0*4.0)) ;
        printf("student%d TGPA: %lf\n",i+1,grde[i]);
    }

}
