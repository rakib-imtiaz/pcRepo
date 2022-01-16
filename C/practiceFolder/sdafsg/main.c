#include <stdio.h>
#include <stdlib.h>

int main()
{

    int m=25,n=77;
    char c='*';

    int *itemp;


    m=&n;
    // m is not a pointer, cant store address of varibale in normal varible

    itemp=m; // in item address off a varibale should be stored not value

    // cant store character in int pointer, the type should be same;

    *itemp=c;

    *itemp=&c; //value should be store in pointer variable, not address




    return 0;
}
