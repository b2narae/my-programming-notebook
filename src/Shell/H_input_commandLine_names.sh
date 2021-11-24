#!/bin/bash
# echo $@ : Double quote array expansions to avoid re-splitting elements
for arg in "$@"
do

# -d option : delimiter (couldn't use with -c, -b)
# -c option : -c 2-4
# -f option : field
# index=$(echo $arg | cut -d "=" -f1)
index=$(echo $arg | cut -d= -f 1)
value=$(echo $arg | cut -d= -f 2)

case $index in
X) x=$value ;;
Y) y=$value ;;
*)
esac
done

#result would become 0 by default
#because it is declared in (( ))
((result=x+y))
echo "X + Y = $result"
