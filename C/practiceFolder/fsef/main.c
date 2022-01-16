#include <stdio.h>
#include <stdlib.h>



// 30---- 10 hour
// per hour 4/=

//10
//20
//7
int main()
{

    FILE *file;


    int array[1000];
    int count=0;

    file=fopen("usage.txt","r");

    for(int i=0; fscanf(file,"%d",&array[i])!=EOF ; i++)
    {
    count++;

       // printf("%d. %d\n",i,array[i]);
    }


    int billArray[3];
    int sum=0;
    int firstTenHour=30;

    for(int i=0; i<count ; i++)
    {

    sum=(array[i]-10)*4+firstTenHour;
    billArray[i]=sum;
    printf("%d : %d \n",i,billArray[i]);

    }


    FILE* file2;

    file2=fopen("Bill.txt","w");

    for(int i=0; i<count ; i++)
    {

    fprintf(file2,"%d \n",billArray[i]);

    }

    fclose(file);
    fclose(file2);


    return 0;
}
