#include<stdio.h>
struct information
{
    char name[50];
    int marks;
};

int evencalc(struct information s[],int even[]);

int oddcalc(struct information s[],int odd[]);


void InputData();


int main()
{
    InputData();
    return 0;
}

int evencalc(struct information s[],int even[])
{
    int evenSummation =0;
    FILE *fptr;
    fptr = fopen("even.txt","w");

    int n=15;

    for(int i=0; i<n; i++)
    {
        if(s[i].marks%2==0)
        {
            fprintf(fptr,"%d\n",s[i].marks);
            evenSummation=evenSummation+s[i].marks;
        }
    }
    fclose(fptr);


    return evenSummation;

}
int oddcalc(struct information s[],int odd[])
{
    int oddsummation =0;
    FILE *fptr;
    fptr = fopen("odd.txt","w");

    int n=15;

    for(int i=0; i<n; i++)
    {
        if(s[i].marks%2==1)
        {
            fprintf(fptr,"%d\n",s[i].marks);
            oddsummation=oddsummation+s[i].marks;
        }
    }
    fclose(fptr);

    return oddsummation;

}



void InputData()
{
    struct information s[15];

    FILE *fptr;

    fptr = fopen("names.txt","w");

    int n=15;
    for(int i=0; i<n; i++)
    {
        printf("Student no %d: ",i+1);
        scanf("%s",&s[i].name);
        scanf("%d",&s[i].marks);
        fprintf(fptr,"%s\n",s[i].name);
    }
    int odd[n];


    int oddsummation = oddcalc(s,odd);
    int even[n];
    int evenSummation =  evencalc(s,even);

    printf("odd sum is %d and even sum is %d",oddsummation,evenSummation);


    fclose(fptr);
}
