#!/usr/bin/env bash

./gradlew bootJar
docker build  -t record-inventory-api -f docker/Dockerfile .
