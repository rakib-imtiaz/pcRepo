#!/bin/sh

touch file1.txt,file2.txt,file3.txt

for file in *.txt; do
    mv "$file" "${file}.$(date)"
done