#!/bin/bash


touch file1.txt
touch file2.txt

printf "1\n2\n4\n6\n" >file1.txt

printf "1\n2\n89\n6\n7\n" >file2.txt


printf "only in file 1\n"
grep -Fxvf file2.txt file1.txt 



printf "only in file 2\n"

grep -Fxvf file1.txt file2.txt 


