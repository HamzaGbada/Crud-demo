FROM maven:3.6-jdk-8-slim AS build
COPY src ./app/src
COPY pom.xml ./app
RUN mvn -f ./app/pom.xml clean package -DskipTests

FROM openjdk:8-jdk-alpine
ARG JAR_FILE=./app/target/demo-0.0.1-SNAPSHOT.jar
COPY --from=build ${JAR_FILE} application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]
