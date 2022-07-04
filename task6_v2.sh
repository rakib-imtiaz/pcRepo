#!/bin/sh
echo "enter a : "
read A
echo "enter b : "
read B

if [ $A -gt $B ]
then
    echo "TRUE\n"
else
    echo "FALSE\n"
fi 

echo "The difference between the numbers : " "$(($A-$B))"



