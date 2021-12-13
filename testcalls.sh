#!/bin/sh
CRAFTED_USER_AGENT="Mozilla/5.0 (X11; Linux x86_64; rv:60.0) Gecko/20100101 Firefox/81.0"
curl -v http://localhost:8080/public
sleep 2
curl -v http://localhost:8080/private
sleep 2
curl -v -A $CRAFTED_USER_AGENT http://localhost:8080/private
sleep 2
curl -v http://bob:123@localhost:8080/private
sleep 2
curl -v http://camphul:123@localhost:8080/escalated
