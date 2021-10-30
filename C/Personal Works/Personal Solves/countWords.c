#include<stdio.h>
#include<string.h>

int main()
{

    char sentence[100]="C programming is awesome!";


    int word=0;
    int flag=0;

    for(int i=0; sentence[i]!='\0'; i++)
    {


        if(sentence[i]!=' ' && (sentence[i]>='a'&& sentence[i]<='z')|| (sentence[i]>='A'&& sentence[i]<='Z')|| (sentence[i]>='0'&& sentence[i]<='9'))
        {

            flag=1;

            if(sentence[i+1]=='\0')
            {
                word++;
            }
            continue;

        }
        else
        {
            if(flag==1)
            {
                word++;
                flag=0;
                continue;

            }
            else
            {
                flag=0;

                continue;
            }


        }




    }
    printf("words: %d",word);



    return 0;
}


