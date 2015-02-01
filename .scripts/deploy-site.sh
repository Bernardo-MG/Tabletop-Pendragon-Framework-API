#!/bin/bash
# This script deploys the Maven site using the POM cofiguration
# Only commits to the master branch, and no pull, trigger the deploy

if [ "$TRAVIS_PULL_REQUEST" == "false" ] && [ "$TRAVIS_BRANCH" == "master" ]; then

   mvn site site:deploy --settings ~/settings.xml > site_output.txt
   head -50 site_output.txt
   echo " "
   echo "(...)"
   echo " "
   tail -50 site_output.txt

fi
