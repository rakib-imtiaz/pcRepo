#!/bin/bash


touch file1.txt
touch file2.txt

printf "cat\ndog\ncow" >file1.txt

printf "horse\ndog\nparrot" >file2.txt


printf "Common word found : "
comm -12 <( sort file1.txt ) <( sort file2.txt )



