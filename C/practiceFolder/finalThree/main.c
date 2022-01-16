#include <stdio.h>
#include <string.h>
struct car
{
    char company[100];
    char model[100];
    double price;
};
int main()
{
    struct  car cars[100];
    int numofcar;
    printf("enter the num of car: ");
    scanf("%d",&numofcar);
    FILE* file = fopen("car.txt","w");
    for(int i=0; i<numofcar; i++)
    {
        printf("enter the car company name: ");

        gets(cars[i].company);
        gets(cars[i].company);

        printf("enter the car model name: ");
        fflush(stdin);
        gets(cars[i].model);
        printf("enter the car price: ");
        fflush(stdin);
        scanf("%f",&cars[i].price);
        fprintf(file,"%s %s %f\n",cars[i].company,cars[i].model,cars[i].price);
    }
    fclose(file);


    return 0;
}
