#include <stdio.h>

void upload(int height,int width,int length);


void upload(int height,int width,int length)
{


    if(width<length && height<length)
    {
        printf("UPLOAD ANOTHER\n");

    }
    else if (width>length && height>length && height==width)
    {

        printf("ACCEPTED\n");
    }
    else
    {

        printf("CROP IT\n");

    }


}




int main()
{
    int length;
    printf("Enter length:");
    scanf("%d",&length);
    int total;
    printf("Enter Total Photos:");
    scanf("%d",&total);
    printf("Enter Height and width of the photos\n");

    int height;
    int width;
    int i;

    for(i=0; i<total; i++)
    {
        printf("Height: ");
        scanf("%d",&height);

        printf("width: ");
        scanf("%d",&width);

        upload(height,width,length);
        printf("\n");



    }



    return 0;
}
