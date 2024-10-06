FROM openjdk:17-jdk-alpine

COPY ./target/dockerdemopractice-0.0.1-SNAPSHOT.jar springimage.jar

ENTRYPOINT ["java" ,"-jar","/springimage.jar"]