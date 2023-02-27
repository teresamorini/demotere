FROM openjdk:18-oracle

EXPOSE 8080
ARG JAR_FILE=target/app-java-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app-java.jar
ENTRYPOINT ["java","-jar","/app-java.jar"]