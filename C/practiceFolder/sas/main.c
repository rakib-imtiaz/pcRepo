#include<stdio.h>
struct student
{
    char name[50];
    int marks;
};
int oddcalculation(struct student []);
int  evencalculation(struct student []);
int main()
{
    int i;
    struct student stu[50];
    FILE *fptr;

    fptr=fopen("names.txt","w");



    for (i=0; i<10; i++)
    {
        printf("Enter student %d information\n",i);
        fflush(stdin);
        printf("Enter student name:  ");
        gets(stu[i].name);
        fflush(stdin);
        printf("Enter student marks: ");
        scanf("%d",&stu[i].marks);
        fflush(stdin);
    }
    for (i=0; i<10; i++)
    {
        fprintf(fptr, "NAMES=%s\n",stu[i].name);
    }
    int a=oddcalculation(stu);
    int b=evencalculation(stu);
    printf("Evensum: %d\n",a);

    printf("Oddsum= %d\n",b);

    fclose(fptr);

}

int oddcalculation(struct student m[])
{
    int i,odd=0,sum=0;
    FILE *fptr;

    fptr=fopen("oddcal.txt","w");
    for (i=0; i<10; i++)
    {
        if (m[i].marks%2!=0)
        {
            odd=m[i].marks;

            fprintf(fptr," %d \n",odd);

            sum+=odd;
        }
    }
    fclose(fptr);
    return sum;

}

int evencalculation(struct student n[])
{
    int i,even=0,sum=0;
    FILE *fptr;

    fptr=fopen("evencal.txt","w");
    for (i=0; i<10; i++)
    {
        if (n[i].marks%2==0)
        {
            even=n[i].marks;
            fprintf(fptr,"%d \n",even);
            sum+=even;

        }
    }


    fclose(fptr);
    return sum;

}
