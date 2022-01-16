#include <stdio.h>
#include <stdlib.h>

int main()
{

    int stage;
    printf("stage : ");
    scanf("%d",&stage);
    rightTri(stage);



    return 0;
}
int rightTri(int n)
{

    for(int i=0; i<n; i++)
    {
        for(int j=n; j>i; j--)
        {
            printf(" ");
        }

        for(int j=i; j>=0; j--)
        {
            printf("#");
        }
      //  printf("\n");

       for(int j=0; j<n; j++)
        {
            printf(" ");

        }
          for(int j=i; j>=0; j--)
        {
            printf("#");
        }
        printf("\n");

    }

}

