FROM gradle:4.10.3-jdk8-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM bitnami/tomcat:8.5
COPY --from=build /home/gradle/src/build/libs/gamedata.war /opt/bitnami/tomcat/webapps
