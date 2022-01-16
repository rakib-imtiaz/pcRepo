#include <stdio.h>

int main()
{

    char filename[100];
    printf("Input the file name to be opened: ");
    gets(filename);
    printf("The content of the file  are: \n");

    FILE *file;
    file=fopen(filename,"r");

    char text[100];

    int flag=0;

    while(fgets(text,60,file)!=NULL)
    {
        printf("%s\n",text);
        flag++;
    }

    printf("\nThe lines in the file are: %d",flag);


    return 0;
}
