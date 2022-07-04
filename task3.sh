#!/bin/sh

filename="$(date).txt"

#shuf -i 0-3600 -n $line > $filename



shuf -i 1-50 -n 5 >>$filename
shuf -i 1-10 -n 1 >>$filename

printf "enter your lottery number  "

read number


if grep -q $number "$filename"; then

    printf "lottery macthced"

else 
printf "not matched, better luck next time.."
 
fi