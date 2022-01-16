#include <stdio.h>
#include <string.h>

int main()
{

    int days [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    int mnth;
    printf("Enter mnth number: ");
    scanf("%d",&mnth);
    switch(mnth)
    {
    case 1:
        printf("January");
        break;
    case 2:
        printf("February");
        break;
    case 3:
        printf("March");
        break;
    case 4:
        printf("April");
        break;
    case 5:
        printf("May");
        break;
    case 6:
        printf("June");
        break;
    case 7:
        printf("July");
        break;
    case 8:
        printf("August");
        break;
    case 9:
        printf("September");
        break;
    case 10:
        printf("October");
        break;
    case 11:
        printf("November");
        break;
    case 12:
        printf("December");
        break;
    default:
        printf("invalid ");
        break;
    }
    printf("\n");

    printf("Last day of ");

    switch(mnth)
    {
    case 1:
        printf("January");
        break;
    case 2:
        printf("February");
        break;
    case 3:
        printf("March");
        break;
    case 4:
        printf("April");
        break;
    case 5:
        printf("May");
        break;
    case 6:
        printf("June");
        break;
    case 7:
        printf("July");
        break;
    case 8:
        printf("August");
        break;
    case 9:
        printf("September");
        break;
    case 10:
        printf("October");
        break;
    case 11:
        printf("November");
        break;
    case 12:
        printf("December");
        break;
    default:
        printf("invalid ");
        break;
    }

    printf("is %d \n",days[mnth]);



       int sum=0;

    for(int i=0; i<mnth; i++)
    {

        sum=sum+days[i];

    }


    printf("Its the %d of the day of the year",sum);






    return 0;
}
