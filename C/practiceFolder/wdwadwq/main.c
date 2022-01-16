#include <stdio.h>
#include <stdlib.h>

struct Employee
{
    char name[100];
    int id;
    double salary;


} emp[10];


void read()
{

    int n=10;
    for(int i=0; i<n; i++)
    {

        printf("Name : ");
        scanf("%s",&emp[i].name);
        printf("Id: ");
        scanf("%d",&emp[i].id);
        printf("salary: ");
        scanf("%lf",&emp[i].salary);
        printf("\n");

    }
}

void highestPaid(struct Employee emp[],int size)
{

    double max=emp[0].salary;
    int index=0;

    for(int i=0; i<size;i++)
    {

        if(emp[i].salary>max)
        {
            max=emp[i].salary;
            index=i;
        }

    }


    FILE *file;

    file=fopen("HighestPaid.txt","w");
    fprintf("%s %d %lf ",emp[index].name,emp[index].id,emp[index].salary);
    fclose(file);





}


int main()
{

    read();
    highestPaid(emp,10);
    return 0;
}
