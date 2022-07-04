#!/bin/bash

touch temp.txt

cat ~/FixGen/log/*.log > temp.txt

LOG="temp.txt"

echo "Client, Message type, stock, quantity, price, side, order id, last quantity, exec id, last price" > 1.csv

< $LOG awk '{print $1","$2","$3 "," $4 "," $5 "," $6","$7 "," $8","$9","$10}' >> fix.csv

echo "CSV file generated successfully!"