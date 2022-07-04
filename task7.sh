#!/bin/sh

points=0

echo "1.Is The Earth Flat\n1.True\n2.False\n";
read s;
if [ $s -eq "1" ]; then
    points=$((points+1))
fi
echo "2.Donald trump is the current President?\n1.True\n2.False\n";
read s;
if [ $s -eq "1" ]; then
    points=$((points+1))
fi
echo "3.We have two orbits?\n1.True\n2.False\n";
read s;
if [ $s -eq "1" ]; then
    points=$((points+1))
fi
echo "4.we are mortal\n1.True\n2.False\n";
read s;
if [ $s -eq "1" ]; then
    points=$((points+1))
fi
echo "5.GTA V sucks? \n1.True\n2.False\n";
read s;
if [ $s -eq "1" ]; then
    points=$((points+1))
fi
echo "6.is this 2022\n1.True\n2.False\n";
read s;
if [ $s -eq "1" ]; then
    points=$((points+1))
fi
echo "7.IPhone is Better than Android?\n1.True\n2.False\n";
read s;
if [ $s -eq "1" ]; then
    points=$((points+1))
fi
echo "8.Working in Fiverr sucks ? \n1.True\n2.False\n";
read s;
if [ $s -eq "1" ]; then
    points=$((points+1))
fi
echo "9.Everybody loves tesla?\n1.True\n2.False\n";
read s;
if [ $s -eq "1" ]; then
    points=$((points+1))
fi
echo "10.Bitcoin is the futures most valuable CryptoCurrency?\n1.True\n2.False\n";
read s;
if [ $s -eq "1" ]; then
    points=$((points+1))
fi

echo "You got : "$points" Points!"