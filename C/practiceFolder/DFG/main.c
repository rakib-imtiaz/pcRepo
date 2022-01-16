#include <stdio.h>

int main(int argc, char const *argv[])
{

    char name[20][10];
    int marks[10];
    double cgpa[10];

    printf("Enter 10 students  data : \n");

    int n=10;
    for (int i = 0; i < n; i++)
    {
        printf("Name : ");
        gets(name[i]);
        printf("Marks : ");
        scanf("%d",&marks[i]);
        printf("cgpa : ");
        scanf("%.2f",cgpa[i]);
        printf("\n");
    }

    return 0;
}
