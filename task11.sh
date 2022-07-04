#!/bin/sh

file="file.txt"

if [ -f "$file" ]; then
    echo "$file already exists.! ERROR(enter another name)"
else 

touch $file
echo "5 6 3 7 4 4 9 6 7 9 8 2 3 6 4 5 1 1 3 10 12" >> $file
fi

while IFS= read -r line
do
  echo "$line"
done < "$file"



tr [:space:] '\n'< $file >> temp.txt

sort -n -u temp.txt 

