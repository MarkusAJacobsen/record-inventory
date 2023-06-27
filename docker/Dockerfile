FROM eclipse-temurin:17 as builder
LABEL authors="markusja"
WORKDIR workspace
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} record-inventory-api.jar
RUN java -Djarmode=layertools -jar record-inventory-api.jar extract

FROM eclipse-temurin:17
LABEL authors="markusja"
RUN useradd spring
USER spring
COPY --from=builder workspace/dependencies/ ./
COPY --from=builder workspace/spring-boot-loader/ ./
COPY --from=builder workspace/snapshot-dependencies/ ./
COPY --from=builder workspace/application/ ./
ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]
