#!/bin/sh
printf "user name is : %s" $(whoami)

printf "Current date : \n"
date

printf "current working directory: \n"
pwd

printf "files in current working Directory: \n"

ls -d "$PWD"/* | wc -l

printf "Biggest file in the current working Directory \n"

ls -S | head -1




