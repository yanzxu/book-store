FROM openjdk:11
VOLUME /tmp
COPY build/libs/user-service-0.0.1-SNAPSHOT.jar user-service.jar

ARG PROFILE
ENV ACTIVE_PROFILE ${PROFILE}
RUN echo "========= ACTIVE_PROFILE = ${ACTIVE_PROFILE} ======== "

EXPOSE 80
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=${ACTIVE_PROFILE}", "/user-service.jar"]