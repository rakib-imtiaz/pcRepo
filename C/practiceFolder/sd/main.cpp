#include<iostream>
#include<unistd.h>
using namespace std;
int main()
{
    int customerId,i,check;
    bool confirm=false;
    char fullName[20]="";
    cout<<"\n\"Welcome Sir!\"\n\n";
    cout<<"Enter your customerID:";
    cin>>customerId;
    cout<<"Your customer ID is:"<<customerId<<"\n";
    cout<<"Enter your name:";
    cin>>fullName;
    cout<<"Your name is:"<<fullName<<"\n";
    cout<<"\nThank you for your patience.\nYour account is creating,please wait";
    for(i=1; i<8; i++)
    {
        sleep(1);
        cout<<".";
    }
    system("cls");
    cout<<"\a\nYour account hasbeen created successfully based on the following information-\n";
    cout<<"Name:"<<fullName<<"\n";
    cout<<"CustomerID:"<<customerId<<"\n";
    cout<<"\nAre you ready to pay bill?\n";
    cout<<"0.Not Ready\n1.Ready\n";
    cout<<"Enter your choice:";
    cin>>check;
    if(check==0)
    {
        system("cls");
        cout<<"\nYour are not ready for paying bill.\nThank you for your time,see you again.Bye Bye!\n";
    }
    else if(check==1)
    {
        system("cls");
        cout<<"\nAre you sure you want to paybill?\n";
        cout<<"0.No\n1.Yes\n";
        cout<<"Enter your choice:";
        cin>>confirm;
        if(confirm==true)
        {
            cout<<"\n\n\t\"\Welcome!\"";
        }
        else
        {
            cout<<"\nYour are not ready for paying bill.\nThank you for your time,see you again.Bye Bye!\n";
        }
    }
    return 0;
}
