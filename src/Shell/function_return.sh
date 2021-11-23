#!/bin/bash
function greeting() {
str="Hello, $name"
echo $str #no return, but echo
}

echo "Enter your name"
read name

val=$(greeting) #greeting function returns value
echo "Return value of the function is $val"