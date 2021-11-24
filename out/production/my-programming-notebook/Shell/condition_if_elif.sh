#!/bin/bash
echo "Enter your luck number"
read number

if [ $number -eq 101 ]
then
echo "You got 1st prize"
elif [ $number -eq 510 ]
then
echo "You got 2nd prize"
else
echo "Sorry, try for the next time"
fi