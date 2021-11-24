#!/bin/bash
echo "Enter directory name"
read ndir
if [ -d $ndir ] # -d : to test a particular directory is exist or not
then
echo "Directory exist"
else
`mkdir $ndir` # directive to make mkdir must be encapsulated by ` `
echo "Directory created"
fi