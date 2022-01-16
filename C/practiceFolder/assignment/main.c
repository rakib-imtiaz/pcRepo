#include <stdio.h>
#include <string.h>

struct patient
{
    int registration_Number;
    char name[100];
    int  age;
    char gender[10];
    int  contact_Number;
    char address[100];
    int  corona_status;


} info[50];

int main()
{

    printf("Enter n : ");
    int n;
    scanf("%d",&n);
    takeinput(n);

    int option;


    do
    {
        menu();
        printf("Choose opiton: \n");
        scanf("%d",&option);

        if(option==1)
        {

            displayPatients(n);
        }
        else if(option==2)
        {
            char target[100];
        printf("Enter username to modify: ");
        gets(target);

            deleteByUserName(n);
        }
        else if(option==3)
        {

            modifyUser(n);
        }
        else
        {
            exit(0);
        }


    }
    while(option!=4);


    displayPatients(n);



    return 0;
}

void menu()
{
    printf("1.  Display\n");
    printf("2.  Delete\n");
    printf("3.  Modify\n");
    printf("4.  Exit\n");


}


void displayPatients(int n)
{

    printf("Dsiplaying Contacts had corona : \n");
    for(int i=0; i<n; i++)
    {
        if(info[i].corona_status==1)
        {

            printf("patient No :%d      \n",i+1);
            printf("Name                %s:\n",info[i].name);
            printf("Age                 %d:\n",info[i].age);
            printf("Gender              %s:\n",info[i].gender);
            printf("Address             %s:\n",info[i].address);
            printf("Registration number %d:\n",info[i].registration_Number);
            printf("Contact number      %d:\n",info[i].contact_Number);
            printf("\n\n");
        }
    }
}

void takeinput(int n)
{

    for(int i=0; i<n; i++)
    {
        printf("Enter name : ");
        gets(info[i].name);
        gets(info[i].name);
        printf("Age :");
        scanf("%d",&info[i].age);
        printf("Gender: ");
        gets(info[i].gender);
        gets(info[i].gender);
        printf("Address: ");
        gets(info[i].address);
        printf("Registration number :");
        scanf("%d",&info[i].registration_Number);
        printf("Contact number :");
        scanf("%d",&info[i].contact_Number);
        printf("Corona status :(Enter 1 for yes, 0 for no)\n");
        scanf("%d",&info[i].corona_status);
        printf("\n\n");

    }

}

void modifyUser(int n)
{

    int targetregistrationNumber;
    printf("Enter registration number: ");
    scanf("%d",&targetregistrationNumber);

    int con;
    char address[100];
    printf("Enter contact number : ");
    scanf("%d",&con);
    printf("Enter address  : ");
    getc(address);


    for(int i=0; i<n; i++)
    {
        if(targetregistrationNumber==info[i].registration_Number)
        {

            info[i].contact_Number=con;
            strcpy(info[i].address,address);


        }
    }



}

void deleteByUserName(char *targetName,int n)
{
    int index=0;

    for(int i=0; i<n; i++)
    {
        if(strcmp(targetName,info[i].name)==0)
        {
            index=i;


        }
    }
    for(int i=index; i<n; i++)
    {

        info[i]=info[i+1];
    }


}

