#include <stdio.h>
#include <stdlib.h>

int main()
{

    char name1[100],name2[100];

    printf("Enter name 1: ");
    gets(name1);
    printf("Enter id : ");
    int id1;
    scanf("%d",&id1);
    printf("Enter cgpa " );
    float cgpa_1;
    scanf("%f",&cgpa_1);


    printf("Enter name 2: ");
    gets(stdin);
    gets(name2);
    printf("Enter id : ");
    int id2;
    scanf("%d",&id2);
    printf("Enter cgpa " );
    float cgpa_2;
    scanf("%f",&cgpa_2);



    printf("Enter name :  %s",name1);
    printf("Enter id :  %d",id1);
    printf("Enter cgp1 : %.2f",cgpa_1);

    printf("\n\n");

    printf("Enter name :  %s",name2);
    printf("Enter id :  %d",id2);
    printf("Enter cgp1 : %.2f",cgpa_2);

    return 0;
}
