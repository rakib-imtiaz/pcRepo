#include <iostream>

using namespace std;

class complex{
    private :
        int a,b;

    public:
        void set_data(int x,int y)
        {
            a=x;
            b=y;
        }
    void show_data()
    {
        cout<<a<<endl;
        cout<<b<<endl;


    }

    complex add(complex d ){
        complex sum;
        sum.a=a+d.a;
        sum.b=b+d.b;

    return sum;





    }



};

int main()
{

     complex a,b,c;
    a.set_data(10,20);
    b.set_data(30,40);
    c=a.add(b);

    c.show_data();








    return 0;
}
