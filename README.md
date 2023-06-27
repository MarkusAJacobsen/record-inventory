### Running locally

To run a standalone local environment with all support services, do the following:
1. First build the Jar via `gradlew bootJar`
2. Build the application Docker image `docker build  -t record-inventory-api -f docker/Dockerfile .`
3. Run Docker compose `docker compose -f docker/docker-compose.yaml up`