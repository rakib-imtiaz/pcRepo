//
// Created by User on 10/31/2021.
//

#ifndef LAB4TASK1_UNSORTEDTYPE_H
#define LAB4TASK1_UNSORTEDTYPE_H

const int MAX_ITEMS = 5;
#include<iostream>
using namespace std;
template <class ItemType>
class UnsortedType {
public :
    UnsortedType();
    void MakeEmpty();
    bool IsFull();
    int LengthIs();
    void InsertItem(ItemType);
    void DeleteItem(ItemType);
    void RetrieveItem(ItemType&, bool&);
    void ResetList();
    void GetNextItem(ItemType&);
private:
    int length;
    ItemType info[MAX_ITEMS];
    int currentPos;
};
class studentInfo {
public:
    studentInfo();
    studentInfo(string, int , double );
    void print();
    void Id(int);
    void Name(string);
    void CGPA(double);
    bool operator ==(studentInfo);
    bool operator!=(studentInfo);

private:
    string name;
    int id;
    double cgpa;
};

#endif //LAB4TASK1_UNSORTEDTYPE_H
