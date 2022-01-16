#include <iostream>
#include "UnsortedType.cpp"

using namespace std;
int main()
{
    bool found;
    int size,number;
    string name;
    UnsortedType <int> l;
    cout << "Enter 4 numbers : ";
    for(int i=0; i<4; i++)
    {

        cin>>number;
        l.InsertItem(number);
    }
    cout << "List length is :" << l.LengthIs()<<endl;
    cout << "Enter one more  : ";
    cin>>number;
    l.InsertItem(number);

    cout << "List is : ";
    for(int i=0; i<l.LengthIs(); i++)
    {
        l.GetNextItem(number);
        cout << number << " ";
    }

    cout << endl;
    cout << "Retrieve 4 items from the list :"<< endl;
    for(int i=0; i<4; i++)
    {
        cout<<"Enter the number for retrieve: ";
        cin>>number;
        l.RetrieveItem(number,found);
        if(found)
            cout << "Item Found" << endl;
        else
            cout << "Item not found " << endl;
    }
    if(l.IsFull())
        cout << "List is full"<<endl;
    else
        cout << "List is not full"<<endl;

    cout << "Delete an item from the list :";
    cin>> number;
    l.DeleteItem(number);

    if(l.IsFull())
        cout << "List is full"<<endl;
    else
        cout << "List is not full"<<endl;
    for(int i=0; i<2; i++)
    {
        cout << "Delete an item from the list :";
        cin>> number;
        l.DeleteItem(number);
        cout << "After deleting list is: ";
        l.ResetList();
        for(int i=0; i<l.LengthIs(); i++)
        {
            l.GetNextItem(number);
            cout << number << " ";
        }
        cout << endl;
    }
    UnsortedType <studentInfo> l1;
here:
    cout << "Enter the number of the list : ";
    cin>>size;
    if(size<0 || size>5)
        goto here;
    studentInfo x1;
    for(int i=0; i<size; i++)
    {
        cout << "Enter Student" <<" ["<<i+1<<"] :"<<endl;
        fflush(stdin);
        cout<< " name :";
        cin>>name;
        x1.Name(name);
        cout<< " ID :";
        cin>>number;
        x1.Id(number);
        cout<< " CGPA :";
        cin>>number;
        x1.CGPA(number);
        l1.InsertItem(x1);
    }
    cout << "Item list:"<<endl;
    for(int i=0; i<l1.LengthIs(); i++)
    {
        l1.GetNextItem(x1);
        x1.print();
        cout << endl;
    }
    cout << endl;
    cout << "Enter ID to delete student's record : ";
    cin>>number;
    x1.Id(number);
    l1.DeleteItem(x1);
    cout << "Enter Id to retrieve student's record : ";
    cin>>number;
    x1.Id(number);
    l1.RetrieveItem(x1,found);
    x1.print();
    if(found)
        cout << "Item Found" << endl;
    else cout << "Item not found " << endl;
    l1.ResetList();
    cout << "Student List :"<<endl;
    for(int i=0; i<l1.LengthIs(); i++)
    {
        l1.GetNextItem(x1);
        x1.print();
        cout << endl;
    }

    return 0;
}
