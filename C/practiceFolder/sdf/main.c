#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("Hello world!\n");
    return 0;
}


int letter_grade(int points)
{

    char grade;
    int jusmissed=0;


    if(points==89 || points==79 || points==69||points==59)
    {
    jusmissed=1;

    }

    if(points>=90 && points<=100)
    {
        grade='A';
    }
    else if(points>=89 && points<=80)
    {
    grade='B';
    }
    else if(points>=79 && points<=70)
    {
    grade='C';
    }
    else if(points>=69 && points<=60)
    {
    grade='D';
    }
    else if(points>=60)
    {
    grade='F';
    }
    printf("Grade:  %c",grade);

    return jusmissed


}
