#include <stdio.h>
#include <stdlib.h>
#include <string.h>
struct song
{
    char songName[100];
    char artistName[100];
    int duration;

};

struct playlist
{
    char playlistName[100];
    struct song *songpointer;
    struct song *nextSong;

};

struct playlist *head=NULL,*newnode=NULL,*temp=NULL,*nextNode=NULL;

void menu();
void createNewPlayList();
void addSongAtEnd();
void PlayTheList();
void searchforAsong();
void deleteASong();
void swapTwoSongs();
void playRandomSong();
void shuffle();
void calcDuration();
void savePlaylistTofile();
void loadPlaylistFromfile();


int main()
{
//    createNode("Love","Bateyen_kavhi_na","arijit",1200);
//    createNode("Love","Tujhe_kitna_chahne_lage_hum","jubin",5600);
//    createNode("Love","Humdard","t",3400);

    //shuffle();


    int choice;
    do
    {

        system("cls");
        menu();

        printf("\n\nEnter Your choice: \n");
        scanf("%d",&choice);

        if(choice==1)
        {
            createNewPlayList();
        }
        else if(choice==2)
        {
            addSongAtEnd();
        }
        else if(choice==3)
        {
            PlayTheList();
        }
        else if(choice==4)
        {
            searchforAsong();
        }
        else if(choice==2)
        {
            addSongAtEnd();
        }
        else if(choice==5)
        {
            deleteASong();
        }
        else if(choice==6)
        {
            swapTwoSongs();
        }
        else if(choice==7)
        {
            playRandomSong();
        }
        else if(choice==8)
        {
            shuffle();
        }
        else if(choice==9)
        {
            calcDuration();
        }
        else if(choice==10)
        {
            savePlaylistTofile();
        }
        else if(choice==11)
        {
            loadPlaylistFromfile();
        }
        else if(choice==12)
        {
            break;
        }
        else
        {
            printf("Invalid option!\n ");
            continue;
        }
        gets(stdin);



    }
    while(choice!=12);



    return 0;
}

void menu()
{
    printf("1.  Create a new Playlist\n");

    printf("2.  Add a Song to the end of the Playlist\n");

    printf("3.  Play the Playlist\n");
    printf("4.  Search for a Song based on the title or the artist’s name\n");

    printf("5.  Delete a Song from the Playlist\n");

    printf("6.  Swap the position of two Songs\n");

    printf("7.  Play a random Song from the list \n");
    printf("8.  Shuffle the order of the Playlist\n");
    printf("9.  Calculate the duration of the Playlist \n");

    printf("10. Save the complete Playlist to a file\n");

    printf("11. Load a complete Playlist from a file \n");
    printf("12. Exit \n");

}

void createNewPlayList()
{

    char playlist_name[100];
    char songName[100];
    char artistName[100];
    int duration;

    printf("Enter Name for the playList: ");
    scanf("%s",playlist_name);
    gets(stdin);

    int choice;
    int counter=0;


    do
    {

        char name[100];
        printf("\n\n");
        printf("Name of the song :  \n");
        fgets(songName,100,stdin);
        printf("Artist name :  \n");
        scanf("%s",artistName);
        gets(stdin);
        printf("Duration:  \n");
        scanf("%d",&duration);
        counter++;
        createNode(playlist_name,songName,artistName,duration);


        printf("Add another one?\n1.yes\n2.No\n");
        scanf("%d",&choice);
        if(choice==1)
        {
            gets(stdin);
            continue;
        }
        else
        {
            break;
        }

    }
    while(choice!=2);

}


void createNode(char* playlist_name,char*songName,char*artistName,int duration)
{
    //struct Node *newnode=NULL;
    newnode=(struct playlist *)malloc(sizeof(struct playlist));
    newnode->songpointer=(struct song *)malloc(sizeof(struct song));




    if(head==NULL)
    {
//for the first node head willl be having the address of frst node

        head=newnode;
        temp=newnode;

        temp->nextSong=temp->songpointer;


    }
    else
    {

        //temp->nextSong=newnode;
        temp->nextSong=newnode;

        temp=newnode;

    }

    strcpy(newnode->playlistName,playlist_name);
    strcpy(newnode->songpointer->songName,songName);
    strcpy(newnode->songpointer->artistName,artistName);
    newnode->songpointer->duration=duration;

    newnode->nextSong=NULL;


}

void addSongAtEnd()
{

    newnode=(struct playlist *)malloc(sizeof(struct playlist));
    newnode->songpointer=(struct song *)malloc(sizeof(struct song));



    char name[100];
    int counter=0;
    printf("\n\n");
    printf("Name of the song :  \n");
    fgets(name,100,stdin);
    strcpy(newnode->songpointer->songName,name);
    printf("Artist name :  \n");
    fgets(name,100,stdin);

    strcpy(newnode->songpointer->artistName,name);
    printf("Duration:  \n");
    scanf("%d",&newnode->songpointer->duration);
    counter++;

    if(head==NULL)
    {
        head=newnode;
        newnode->nextSong=NULL;

    }
    else
    {
        temp=head;
        while(temp->nextSong!=NULL)
        {

            printf("%s   \n",temp->songpointer->songName);
            temp=temp->nextSong;

        }

        temp->nextSong=newnode;
        temp=newnode;
        newnode->nextSong=NULL;




    }
    gets(stdin);
    printf("song has been added at the end of the list\n",counter);
}
void PlayTheList()
{
    temp=head;
    printf("PlayList :  %s\n",temp->playlistName);

    int count=1;
    while(temp!=NULL)
    {
        printf("Song No : %d\n",count);
        printf("song        :  %s\n",temp->songpointer->songName);
        printf("Artist      :  %s\n",temp->songpointer->artistName);
        printf("Duration    :  %d seconds\n",temp->songpointer->duration);
        printf("\n\n");
        temp=temp->nextSong;
        count++;



    }



}
void searchforAsong()
{
    char target[100];
    printf("1.Search by Title Name : \n");
    printf("2.Search by artist Name : \n");
    int option;
    scanf("%d",&option);
    gets(stdin);

    if(option==1)
    {
        printf("Enter title name to search song : \n");
        gets(target);


        temp=head;

        int count=1;
        while(temp!=NULL)
        {



            if((strcasecmp(temp->songpointer->songName,target))==0)
            {
                printf("Song No : %d\n",count);
                printf("song        :  %s\n",temp->songpointer->songName);
                printf("Artist      :  %s\n",temp->songpointer->artistName);
                printf("Duration    :  %d seconds\n",temp->songpointer->duration);
                printf("\n\n");
                count++;
            }

            temp=temp->nextSong;
        }


    }

    else if(option==2)
    {
        printf("Enter artist name to search song : \n");
        gets(target);


        temp=head;

        int count=1;
        while(temp!=NULL)
        {


            if((strcasecmp(temp->songpointer->artistName,target))==0)
            {
                printf("Song No : %d\n",count);
                printf("song        :  %s\n",temp->songpointer->songName);
                printf("Artist      :  %s\n",temp->songpointer->artistName);
                printf("Duration    :  %d seconds\n",temp->songpointer->duration);
                printf("\n\n");
                count++;
            }

            temp=temp->nextSong;
        }


    }

    else
    {
        printf("Invalid option\n");
        searchforAsong();

    }


}
void deleteASong()
{

    int target;
    printf("Enter the position/index of the song to be deleted: ");

    scanf("%d",&target);

    int i=1;
    temp=head;
    while(i<target-1)
    {
        temp=temp->nextSong;
        i++;

    }
    nextNode=temp->nextSong;
    temp->nextSong=nextNode->nextSong;
    free(nextNode);





}
void swapTwoSongs()
{

    int target1,target2;
    printf("Enter the position of the first song to be swapped:\n");

    scanf("%d",&target1);

    printf("Enter the position of the second song to be swapped:\n");

    scanf("%d",&target2);

    swapNodes(target1,target2);



}

void swapNodes(int x, int y)
{

    struct playlist **head_r;
    if (x == y)
        return;

    struct playlist *previous1 = NULL, *current2 = *head_r;
    while (current2 && current2->songpointer != x)
    {
        previous1 = current2;
        current2 = current2->nextSong;
    }

    struct playlist *previous2 = NULL, *current1 = *head_r;
    while (current1 && current1->songpointer != y)
    {
        previous2 = current1;
        current1 = current1->nextSong;
    }

    if (current2 == NULL || current1 == NULL)
        return;

    if (previous1 != NULL)
        previous1->nextSong = current1;
    else
        *head_r = current1;

    if (previous2 != NULL)
        previous2->nextSong = current2;
    else
        *head_r = current2;

    struct Node* temp = current1->nextSong;
    current1->nextSong = current2->nextSong;
    current2->nextSong = temp;
}
void playRandomSong()
{
//seed
    srand(time(0));

    int upper=countElement();//uppper limit will be the max elements in the list;

    int lower=1;

    int random_number = (rand() % (upper - lower + 1)) + lower;

    temp=head;
    printf("------PlayList--------- : \n-------%s-------------:\n",temp->playlistName);
    int count=1;
    while(temp!=NULL)
    {

        if(random_number==count)
        {
            printf("\n\n**Randomised**\n\n");
            printf("Song        :  %s\n\n",temp->songpointer->songName);
            printf("Artist      :  %s\n\n",temp->songpointer->artistName);
            printf("Duration    :  %d seconds\n\n",temp->songpointer->duration);
            printf("\n\n");
            break;
        }

        temp=temp->nextSong;
        count++;



    }



}

int countElement()
{
    int counter=0;
    temp=head;
    while(temp!=NULL)
    {

        temp=temp->nextSong;
        counter++;

    }
    return counter;

}
void shuffle()
{


    int len=countElement();

    newnode=(struct playlist *)malloc(len*(sizeof(struct playlist)));
    newnode->songpointer=(struct song *)malloc(len*(sizeof(struct song)));




//printf("len: %d",len);
//listarr=(struct playlist *)malloc(len*sizeof(struct playlist));

    temp=head;
    int index=0;

    while(temp!=NULL)
    {
        temp=temp->nextSong;

        newnode[index++].songpointer->duration=temp->nextSong;

        printf("lis : %d",newnode[index].songpointer->duration);

    }



}
void calcDuration()
{


    int sum=0;
    temp=head;
    printf("PlayList :  %s\n",temp->playlistName);

    int count=1;
    while(temp!=NULL)
    {

        sum=sum+temp->songpointer->duration;
        printf("Song No : %d\n",count);
        printf("song        :  %s\n",temp->songpointer->songName);
        printf("Duration    :  %d seconds\n",temp->songpointer->duration);
        printf("\n\n");
        temp=temp->nextSong;
        count++;





    }

    printf("Total Duration:  %d\n\n",sum);

}
void savePlaylistTofile()
{

    FILE * file;
    file=fopen("information.txt","a");


    int sum=0;
    temp=head;
    while(temp!=NULL)
    {



        fprintf(file,"%s   %s   %d\n",temp->songpointer->songName,temp->songpointer->artistName,temp->songpointer->duration);
        temp=temp->nextSong;





    }

    fclose(file);

    printf("Data successfullly saved to playlist");



}
void loadPlaylistFromfile()
{

    FILE * file;
    char name[100],playname[100];

    char song[100];
    char artist[100];
    int duration;
    gets(stdin);

    printf("Enter file name to laod from : ");
    gets(name);
    printf("Enter playlist name to laod from : ");
    gets(playname);

    file=fopen(name,"r+");

    if(file==NULL)
    {
        printf("File doesnt Exists\n");
    }

    int len=countElement();
    while(len!=0)
    {
        fscanf("%s %s %d",song,artist,&duration);

        createNode(playname,song,artist,duration);
        printf("%s %s %d\n",song,artist,duration);
        len--;


    }


    int sum=0;
    temp=head;
    while(temp!=NULL)
    {

        printf("song        :  %s\n",temp->songpointer->songName);
        printf("Duration    :  %d seconds\n",temp->songpointer->duration);
        printf("\n\n");
        temp=temp->nextSong;





    }

    fclose(file);






}
