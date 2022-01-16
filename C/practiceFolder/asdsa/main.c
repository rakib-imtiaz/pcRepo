#include <stdio.h>
#include <math.h>
double root4(int num);

int main()
{

    int a;

    printf("Enter a : ");
    scanf("%d",&a);

    printf("Ans: %.2lf",root4(a));
    return 0;
}

double root4(int num)
{

    int flag=4;
    int sum=0;

    while(flag!=0)
    {

        sum=sqrt(num);
        num=sum;
        flag--;

    }

    return sum;

}
