#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct contactInfo{

    char name[50];
    double number;


};

struct contactInfo info;

char fileName[]="Contact_list.txt";

int main()
{

    main_menu();


    return 0;
}


void main_menu()
{
    system("cls");
    printf("\t\t\t\tWelcome to PhoneBook\n\n\n");
    printf("1.Add New Contact\n");
    printf("2.Search Contact\n");
    printf("3.View All Contact\n");
    printf("4.Exit\n");


    int option;
    scanf("%d",&option);

    switch(option)
    {
    case 1:
        {
            add_new_contact();
            break;
        }
    case 2:
        {
            search_contact();
            break;
        }
    case 3:
        {
            view_all_contact();
            break;
        }
    case 4:
        {
            exit(1);
            break;
        }
    default:
        {
            system("cls");
            printf("Wrong Input...\n");
            sleep(1);
            main_menu();
            break;
        }


    }






}

void add_new_contact()
{
    FILE *file;
    file=fopen(fileName,"a");


    system("cls");
    printf("Phone Number: +880");
    scanf("%lf",&info.number);
    gets(stdin);

    printf("\nName: ");
    gets(info.name);

    fprintf(file,"%s %.lf\n",info.name,info.number);
    fclose(file);

    printf("\n\nAdd more?\n1.yes\n2.No\n");
    int option;
    scanf("%d",&option);
    if(option==1)
    {
        add_new_contact();
    }
    else{

        main_menu();
    }



}

void search_contact()
{
    system("cls");
    printf("1.Search By Name: \n");
    printf("2.Search By Number: \n");
    int option;
    scanf("%d",&option);
    int count=0;


    if(option==1)
    {
        printf("\nEnter Contact Name : ");
        char target_name[30];


        gets(stdin);
        gets(target_name);

        FILE *file;
        file=fopen(fileName,"r");

        while(fscanf(file,"%s %lf",&info.name,&info.number))
        {
            if(strcasecmp(target_name,info.name)==0)
            {
                printf("\n\nContact Name: %s\nContact Number:+880%.lf\n",info.name,info.number);
                break;


            }



        }
        fclose(file);
    }
    else if(option==2)
    {
        printf("\nEnter Contact Number : ");
        double target_number;


        scanf("%lf",&target_number);
        FILE *file;
        file=fopen(fileName,"r");


        while(fscanf(file,"%s %lf",&info.name,&info.number))
        {
            if(target_number==info.number)
            {
                printf("\n\nContact Name: %s\nContact Number:+880%.lf\n",info.name,info.number);
                count++;
                break;


            }



        }
        fclose(file);

    }
    else{

        printf("Invalid Input! \nTry again");
        sleep(1);
    }

    printf("Count : %d",count);




}



void view_all_contact()
{
    FILE *file;
    file=fopen(fileName,"r");


     while(fscanf(file,"%s %lf",&info.name,&info.number))
        {
                printf("\n\nContact Name: %s\nContact Number:+880%.lf\n",info.name,info.number);

        }
        fclose(file);

}

