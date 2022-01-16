#include<stdio.h>
struct stdInfo
{
    int roll,age;

    char f_name[50],l_name[60],addr[60];



} info[100];

void seacrhName(int n,char target[50]);

void seacrhstd_roll(int n,int roll);


int main()
{
    int n,i,userRoll;
    char target[100];
    printf("Enter N: ");
    scanf("%d",&n);


    for(i=0; i<n; i++)
    {
        printf("Info :  %d \n",i+1);
        printf("std_roll   :");
        scanf("%d",&info[i].roll);
        printf("first name :");
        scanf("%s",info[i].f_name);
        printf("Last name  :");
        scanf("%s",info[i].l_name);
        printf("Age        :");
        scanf("%d",&info[i].age);
        printf("Address    :");
        scanf("%s",&info[i].addr);
        printf("\n\n");



    }



    printf("Target roll :");
    scanf("%d",&userRoll);
    seacrhstd_roll(n,userRoll);

    printf("\n\n");

    printf("Target name : ");
    gets(stdin);
    scanf("%s",target);
    seacrhName(n,target);






    return 0;
}

void seacrhstd_roll(int n,int roll)
{


    for (int i=0; i<n; i++)
    {
        if (roll==info[i].roll)
        {
            printf("Students First name     :%s\n",info[i].f_name);
            printf("Students Last name      :%s\n",info[i].l_name);
            printf("Students age            :%d\n",info[i].age);
            printf("Students roll           :%d\n",info[i].roll);
            printf("Students Address        :%s\n",info[i].addr);

        }

        printf("\n\n");

    }



}

void seacrhName(int n,char target[50])
{

    for (int i=0; i<n; i++)
    {
        if (strcmp(target,info[i].f_name)==0)
        {
            printf("Students First name     :%s\n",info[i].f_name);
            printf("Students Last name      :%s\n",info[i].l_name);
            printf("Students age            :%d\n",info[i].age);
            printf("Students roll           :%d\n",info[i].roll);
            printf("Students Address        :%s\n",info[i].addr);

        }

        printf("\n\n");
    }

}

