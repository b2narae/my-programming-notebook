#!/bin/bash

string1="Linux"
string2="Hint"
echo "$string1$string2" #just relay
string3=$string1+$string2 # + doesn't work
string3+=" is a good tutorial blog site" # + work here
echo $string3

