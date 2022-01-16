#include <stdio.h>
#include <string.h>
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

    char dept[100];
    char filename[100];
    printf("Enter department you want to save by : ");
    gets(dept);
    gets(dept);

    strcat(dept,".txt");
    strcpy(filename,dept);

    saveByDept(filename,dept,allstudents,size);
    deleteStudents(filename,dept,allstudents,size);


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

void deleteStudents(char filename[100],char dept[100],student allStudents[],int size)
{
 student temp[size];

int count=0;

    for(int i=0; i<size; i++)
    {
        if(allStudents[i].cgpa<3)
        {
            temp[count]=allStudents[i];
            count++;


        }


    }

    FILE *file;
    file=fopen(filename,"w");

  for(int i=0; i<count; i++)
    {


            fprintf(file,"%s %d %s %lf\n",temp[i].name,temp[i].id,temp[i].dept,temp[i].cgpa);




    }

    printf("\nFile deleted which are abvove cgpa 3");

}
