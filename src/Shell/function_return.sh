#!/bin/bash
function greeting() {
str="Hello, $name"
echo $str
}

echo "Enter your name"
read name # This name would be used in greeting()
return=$(greeting) # function in bracket
echo "Return value : $return"