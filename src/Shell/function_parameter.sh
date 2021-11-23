#!/bin/bash

Rectangle_Area() { #function in bash couldn't be declared with the parameter
area=$(($1*$2)) #$1 : first parameter, $2 : second parameter
echo "Area is : $area"
}
Rectangle_Area 10 20