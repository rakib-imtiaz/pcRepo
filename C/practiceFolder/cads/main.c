#include <stdio.h>
#include <string.h>

int main()
{

    char string[100];
    int d=0,spl=0,alpha=0;

    printf("Enter String: ");
    gets(string);

    char filteredString[100];


    int len=0;
    for(int i=0;i<strlen(string); i++)
    {

        if((string[i]>='a' && string[i]<='z' )|| (string[i]>='A' && string[i]<='Z'))
        {
            alpha++;
        }
        else if(string[i]>='0' && string[i]<='9' )
        {
            d++;
        }
        else
        {
            spl++;
        }


    }

    printf("Number of Alphabets in the stringing is: %d\n",alpha);
    printf("Number of Digits in the stringing is: %d\n",d);
    printf("Number of Special characters in the stringing is: %d\n",spl);
    printf("Filtered String: ");

    fileterString(string,filteredString);

    for(int i=0;i<strlen(filteredString);i++)
    {
    printf("%c",filteredString[i]);
    }



    return 0;
}


void fileterString(char *string,char *filteredString)
{


int d=0;

for(int i=0;i<strlen(string); i++)
    {

       if(string[i]>='0' && string[i]<='9' )
        {
            filteredString[d]=string[i];
            d++;
        }


    }


}
