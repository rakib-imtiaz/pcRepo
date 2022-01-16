#include <stdio.h>
#include <stdlib.h>
struct information
{

    char name[20];
    char homeTown[20];
    char CourseName[20][10];
    char facultyName[20][10];
    char courseCode[10][10];
    int section[10];
    int credits[10];
    int id;

} info;

int main()
{

    printf("Enter your name : ");
    gets(info.name);
    printf("Enter HomeTown : ");
    gets(info.homeTown);
    printf("Enter id :");
    scanf("%d",&info.id);

    int no_of_course;
    printf("How many courses ? ");
    scanf("%d",&no_of_course);
    for(int i=0; i<no_of_course; i++)
    {
        printf("Course name : ");
        gets(info.CourseName[i]);
        gets(info.CourseName[i]);
        printf("Faculty name : ");
        gets(info.facultyName[i]);
        printf("course code: ");
        gets(info.courseCode[i]);
        printf("Credits: ");
        scanf("%d",&info.credits[i]);
        printf("Section: ");
        scanf("%d",&info.section[i]);

    }



    FILE *file;

    file=fopen("info.txt","w") ;

    fprintf(file,"Name: %s      ID :%d          HomeTown : %s  \n",info.name,info,info.id,info.homeTown);
    fprintf(file,"Fall'21 Courses: \n");
    fprintf(file,"Code    Name              credit          section     faculty\n");
    for(int i=0; i<no_of_course; i++)
    {

        fprintf(file,"%s\t %s \t%d \t%d \t%s\n",info.courseCode[i],info.CourseName[i],info.credits[i],info.section[i],info.facultyName[i]);

    }


    fclose(file);


    return 0;
}
