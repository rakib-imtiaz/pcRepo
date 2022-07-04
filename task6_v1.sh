#!/bin/sh
echo "enter a : "
read A
echo "enter b : "
read B

if [ $A -gt $B ]
then
    echo "TRUE"
else
    echo "FALSE"
fi


