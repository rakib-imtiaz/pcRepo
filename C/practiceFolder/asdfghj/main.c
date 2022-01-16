#include <stdio.h>
#include <stdlib.h>
struct student
{

    char name[20];
    int marks;
    float cgpa;





};




int main()
{
    int size=10;
    struct student info[size];

    for(int i=0; i<size; i++)
    {
        printf("student NO %d: \n",i+1);
        printf("student Name: \n");
        gets(info[i].name);
        printf("marks: ");
        scanf("%d",&info[i].marks);
        gets(stdin);
        printf("CGPA: ");
        scanf("%f",&info[i].cgpa);
        gets(stdin);

        printf("\n");

    }
    int min=info[0].marks;

    struct student temp;

    for (int i = 0; i < size; ++i)
    {

        for (int j = i + 1; j < size; ++j)
        {
            if (info[i].marks > info[i].marks)

            {
                temp =  info[i];
                info[i] = info[j];
                info[j] = temp;
            }
        }
    }



    printf("Highest marks  : ");

    printf("%s %f %d\n",info[size-1].name,info[size-1].cgpa,info[size-1].marks);



    printf("lowest marks  : ");

    printf("%s %f %d\n",info[0].name,info[0].cgpa,info[0].marks);



















    return 0;
}
