#include <stdio.h>
#include <string.h>
void swap_arrays(int *arr,int size)
{
    int i,temp;

    for(int i=0; i<size; i++)
    {
        temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
}
int main()
{
    int size;

    printf("Enter array size :");
    scanf("%d",&size);

    int array[size];

    for(int i=0; i<size-1; i++)
    {
        scanf("%d",&array[i]);

    }

    swap_arrays(array,size);

    printf("swapped array: ");

    for(int i=0; i<size-1; i++)
    {
        printf("%d  \n",array[i]);

    }

    return 0;
}
