#include <stdio.h>
#include <stdlib.h>
typedef struct
{
    char name[50];
    int id;
    char dept[20];
    double cgpa;
} student;

int main()
{

    student allstudents[100];

    int size;
    printf("Enter n: ");
    scanf("%d",&size);

    for(int i=0; i<size; i++)
    {

        printf("Enter name : ");
        gets(allstudents[i].name);
        gets(allstudents[i].name);
        printf("Enter id : ");
        scanf("%d",&allstudents[i].id);

        printf("Enter Dept : ");
        gets(allstudents[i].dept);
        gets(allstudents[i].dept);
        printf("Enter CGPA : ");
        scanf("%lf",&allstudents[i].cgpa);
        printf("\n\n");

    }

    saveByDept("info.txt","CSE",allstudents,size);
    deleteStudents(allstudents,size);


    return 0;
}

void saveByDept(char *fileName, char *deptName, student allStudents[], int
                size)
{

    FILE *file;
    file=fopen(fileName,"w");
    for(int i=0; i<size; i++)
    {
        if(strcmp(allStudents[i].dept,deptName)==0)
        {

            fprintf(file,"%s %d %s %lf\n",allStudents[i].name,allStudents[i].id,allStudents[i].dept,allStudents[i].cgpa);

        }


    }



}

void deleteStudents(student allStudents[],int size)
{

    for(int i=0; i<size; i++)
    {
        if(allStudents[i].cgpa>=3)
        {
            allStudents[i]=allStudents[i+1];


        }


    }

}
