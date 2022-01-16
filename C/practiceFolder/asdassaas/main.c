#include <stdio.h>
#include <stdlib.h>
typedef struct
{
    char name[50];
    char addr[50];
    char gender[50];
    int registration;
    int number;
    int age;
    int coronaSTS;
} Patient;

void modify(char *name, int number,int reg, Patient allPatients[], int size)
{



    for(int i=0; i<size; i++)
    {
        if(reg==allPatients[i].registration)
        {
            strcpy(allPatients[i].name,name);
            allPatients[i].number=number;
        }


    }

}


void deletePatient(char *deptName, Patient allPatients[], int size)
{


    for(int i=0; i<size; i++)
    {
        if(strcmp(deptName,allPatients[i].name)==0)
        {

            allPatients[i]=allPatients[i+1];
        }


    }
}

int main()
{


    Patient allPatients[100];

    int size;
    printf("enter n : ");
    scanf("%d",&size);

    for(int i=0; i<size; i++)
    {

        printf("Name : ");
        gets(allPatients[i].name);
        printf("Age: ");
        scanf("%lf",&allPatients[i].age);
        printf("Gender ");
        gets(allPatients[i].gender);
        printf("Address ");
        gets(allPatients[i].addr);
        printf("Registration id: ");
        scanf("%d",&allPatients[i].registration);
        printf("NUmber : ");
        scanf("%d",&allPatients[i].number);
        printf("status : ");
        scanf("%d",&allPatients[i].coronaSTS);



    }



    for(int i=0; i<size; i++)
    {
        if(allPatients[i].coronaSTS==1)
        {

            printf("Name : %s",allPatients[i].name);
            printf("Age: %d",allPatients[i].age);
            printf("Gender %s",allPatients[i].gender);
            printf("Address %s",allPatients[i].addr);
            printf("Registration id: ",allPatients[i].registration);
            printf("NUmber : ,",allPatients[i].number);
            printf("status : %d",allPatients[i].coronaSTS);
        }


    }

    printf("Enter name to delt : ");
    char name[10];
    gets(name);
    deletePatient(name,allPatients,size);

    printf("Enter name to modify : ");
    char modName[100];
    gets(modName);
    printf("Enter number to modify : ");
    int number;
    printf("Enter reg number  to search : ");
    int reg;
    scanf("%d",&reg);
    modify(modName,number,reg,allPatients,size);


    return 0;
}
