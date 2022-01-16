#include <iostream>

using namespace std;
int addtwonumbers(int a,int b);
int subtractTwoNUmbers(int a,int b);
int multiplyTwonumbers(int a,int b);
int divideTwonumbers(int a,int b);

int main()
{


int a,b;
cout<<"Enter a: ";
cin>>a;
cout<<"Enter b: ";
cin>>b;


int add=addtwonumbers(a,b);
int sub=subtractTwoNUmbers(a,b);
int mul=multiplyTwonumbers(a,b);
int div=divideTwonumbers(a,b);

cout<<"The addition is: "<<addtwonumbers(a,b)<<endl;
cout<<"The subtraction is: "<<subtractTwoNUmbers(a,b)<<endl;
cout<<"The multiplication is: "<<multiplyTwonumbers(a,b)<<endl;
cout<<"The division is: "<<divideTwonumbers(a,b)<<endl;



    return 0;
}


int addtwonumbers(int a,int b)
{


    return a+b;


}
int subtractTwoNUmbers(int a,int b)
{

    if(a>b)
        return a-b;
    else
        return b-a;


}

int multiplyTwonumbers(int a,int b)
{


    return a*b;

}

int divideTwonumbers(int a,int b)
{

    if(a>b)
        return a/b;
    else
        return b/a;
}

