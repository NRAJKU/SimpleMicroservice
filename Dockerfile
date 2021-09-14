FROM openjdk:18-jdk-alpine3.13
RUN addgroup -S spring && adduser -S springuser -G spring
USER springuser
WORKDIR /springuser
ARG JAR_FILE=build/libs/SimpleMicroservice-1.0.0.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Xmx512m", "-Xms256m", "-jar", "-Dspring.profiles.default=prod","app.jar"]
