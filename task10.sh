#!/bin/sh



if [ -f "$1" ]; then
    echo "$FILE already exists.! ERROR(enter another name)"
else 
 touch $1
fi

filename=$1
line=$2

shuf -i 0-3600 -n $line > $filename
