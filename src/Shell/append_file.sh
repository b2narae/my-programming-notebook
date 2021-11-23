#!/bin/bash
echo "Before appending the file"
echo "---------------"
cat delete_file.sh

echo "Learning is important" >> delete_file.sh # >> operation is to add String to file
echo "After appending the file"
echo "---------------"
cat delete_file.sh