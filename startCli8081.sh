#!/bin/bash

cd cli
./mvnw spring-boot:run -Dspring-boot.run.arguments="--server.port=8081"
cd -
