FROM openjdk:12-alpine
EXPOSE 8080
COPY ./build/libs/email-service-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar","email-service-0.0.1-SNAPSHOT.jar"]