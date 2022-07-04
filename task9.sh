#!/bin/sh


echo "Enter a filename : "
read FILE

if [ -f "$FILE" ]; then
    echo "$FILE exists."
else 
 touch $FILE
    echo "File isnt exists successfully!"
    echo "File created successfully!"
fi
