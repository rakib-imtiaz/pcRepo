#!/bin/bash

#adding the color codes to the variables

RED='\033[0;31m'
NC='\033[0m'
YELLOW='\033[1;33m'

printf "${YELLOW}DATE AND TIME DETAILS: ${NC}\n\n">> SystemMonitor.log
date >> SystemMonitor.log

printf "\n\n${RED}Current Users : \n ${NC}" >> SystemMonitor.log
printf "\n\n\n" >> SystemMonitor.log

who >> SystemMonitor.log

printf "\n\n${RED}Current Processess : \n\n\n${NC}" >> SystemMonitor.log

ps -aux | less >> SystemMonitor.log
printf "\n\n${RED}Top 5 CPU utilizing Processess : ${NC}\n\n\n" >> SystemMonitor.log

ps -eo pid,ppid,cmd,%mem,%cpu --sort=-%cpu | head -n 6 >> SystemMonitor.log

printf "\n\n${RED}Device Plugged in: ${NC}\n\n\n" >> SystemMonitor.log

lsusb  >> SystemMonitor.log

printf "\n\n${RED}Overall Disk Usuage: ${NC}\n\n\n" >> SystemMonitor.log

df >> SystemMonitor.log
printf "\n\n${RED}USers home Directory Disk Usage:  ${NC}\n\n\n" >> SystemMonitor.log
du -sh /home/$(eval 'whoami')/Desktop  | xargs >> SystemMonitor.log

printf "\n\n${RED}Other Directories Disk Usage:${NC} \n\n\n" >> SystemMonitor.log

ls -l -d */ >> SystemMonitor.log

printf "\n\n${RED}NetWork Interfaces : ${NC}\n\n\n" >> SystemMonitor.log

cat /proc/net/dev >> SystemMonitor.log

printf "\n\n${RED}Showing nmcli Connections: ${NC}\n\n\n" >> SystemMonitor.log
nmcli connection show>> SystemMonitor.log

