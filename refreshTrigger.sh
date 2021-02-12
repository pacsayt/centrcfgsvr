#!/bin/sh

echo "Remember to start Kafka first (~/bin/kafkastart.sh)"

printf "\nMESSAGE\n"
curl -X GET localhost:8080/message -d {} -H "Content-Type: application/json"

printf "\nACTUATOR\n"
curl -X GET localhost:8080/actuator/ -d {} -H "Content-Type: application/json"

printf "\nACTUATOR REFRESH\n"
curl localhost:8080/actuator/refresh -d {} -H "Content-Type: application/json"

printf "\nACTUATOR BUS-REFRESH\n"
curl -X GET localhost:8888/actuator/bus-refresh -d {} -H "Content-Type: application/json"
# Does notpport PUT : 405, not allowed

# meant to be called by (f.e.) GitHub on check in
printf "\nMONITOR\n"
curl localhost:8888/monitor -d {} -H "Content-Type: application/json"
