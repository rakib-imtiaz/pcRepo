#include <stdio.h>
#include <stdlib.h>

struct Node
{

    int data;
    struct Node *next;


};

struct Node *head=NULL,*prev=NULL,*temp=NULL;

void createNode(int data)
{
    struct Node *newnode=NULL;
    newnode=(struct Node* )malloc(sizeof(struct Node));




    if(head==NULL)
    {
//for the first node head willl be having the address of frst node

        head=newnode;
        prev=newnode;


    }
    else
    {

        prev->next=newnode;
        prev=newnode;

    }

    newnode->data=data;

    newnode->next=NULL;


}

int main()
{



    int a=10;
    int b=20;
    int c=30;

    createNode(10);
    createNode(20);
    createNode(30);
    createNode(40);
    createNode(50);
    createNode(60);
    createNode(70);
    createNode(80);





    temp=head;
    while(temp!=NULL)
    {
        // printf("addr : %x \n",temp);
        printf("value :%d \n",temp->data);
        temp=temp->next;

    }

    printf("After adding to frist:\n\n\n " );

    //insertAtBegining(50);
      //  insertAtEnd(100);

      swap();


    temp=head;

    while(temp!=NULL)
    {
        //  printf("addr : %x \n",temp);
        printf("value :%d \n",temp->data);
        temp=temp->next;

    }







    return 0;
}

void swap()
{
int pos1=3;
int pos2=5;

temp=head;
int i=1;
while(i<pos1-1)
{
temp=temp->next;
i++;


}

struct Node *place1,*place2,*tmpplace;
place1=temp;


temp=head;
i=1;
while(i<pos1-1)
{
temp=temp->next;
i++;


}
place2=temp;


tmpplace=place1;
place1=place2;
place2=tmpplace;



}
void insertAtBegining(int data)
{
    struct Node *newNode=NULL;

    newNode=(struct Node *)(malloc(sizeof(struct Node)));

    if(head==NULL)
    {

        head=newNode;
        newNode->data=data;
        newNode->next=NULL;


    }
    else
    {

        newNode->next=head;
        newNode->data=data;
        head=newNode;




    }


}

void insertAtEnd(int data)
{
    struct Node *newNode;
    //newnode=(struct Node* )malloc(sizeof(struct Node));


    newNode=(struct Node *)malloc(sizeof(struct Node ));

    if(head==NULL)
    {
        head=newNode;
        newNode->data=data;
        newNode->next=NULL;

    }
    else
    {
        temp=head;
        while(temp->next!=NULL)
        {

            printf("%d   ",temp->data);
            printf("%d\n",temp->next);
            temp=temp->next;

        }

        temp->next=newNode;
        temp=newNode;
        newNode->data=data;
        newNode->next=NULL;







    }




}

void sortList()
{


}
