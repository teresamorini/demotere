FROM openjdk:23-oracle

ARG JAR_FILE=target/app-java-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app-java.jar
ENTRYPOINT ["java","-jar","/app-java.jar"]