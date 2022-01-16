#include <stdio.h>
#include <stdlib.h>


void checkPalindrome(int *n)
{

       int r,sum=0,temp;
        temp=*n;
        while(*n>0)
        {
        r=*n%10;
        sum=(sum*10)+r;
        *n=*n/10;
        }
        if(temp==sum)
        printf("this is palindrome number \n");
        else
        printf("this is not palindrome\n");



}
int main()
{

    int* n;
    while(1){
         printf("Enter a number : ");
        scanf("%d",&n);
        int a=n;
        if(a==0)
            break;
        checkPalindrome(&n);
    }



}
