#include <stdio.h>
#include <string.h>

struct patient
{
    int registration,sts,age,number;
    char patientName[25],gender[10],addr[25];


} info[25];

void add(int n)
{

    printf("Contacts had corona : \n");
    int i=0;
    while(i<n)
    {
        if(info[i].sts==1)
        {

            printf("Name                :%s\n",info[i].patientName);
            printf("Age                 :%d\n",info[i].age);
            printf("Gender              :%s\n",info[i].gender);
            printf("Address             :%s\n",info[i].addr);
            printf("Registration number :%d\n",info[i].registration);
            printf("Contact number      :%d\n",info[i].number);
            printf("\n\n");
        }
        i++;
    }


}


void modify(int n)
{

    int user;
    printf("Registration number to search: ");
    scanf("%d",&user);

    int con;
    char addr[25];
    printf("Contact number to modify : ");
    scanf("%d",&con);
    printf("Address to modify  : ");
    gets(addr);
    gets(addr);


    for(int i=0; i<n; i++)
    {
        if(user==info[i].registration)
        {

            info[i].number=con;
            strcpy(info[i].addr,addr);


        }
    }



}

void dltUsrName(char *userNameName,int n)
{
    int flag=0;

    for(int i=0; i<n; i++)
    {
        if(strcmp(userNameName,info[i].patientName)==0)
        {
            flag=i;


        }
    }
    for(int i=flag; i<n; i++)
    {

        info[i]=info[i+1];
    }


}

int main()
{
    char userName[25];

    int n;
    printf("Enter patient Number to add : ");
    scanf("%d",&n);
    for(int i=0; i<n; i++)
    {
        printf("Enter patientName : ");
        gets(info[i].patientName);
        gets(info[i].patientName);
        printf("Age :");
        scanf("%d",&info[i].age);
        printf("Gender: ");
        gets(info[i].gender);
        gets(info[i].gender);
        printf("Address: ");
        gets(info[i].addr);
        printf("Registration number :");
        scanf("%d",&info[i].registration);
        printf("Contact number :");
        scanf("%d",&info[i].number);
        printf("Corona sts :");
        scanf("%d",&info[i].sts);
        printf("\n\n");

    }


    add(n);
    printf("Enter name to Delete: ");
    gets(userName);
    gets(userName);
    dltUsrName(userName,n);
    modify(n);


    return 0;
}
