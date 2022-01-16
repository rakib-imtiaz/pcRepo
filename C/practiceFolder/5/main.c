#include <stdio.h>
#include <stdlib.h>


void checkPalindrome(int *n)
{

    int original = *n;
    int rem=original;

    int remainder;
    int reversed;

    while (original!= 0)
    {
        remainder = original % 10;
        reversed = reversed * 10 + remainder;
        original /= 10;
    }
    if (rem == reversed)
        printf("ITs is a palindrome.");
    else
        printf(" IT is not a palindrome.");



}
int main()
{

    int n;
    printf("Enter a number : ");
    scanf("%d",&n);

    do
    {

        checkPalindrome(&n);

    }
    while(n!=0);


    return 0;
}
