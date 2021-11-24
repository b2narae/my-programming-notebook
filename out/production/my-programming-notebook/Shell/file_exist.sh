#!/bin/bash
filename=$1
if [ -e "$filename" ]; # -f, -e : check the existence
then
echo "file exists"
else
echo "file doesn't exist"
fi
