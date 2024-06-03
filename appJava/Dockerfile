FROM maven:latest AS build

WORKDIR /app
COPY pom.xml ./
COPY ./src ./src
RUN mvn clean package -DskipTests

FROM openjdk:23-oracle

WORKDIR /app
COPY --from=build /app/target/app-java-0.0.1-SNAPSHOT.jar /app-java.jar
ENTRYPOINT ["java","-jar","/app-java.jar"]