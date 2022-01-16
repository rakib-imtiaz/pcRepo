#include <stdio.h>
#include <stdlib.h>

int main()
{

    int n;
    printf("Enter the value of n : ");
    scanf("%d",&n);

    int start=2;
    int sum=0;
    int second=1;
    for(int i=0; i<n-2; i++)
    {
        sum=start+second;
        start=second;
        second=sum;

    }

    printf("%dth value of your number sequence is %d",n,sum);


    return 0;
}
