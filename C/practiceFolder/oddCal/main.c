#include<stdio.h>
struct students
{

    char name[20];
    int totalMarks;

} std;

int * OddCal(int marks[100]);

int * evenCal(int marks[100]);

int countEven(int marks[100]);


int * OddCal(int marks[100])
{
    static int odd[100];
    int i,j=0;

    FILE *file;
    file=fopen("odd.txt","w");

    for(i=0; i<15; i++)
    {
        if(marks[i]%2!=0)
        {
            odd[j]=marks[i];
            fprintf(file,"%d \n",odd[j]);
            j+=1;
        }
    }
    fclose(file);
    return odd;
}

int * evenCal(int marks[100])
{
    static int even[100];
    int i,j=0;
    FILE *file;
    file=fopen("Even.txt","w");


    for(i=0; i<15; i++)
    {
        if(marks[i]%2==0)
        {
            even[j]=marks[i];
            fprintf(file,"%d \n",even[j]);
            j+=1;
        }
    }
    fclose(file);
    return even;
}

int countEven(int marks[100])
{
    int i,count=0;
    for(i=0; i<15; i++)
    {
        if(marks[i]%2==0)
        {
            count+=1;
        }
    }
    return count;
}

int *userInput(int evenSum,int odd)
{
    static int marks[15];
    int i;
    FILE *file;
    file=fopen("names.txt","w");

    printf("Enter student data \n");

    for(i=0; i<15; i++)
    {
        scanf("%s %d",std[i].name,marks[i]);
    fprintf(file,"%s",students[i].name);
    }
     int *odd;
    int *even;
    odd=OddCal(marks1);
    even=evenCal(marks1);

    return marks;

}


int main()
{
    int *odd,n,i;
    int *even;
    int *marks1;
    marks1=userInput();
    odd=OddCal(marks1);
    even=evenCal(marks1);
    n=countEven(marks1);
    printf("odd marks are \n");
    for(i=0; i<(15-n); i++)
        printf("%d\n",odd[i]);
    printf("Even marks are \n");
    for(i=0; i<n; i++)
        printf("%d\n",even[i]);


}
