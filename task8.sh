#!/bin/bash


#declaring the array
declare -a numberArray



for i in {1..5}
do
printf "Enter number : "

read s
numberArray[$i]=$s
done
printf "Multiplication : "
echo $(($(IFS="*"; echo "${numberArray[*]}")))


printf "sum of integers : "

sumOfNumbers=$(($(IFS="+"; echo "${numberArray[*]}")))

echo $(($(IFS="+"; echo "${numberArray[*]}")))

printf "Average : "


echo "$(($sumOfNumbers/10))"

#for searching the maximum number

max=${numberArray[0]}

for n in "${numberArray[@]}" ; do
    ((n > max)) && max=$n
done

echo "Max number : "
echo $max


#for searching the minimum number

min=${numberArray[0]}
for n in "${numberArray[@]}" ; do
    ((n < min)) && min=$n
done

echo "Min number : "
echo $min
