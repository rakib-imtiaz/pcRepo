#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("1.Calculate Hourly charge from Monthly Fees \n");

    printf("2.Calculate Monthly Fees from Hourly charge\n");
    //printf("3.Calculate Weekly cost from hourly charge\n");
    printf("Enter your option:");
    int option;
    scanf("%d",&option);

    switch(option)
    {
        case 1:{
            hourly();
            break;
        }
        case 2:{
            monthly();
            break;
        }
        case 3:{
            hourly();
            break;
        }
    }




    return 0;
}

void hourly()
{
    int month,day;
    float hour;
    printf("Enter Monthly fees : ");
    scanf("%d",&month);
    printf("How many hours per day?\n");
    scanf("%f",&hour);
    printf("Days per week?\n");
    scanf("%d",&day);

    float unit=hour*day*4;
    float charge=month/unit;
    //system("cls");

    printf("\t\t%.2f per Hour will be charged.\n",charge);




}

void monthly()
{

    int month,day;
    float hour;
    float charge;

    printf("Days per week?\n");
    scanf("%d",&day);

    printf("How many hours per day?\n");
    scanf("%f",&hour);

    printf("Charge per hour?\n");
    scanf("%f",&charge);


    float unit=day*hour*charge;
    float tk=4*unit;

    //system("cls");

    printf("\t\t%.2ftk/= per Hour per month.\n",tk);








}
