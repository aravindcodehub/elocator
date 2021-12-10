FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/elocator-0.0.1-SNAPSHOT.jar

# cd /usr/local/runme
WORKDIR /usr/local/runme

# copy target/elocator-0.0.1-SNAPSHOT.jar /usr/local/runme/elocator-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} elocator-0.0.1-SNAPSHOT.jar

EXPOSE 8081

# java -jar /usr/local/runme/app.jar
ENTRYPOINT ["java","-jar","elocator-0.0.1-SNAPSHOT.jar"]

