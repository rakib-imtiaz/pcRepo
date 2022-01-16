#include <stdio.h>
#include <stdlib.h>
#include <math.h>
float distance(int x1, int y1, int x2, int y2);
float ar(int x1, int y1, int x2, int y2, int x3, int y3);

int main()
{

    int x1,x2,x3;

    printf("Enter x1: ");
    scanf("%d",&x1);
    printf("Enter x2: ");
    scanf("%d",&x2);
    printf("Enter x3: ");
    scanf("%d",&x3);

    int y1,y2,y3;

    printf("Enter y1: ");
    scanf("%d",&y1);
    printf("Enter y2: ");
    scanf("%d",&y2);
    printf("Enter y3: ");
    scanf("%d",&y3);

    printf("Distance between two points:  %d",distance(x1,y1,x2,y2));
    printf("Area of triangle : %.2lf",ar(x1,y1,x2,y2,x3,y3));






    return 0;
}
float distance(int x1, int y1, int x2, int y2)
{
    return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2) * 1.0);
}

float ar(int x1, int y1, int x2, int y2, int x3, int y3)
{
    float a, b, c, area, S;
    a = dis(x1, y1, x2, y2);
    b = dis(x1, y1, x3, y3);
    c = dis(x2, y2, x3, y3);
    S = (a + b + c) / 2;
    area = sqrt(S*(S - a)*(S - b)*(S - c));
    return (area);
}
