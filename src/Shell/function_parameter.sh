#!/bin/bash
# command line input 1 2
Rectangle_Area() {
area=$(($1 * $2))
echo "Area is : $area"
}

Rectangle_Area 10 20
echo "input1 : $1 / input2 : $2"