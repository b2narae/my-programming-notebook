#!/bin/bash
# counter could be declared in the (( )).
for (( counter=10; counter > 0; counter-- ))
do
echo -n "$counter "
done
printf "\n"
