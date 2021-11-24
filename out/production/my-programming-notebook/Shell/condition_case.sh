#!/bin/bash

# case must be ended with 'esac'
# else case is covered by '*)'
echo "Enter your name"
read name
case $name in
101)
echo "You are 101" ;;
500)
echo "You are 500" ;;
taekhwan)
echo "You are taekhwan" ;;
*)
echo "You are $name" ;;
esac
