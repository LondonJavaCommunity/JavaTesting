#!/bin/sh
# gitacp.sh - Quick Add, Commit, Push  script

echo "To pass a commit message on cmd line, put it in \" Quotes"

git add -A .

if [ -z "$1" ]; then 
  git commit -m "Misc"
else
  git commit -m "$@"
fi

git push origin master
