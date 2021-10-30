#include <stdio.h>
#include <stdlib.h>

int main()
{


    int number;

    printf("Enter a number to spell\n");
    scanf("%d",&number);
    if(number==0)
    {
        printf("zero");
    }
    if(number<=10);
    {
        less_than_eleven(number);

    }
    if(number>10 && number<=100)
    {
        //45
        int temp=number;//100
        int first=temp/10;
        int second=temp%10;// temp=45/10storing the first value for two digit number
        ty_speller(first);
        less_than_eleven(second);



    }

if(number>100&&number<999)
    {

        int temp=number;//987
        int first=temp/100;//9
        int second=temp%100;
            second=second/10;//8
        int third=number%10;//7

       // printf("1.%d\n",first);
        //printf("2.%d\n",second);
        //printf("3.%d\n",third);

        // temp=45/10storing the first value for two digit number

        less_than_eleven(first);
        printf(" hundred ");
        ty_speller(second);
        less_than_eleven(third);



    }

    if(number>999 && number<=9999){

    int temp=number;//1598
        int first=temp/1000;//1
        int second=temp%1000;//598
            second=second/100;//5
        int third=number%100;
            third=third/10;//9
        int fourth=number%10;//8



       // printf("1.%d\n",first);
        //printf("2.%d\n",second);
        //printf("3.%d\n",third);

        // temp=45/10storing the first value for two digit number

        less_than_eleven(first);
        printf(" thousand ");
        less_than_eleven(second);
        printf(" hundred ");
        ty_speller(third);
        less_than_eleven(fourth);






    }






















    return 0;
}


void less_than_eleven(int n)
{
    switch(n)
        {
        case 1:
            {
                printf(" One");
                break;
            }
        case 2:
            {
                printf(" Two");
                break;
            }
        case 3:
            {
                printf(" Three");
                break;
            }
        case 4:
            {
                printf(" Four");
                break;
            }
        case 5:
            {
                printf(" Five");
                break;
            }
        case 6:
            {
                printf(" Six");
                break;
            }
        case 7:
            {
                printf(" Seven");
                break;
            }
        case 8:
            {
                printf(" Eight");
                break;
            }
        case 9:
            {
                printf(" Nine");
                break;
            }
             case 10:
            {
                printf(" Ten");
                break;
            }



        }

}




void less_than_twenty(int n)
{





        switch(n){

            case 11:{
            printf(" eleven");
            break;}

            case 12:{
            printf(" twelve");
            break;}
            case 13:{
            printf(" thirteen");
            break;}
            case 14:{
            printf(" fourteen");
            break;}
            case 15:{
            printf(" fifteen");
            break;}
            case 16:{
            printf(" sixteen");
            break;}
            case 17:{
            printf(" seventeen");
            break;}
            case 18:{
            printf(" eighteen");
            break;}
            case 19:{
            printf(" nineteen");
            break;}
            case 20:{
            printf(" twenty");
            break;}
            case 30:{
            printf(" thirty");
            break;}
            case 40:{
            printf(" forty");
            break;}
            case 50:{
            printf(" fifty");
            break;}
            case 60:{
            printf(" sixty");
            break;}
            case 70:{
            printf(" seventy");
            break;}
            case 80:{
            printf(" eighty");
            break;}
            case 90:{
            printf(" ninety");
            break;}
            case 100:{
            printf(" hundred");
            break;}

}


}


void ty_speller(int n){
    switch(n){


            case 1:{
            printf(" ten");
            break;}
            case 2:{
            printf(" twenty");
            break;}
            case 3:{
            printf(" thirty");
            break;}
            case 4:{
            printf(" forty");
            break;}
            case 5:{
            printf(" fifty");
            break;}
            case 6:{
            printf(" sixty");
            break;}
            case 7:{
            printf(" seventy");
            break;}
            case 8:{
            printf(" eighty");
            break;}
            case 9:{
            printf(" ninety");
            break;}
            case 10:{
            printf(" hundred");
            break;}

    }


}








void less_than_thousand(int n){
    int first,second,third;





}

void function (int m,int n )
{

    int y= (2*m-n);

    return y;

}


