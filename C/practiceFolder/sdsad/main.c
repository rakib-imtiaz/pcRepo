#include <stdio.h>
#include <stdlib.h>

int main()
{
    char playerName[100][50];
    int run[5];


    int n=5;

    int sum=0;


    FILE *file;
    file=fopen("Scores.txt","w");
    for(int i=0; i<n; i++)
    {
        printf("Player %d Name : \n",i+1);
        gets(playerName[i]);
        fprintf(file,"%s ",playerName[i]);
        printf("Player %d Runs : \n",i+1);
        scanf("%d",&run[i]);
        fprintf(file,"%d\n",run[i]);
        gets(stdin);


        sum=sum+run[i];
    }
    fclose(file);

    double avrg=sum/n;


    printf("Players with more than average runs : \n");
    for(int i=0; i<n; i++)
    {

        if(run[i]>avrg)
        {
        printf("%s",playerName[i]);
            printf(",Runs :%d \n",run[i]);
        }


    }


    return 0;
}
