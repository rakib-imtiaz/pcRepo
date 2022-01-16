#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    printf("Enter n: ");
    scanf("%d",&n);
    int array[n][n];

    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n; j++)
        {
            scanf("%d",&array[i][j]);
        }
    }

    int temp=0;

    for (int i = 0; i < n; ++i)
    {

        for (int j = i + 1; j < n; ++j)
        {
            if (array[i][j] > array[i][j])
            {
                temp =array[i][j];
                array[i][j] = array[i][j+1];
                array[i][j] = temp;
            }
        }
    }

    printf("2nd largest element  : %d",array[n-1]);


    return 0;
}
