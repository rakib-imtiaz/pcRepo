#include <stdio.h>
#include <string.h>

int main()
{

    FILE * file;
    char str[1000];
    file = fopen("Input-sample.txt","r");

    FILE * newFile;

    newFile=fopen("output.txt","w");

    int max=0;
    printf("conetents:\n\n ");

    while(fgets(str,100,file)!=NULL)
    {

        fprintf(newFile,"%s\n",str);
    }

    int count=0;
    for(int i=0;str[i]!='\0';i++)
    {
            if(i>='a' && i<='z' || i>='A' && i<='Z')
            {
            count++;
            }
    }

    printf("%d",count);

    fprintf(newFile,"\nNumber of Chars :  %d\n",count);


    int n=256;

    char map[256]= {0};


    for(int i=0; i<n; i++)
    {

        map[str[i]]++;

    }




    for(int i=0; i<n; i++)
    {



        if(map[i]>0)
        {


            if(i>='a' && i<='z' || i>='A' && i<='Z')
            {
                fprintf(newFile,"%c = %d \n",i,map[i]);

            }

        }
    }


    fclose(newFile);








    fprintf(newFile,"Missing alphabets are =  \n");

    for(int i=0; i<n; i++)
    {



        if(map[i]<0)
        {

            if(i>='a' && i<='z' || i>='A' && i<='Z')
            {
                fprintf(newFile,"%c ,\n",i,map[i]);

            }

        }
    }







    return 0;
}
