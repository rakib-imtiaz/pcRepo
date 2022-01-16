#include <stdio.h>
#include <stdlib.h>

struct student
{

    int Rollnumber;
    char Name[100];
    char Department[100];
    char Course[100];
    char Yearofjoining[100];


}students[100];

int main()
{

int n;
printf("Enter n : ");
scanf("%d",&n);

for(int i=0;i<n;i++)
{

printf("Enter name : ");
gets(students[i].Name);
printf("Enter Department name : ");
gets(students[i].Department);
printf("Enter course name : ");
gets(students[i].Course);
printf("Enter rollname : ");
gets(students[i].Rollnumber);
printf("Enter joining year");
gets(students[i].Yearofjoining);


}

char joiningyear="12/12/2003";
char roll=123;

printByJoinningYear(joiningyear);
printByroll(roll);

    return 0;
}


void printByroll(char *targetName,int n)
{

    for(int i=0; i<n; i++)
    {
        if(strcmp(targetName,students[i].Name)==0)
        {

        printf("Name : %s",students[i].Name);
        printf("Department : %s",students[i].Department);
        printf("course : %s",students[i].Course);
        printf("year of joiining : %s",students[i].Yearofjoining);


        }
    }

}

void printByJoinningYear(char *targetName,int n)
{

    for(int i=0; i<n; i++)
    {
        if(strcmp(targetName,students[i].Yearofjoining)==0)
        {

        printf("Name : %s",students[i].Name);
        printf("Department : %s",students[i].Department);
        printf("course : %s",students[i].Course);
        printf("year of joiining : %s",students[i].Yearofjoining);


        }
    }

}
