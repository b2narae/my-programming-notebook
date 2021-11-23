#!/bin/bash
echo "Wait command" &
process_id=$!
wait $process_id #wait command is used with a particular process id or job id.
echo "Exited with status $?"