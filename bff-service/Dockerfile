FROM openjdk:11
VOLUME /tmp
COPY build/libs/bff-service-0.0.1-SNAPSHOT.jar bff-service.jar

ARG PROFILE
ENV ACTIVE_PROFILE ${PROFILE}
RUN echo "========= ACTIVE_PROFILE = ${ACTIVE_PROFILE} ======== "

EXPOSE 80
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=${ACTIVE_PROFILE}", "/bff-service.jar"]