#include <stdio.h>
#include <stdlib.h>
double calCSum(int n);

int main()
{

    int n;

    printf("Enter n :");
    scanf("%d",&n);
    printf("Series :  %.2lf",calCSum(n));

    return 0;
}

double calCSum(int n)

{

    double seriesCals=0;
    int i=1;
    while(i<=n)
    {

        seriesCals=seriesCals+(double)1/i*1;
        i++;
    }

    return seriesCals;



}
