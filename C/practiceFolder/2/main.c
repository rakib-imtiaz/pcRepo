#include <stdio.h>
#include <string.h>
typedef struct
{
    char name[50];
    int id;
    char dept[20];
    double cgpa;
} student;


void saveByDept(char *fileName, char *deptName, student allStudents[], int size);

void deleteStudents(student allStudents[],int size);

int main()
{

    student structureArray[100];

    strcpy(structureArray[0].name,"Rabby");
    structureArray[0].cgpa=3.45;
    strcpy(structureArray[0].dept,"CSE");
    structureArray[0].id=19123;

    strcpy(structureArray[1].name,"Fazlay");
    structureArray[1].cgpa=2.5;
    strcpy(structureArray[1].dept,"BBA");
    structureArray[1].id=19123;

    strcpy(structureArray[2].name,"Elahi");
    structureArray[2].cgpa=2.45;
    strcpy(structureArray[2].dept,"CSE");
    structureArray[2].id=20123;


    char filename[100]="stdinfo.txt";
    char dept[100]="CSE";
    int n=3;

    saveByDept(filename,dept,structureArray,n);
    deleteStudents(structureArray,n);


    return 0;
}

void saveByDept(char *fileName, char *deptName, student allStudents[], int
                size)
{

    FILE *f;
    f=fopen(fileName,"w");
    int i=0;
    while( i<size)
    {
        if(strcmp(allStudents[i].dept,deptName)==0)
        {

            fprintf(f,"%s %d %s %lf\n",allStudents[i].name,allStudents[i].id,allStudents[i].dept,allStudents[i].cgpa);

        }

        i++;
    }



}

void deleteStudents(student allStudents[],int size)
{
    int i=0;
    while(i<size)
    {
        if(allStudents[i].cgpa>=3.0)
        {
            allStudents[i].cgpa=0;
            strcpy(allStudents[i].dept," ");
            allStudents[i].id=0;
            strcpy(allStudents[i].name," ");


        }

        i++;
    }

}
