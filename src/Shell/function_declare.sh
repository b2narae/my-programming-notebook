#!/bin/bash
function F1() # 'F1()' works the same
{
echo "This is F1"
}
F1 # no need to use '()'

F2()
{
echo "This is F2"
}
F2