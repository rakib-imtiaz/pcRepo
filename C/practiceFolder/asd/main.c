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
        printf("student Name: \n");
        gets(info[i].name);
        gets(stdin);
        printf("ID: ");
        scanf("%d",&info[i].marks);
        gets(stdin);
        printf("student address: \n");
        gets(info[i].name);
        printf("Salary: ");
        scanf("%d",&info[i].address);
        gets(stdin);
        printf("student Designation: \n");
        gets(info[i].designation);
                gets(stdin);

        printf("\n");

    }
    int min=info[0].cgpa;

    struct student temp;

    for (int i = 0; i < size; ++i)
    {

        for (int j = i + 1; j < size; ++j)
        {
            if (info[i].cgpa > info[i].cgpa)

            {
                temp =  info[i];
                info[i] = info[j];
                info[j] = temp;
            }
        }
    }



    printf("Highest cgpa  : ");

    printf("%s %s %s %d %d\n",info[size-1].name,info[size-1].designation,info[size-1].address,info[size-1].cgpa,info[size-1].marks);



    printf("lowest cgpa  : ");

    printf("%s %s %s %d %d\n",info[0].name,info[0].designation,info[0].address,info[0].cgpa,info[0].marks);



















    return 0;
}
