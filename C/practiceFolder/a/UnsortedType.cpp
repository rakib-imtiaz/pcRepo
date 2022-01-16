//
// Created by User on 10/31/2021.
//

#include "UnsortedType.h"
#include "UnsortedType.h"
template <class ItemType>
UnsortedType<ItemType>::UnsortedType()
{
    length = 0;
    currentPos = -1;
}
template <class ItemType>
void UnsortedType<ItemType>::MakeEmpty()
{
    length = 0;
}
template <class ItemType>
bool UnsortedType<ItemType>::IsFull()
{
    return (length == MAX_ITEMS);
}
template <class ItemType>
int UnsortedType<ItemType>::LengthIs()
{
    return length;
}
template <class ItemType>
void UnsortedType<ItemType>::ResetList()
{
    currentPos = -1;
}
template <class ItemType>
void
UnsortedType<ItemType>::GetNextItem(ItemType& item)
{
    currentPos++;
    item = info [currentPos] ;
}
template <class ItemType>
void
UnsortedType<ItemType>::RetrieveItem(ItemType& item, bool &found)
{
    int location = 0;
    bool moreToSearch = (location < length);
    found = false;
    while (moreToSearch && !found)
    {
        if(item == info[location])
        {
            found = true;
            item = info[location];
        }
        else
        {
            location++;
            moreToSearch = (location < length);
        }
    }
}
template <class ItemType>
void UnsortedType<ItemType>::InsertItem(ItemType item)
{
    info[length] = item;
    length++;
}
template <class ItemType>
void UnsortedType<ItemType>::DeleteItem(ItemType item)
{
    int location = 0;
    while (item != info[location])
        location++;
    info[location] = info[length - 1];
    length--;
}
studentInfo::studentInfo()
{

    cgpa=0;
    id=0;
}
studentInfo::studentInfo(string name_val, int id_val, double cgpa_val)
{
    name= name_val;
    id=id_val;
    cgpa=cgpa_val;
}


void studentInfo::print()
{
    cout << "("<<id <<",  " << name <<",  " << cgpa<<")" ;
}
void studentInfo::Id(int temp)
{
    id=temp;
}
void studentInfo::Name(string  temp)
{
    name=temp;
}
void studentInfo::CGPA(double temp)
{
    cgpa=temp;
}

bool studentInfo :: operator==(studentInfo x)
{
    return (id==x.id);
}
bool studentInfo :: operator!=(studentInfo x2)
{
    return (id!=x2.id);
}
