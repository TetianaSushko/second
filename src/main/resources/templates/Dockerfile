FROM openjdk:17
MAINTAINER Tetiana
EXPOSE 8080
COPY target/docker-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]