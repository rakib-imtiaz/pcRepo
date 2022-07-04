#!/bin/bash


printf  "enter your password to check how strong is it : "

read password

length= ${#password}

if [[ $(echo "$password" | awk '/[a-z]/ && /[A-Z]/ && /[0-9]/')  ]]; then  
    echo "String meets your requirements"
else 
    echo "String does not meet your requirements"
fi
