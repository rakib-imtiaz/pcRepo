#include <stdio.h>
#include <stdlib.h>

int main()
{

    double marks;
    printf("Input marks: ");
    scanf("%lf",&marks);

    if(marks>93)
    {
        printf("A");
    }
    else if(marks>=92 && marks<=90)
    {
        printf("A-");
    }
    else if(marks>=87 && marks<=89)
    {
        printf("B+");
    }
    else if(marks>=83 && marks<=86)
    {
        printf("B good");
    }
    else if(marks>=77 && marks<=79)
    {
        printf("B-");
    }
    else if(marks>=73 && marks<=76)
    {
        printf("C");
    }
    else if(marks>=67 && marks<=69)
    {
        printf("D+");
    }

    else
        printf("F");
}


