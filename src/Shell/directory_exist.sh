#!/bin/bash
echo "Enter directory name"
read ndir
if [ -d "$ndir" ] # -d : d option
then
echo "Directory exist"
else
`mkdir $ndir`
echo "Directory created"
fi