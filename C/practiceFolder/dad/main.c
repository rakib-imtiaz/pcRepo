#include <stdio.h>
#include <stdlib.h>

int main()
{

    int n;

    printf("Enter n: ");
    scanf("%d",&n);

    if(n>=500 || n<20000)
    {

        printf("Invalid");
    }
    else if(n%500==0)
    {
        printf("invalid");

    }
    else
    {
        printf("success");
    }

    return 0;
}
