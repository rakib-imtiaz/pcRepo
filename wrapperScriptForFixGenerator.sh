#!/bin/sh
#echo "$USER"


DIR="/home/"$USER"/FixGen/"

if [ -d "$DIR" ]; then
  # Take action if $DIR exists. #
  echo "already in place!"

  else
  echo "Setting up the environment...."

  mkdir -p /home/"$USER"/FixGen/log/
  
  echo "Moving The script to the FixGen folder in your home Directory..."

  cp -R fixGenerator.sh /home/"$USER"/FixGen/

  echo "Done!\n"
  echo "Now Navigate to your Home directory, you will find the FixGen folder"

echo "zipping the folder .... "

zip -r t.zip ~/FixGen/log/ $(find ~/FixGen/log/ -name '*.log' -type f -mmin 10)

echo "0 1 * * * /root/test.sh" | tee -a /var/spool/cron/root

echo "cron job added successfully"

fi




