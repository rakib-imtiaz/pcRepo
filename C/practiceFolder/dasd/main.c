#include<stdio.h>
#include<conio.h>
#include<string.h>

struct MovieStar
{
    char Name[15];
    float Rating;
    int TotalFans;
};

void main()
{
    int i,j,N,res,m;
    float r;
    char name[15];
    struct MovieStar ms[5];
    clrscr();
    printf("\nEnter 5 MovieStars names : \n");
    for(i=0; i<5; i++)
    {
        scanf("%s",&ms[i].Name);
    }
    printf("\nEnter number of user reviews : ");
    scanf("%d",&N);
    for(i=0; i<5; i++)
    {
        ms[i].Rating = 0.0;
        ms[i].TotalFans = 0;
    }
    for(i=0; i<N; i++)
    {
        printf("\nReview : %d",i+1);
        printf("\nEnter MovieStar name : ");
        scanf("%s",&name);
        for(j=0; j<5; j++)
        {
            res = strcmp(name, ms[j].Name);
            if(res==0)
            {
                m = j;
            }
        }
        printf("\nEnter your rating : ");
        scanf("%f",&r);
        ms[m].Rating = ms[m].Rating + r;
        ms[m].TotalFans = ms[m].TotalFans + 1; //average rating
    }
    for(i=0; i<5; i++)
    {
        ms[i].Rating = ms[i].Rating/ms[i].TotalFans;
    }
    //printing MovieStar's ratings
    printf("\nMovieStar's Rating \n");
    for(i=0; i<5; i++)
    {
        printf("\nName : %s",ms[i].Name);
        printf("\nAverage rating : %f ",ms[i].Rating);
        printf("\nTotal Fans : %d \n",ms[i].TotalFans);

    }
}
