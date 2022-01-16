#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{

    int lower,upper;


    int l1,l2;
    printf("Hello Lets play the game : \n");
    printf("Give your range, i will take a numnber : !!!\n");
    printf("First Limit : ");
    scanf("%d",&lower);
    printf("Second Limit : ");
    scanf("%d",&upper);

    srand(time(0));


    int num = (rand() % (upper - lower + 1)) + lower;


    int count_guess=0;
    int guess;




    do
    {
    printf("Guess my number: ");
        scanf("%d",&guess);
        if(guess<num)
        {

            printf("Thats too small\n");
            count_guess++;
        }
        else if(guess>num)
        {
            printf("Thats too big");

        }
        else
        {
            printf("Congratulations!! you had to Guess %d times to find my number",count_guess);
            break;
        }

    }
    while(1);




    return 0;
}
