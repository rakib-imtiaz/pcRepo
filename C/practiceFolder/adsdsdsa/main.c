#include <stdio.h>
#include <string.h>

/*
1. [7 points] Write a single recursive C function that takes a number n as a parameter and prints all natural numbers from n to 1 (i.e., from upper to lower) and then again 1 to n with 0 in the middle. For example, for n = 5, it will print: 5 4 3 2 1 0 1 2 3 4 5.

2. [11 points] Write a function that takes a string as a parameter and prints the encoded version of that string. The original string should not be altered. Also, call this function from the main function on an input string. You need to follow the following encoding scheme:

'a' -> 'z'

'b' -> 'y'

....

'z' -> 'a'

'A' -> 'Z'

'B' -> 'Y'

...

'Z' -> 'A'

For example: for the parameter "Bye, A" your function should print "Ybv, Z".


3. [13 points] Write a C program that reads a matrix from the user and then prints the smallest number in each row of that matrix.


4. [4 points] Answer (a) if the 7th digit of your NSU ID is odd, otherwise answer (b):

a) What is a pointer variable? What are the operators that you use for pointers? Use example code to illustrate.

b) Illustrate call by reference using example codes.

*/

void encodeString(char *str)
{

    char temp[strlen(str)];

    int length=strlen(str);

    int counter=0;
    for(int i='a'; i<'z'; i++)
    {

        temp[counter]=str[length-i];

    }







}
int main()
{


    return 0;
}
