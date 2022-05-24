FROM openjdk:11
VOLUME /tmp
COPY build/libs/user-service-0.0.1-SNAPSHOT.jar user-service.jar
EXPOSE 8091
ENTRYPOINT ["java","-jar","/user-service.jar"]