#include <stdio.h>
int getLines(char *fname);

int main()
{

    char fname[100];
    printf("Enter your filename : ");
    gets(fname);

    int n =getLines(fname);


    printf("\nThere are : %d  lines in file",n);


    return 0;
}

int getLines(char *fname)
{
    printf("FILE CONTENTS : \n");

    FILE *fp;
    char str[100];
    int line=0;

    fp=fopen(fname,"r");

    while(fgets(str,100,fp)!=NULL)
    {
        printf("%s\n",str);
        line++;
    }

    return line;

}
