#include <stdio.h>
#include <stdlib.h>

struct students
{
    char name[100];
    int id;
    double marks;
    double cgpa;


} arr[10];




int main()
{


    int n=10;

    FILE *fp1,*fp2;
    fp1=fopen("info.txt","w");
    fp2=fopen("numbers.txt","w");

    for(int i=0; i<n; i++)
    {

        printf("Name : ");
        scanf("%s",&arr[i].name);
        fprintf(fp1,"%s ",arr[i].name);

        printf("Id: ");
        scanf("%d",&arr[i].id);
        fprintf(fp1,"%d \n",arr[i].id);

        printf("marks: ");
        scanf("%lf",&arr[i].marks);
        fprintf(fp2,"%lf ",arr[i].marks);
        printf("CGPA: ");
        scanf("%lf",&arr[i].cgpa);
        fprintf(fp2,"%lf \n", arr[i].cgpa);
        printf("\n");

    }

    fclose(fp1);
    fclose(fp2);


    fp2=fopen("numbers.txt","r");

    int count=0;

    int max=0;
    int index=0;
    for(int i=0; fscanf(fp2,"%lf %lf ",&arr[i].marks,&arr[i].cgpa)!=EOF ; i++)
    {
        if(arr[i].marks>max)
        {
            max=arr[i].marks;
            index=i;
        }
        count++;
    }

    fclose(fp2);


    FILE *fp3;
    fp3=fopen("highest.txt","w");


    fprintf(fp3,"%s ",arr[index].name);

    fprintf(fp3,"%d ",arr[index].id);

    fprintf(fp3,"%lf ",arr[index].marks);
    fprintf(fp3,"%lf ", arr[index].cgpa);

    fclose(fp3);


    return 0;
}
