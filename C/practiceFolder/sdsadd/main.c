#include<stdio.h>
#include<string.h>


void encode(char *str)
{

    char *temp;
    strcpy(temp,str);
    for(int i=0; i<126; i++)
    {
        if(str[i]>='a' && str[i]<='z')
        {
            temp[i]=str[len-i];
        }

        printf("%s ",temp);

    }


}



int main()
{

    char str[100];
    printf("Enter string : ");
    gets(str);


    return 0;
}
