#include<stdio.h>

void getMaxNumber(int *num1, int *num2, int *num3)
{

    if(*num1>*num2 && *num1>*num3)
        printf("\n%d is the largest number\n", *num1);

    else if(num2>*num1 && *num2>*num3)

        printf("\n%d is the largest number\n", *num2);
    else

        printf("\n%d is the largest number\n", *num3);

}

int main()

{

    int n1, n2, n3;
    int *num1, *num2, *num3;

    printf("Enter three numbers :");

    scanf("%d %d %d", &n1,&n2,&n3);

    getMaxNumber (&n1,&n2, &n3);

    return 0;
}
