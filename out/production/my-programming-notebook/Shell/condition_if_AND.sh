#!/bin/bash

echo "Enter number1"
read number1
echo "Enter number2"
read number2

# if '[' is single then you can't use '&&' inside.
# In case of '[[', you can use '&&' inside, still you can use '(' inside.
# -eq, -lt, -gt, -ne is expected to use in number operation
if [ $number1 -eq 10 ] && [ $number2 -eq 10 ] # == if [[ $number1 -eq 10 && $number2 -eq 10 ]]
then
echo "two numbers are 10"
else
echo "Not all numbers is 10"
fi

if [[ $number1 == "admin" && $number2 == "secret" ]];
then
echo "valid user"
else
echo "invalid user"
fi