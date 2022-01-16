#include <stdio.h>
#include <stdlib.h>

int main()
{

    FILE *fptr,*fptr2;

    fptr2=fopen("bill.txt","w");
    fptr=fopen("usage.txt","r");

    int amount[1000],billArray[3],sum=0,j=0,i=0;


    while(fscanf(fptr,"%d",&amount[j])!=EOF )
    {

        sum=(amount[i]-10)*4+30;
        billArray[i]=sum;
        fprintf(fptr2,"%d \n",billArray[i]);

        j++;
        i++;
    }


    fclose(fptr);
    fclose(fptr2);


    return 0;
}
