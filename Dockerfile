FROM openjdk:22
WORKDIR /eventApp
COPY target/event-logger.jar evenLogger.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "evenLogger.jar"]