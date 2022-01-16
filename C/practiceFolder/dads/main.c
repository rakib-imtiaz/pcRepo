#include <stdio.h>
#include <math.h>

int main ()
{

    /*
     *
     * task 1
     *
     */

    int i = 0;
    int n = 100;

    printf("1 to 100 even: ");

    i=0;
    while (i < n)
    {

        if (i % 2 == 0)
        {

            printf("%d ",i);
        }
        i++;

    }
    printf("1 to 100 odd: ");

    i=0;
    while (i < n)
    {

        if (i % 2 != 0)
        {

            printf("%d ",i);
        }
        i++;

    }

    int sum=0;

    i=0;
    while (i < n)
    {

        if (i % 2 == 0)
        {
            sum=sum+i;
        }
        i++;

    }
    printf("even avrg: %.2lf ",(sum/100.0));

    sum=0;

    i=0;

    while (i < n)
    {

        if (i % 2 != 0)
        {
            sum=sum+i;
        }
        i++;

    }
    printf("odd avrg: %.2lf",sum/100.0);
    i=0;

    while (i < 10)
    {

        int input;

        scanf("%d",&input);
        sum=sum+input;
        i++;

    }

    printf("sum of 10 numbers :  %d ",sum);

    printf("Enter 10 numbers");


    i=0;


    while (i < 10)
    {


        int input;

        scanf("%d",&input);
        if(input%2==0)
            sum=sum+input;


        i++;

    }

    printf("even sum  avrg of 10  numbers: %d ",sum/10);


    i=0;

    printf("Enter 10 numbers");

    while (i < 10)
    {


        int input;

        scanf("%d",&input);
        if(input%2!=0)
            sum=sum+input;
        i++;

    }

    printf("odd sum  avrg of 10  numbers: %.2lf",sum/10.0);



    printf("enter n: ");

    scanf("%d",&n);
    i=0;

    while(i<n)
    {
        if(i%2==0)
            sum=sum+i;

    }

    printf("sum : %d",sum);



    printf("enter n: ");
    scanf("%d",&n);

    i=0;
    double series=0;
    while(i<n)
    {
        series=series+pow(i, 2);

    }

    printf("sum : %d",sum);


    /*
     *
     * task 2
     * */
    printf("enter n: ");
    scanf("%d",&n);
    // 1/2 * 1^3 + 8/4 * 2^3  + 27/6  * 3^3

    i=0;
    series=0;

    while(i<n)
    {
        series=series+((pow(i, 3)/2*i)*pow(i, 3));

    }

    printf("sum :  %d",series);



























}




