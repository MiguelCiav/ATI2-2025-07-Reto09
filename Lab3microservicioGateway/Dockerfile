FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /app
COPY target/ati2microservicio-gateway-0.0.1-SNAPSHOT.jar app.jar
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=build /app/app.jar app.jar
EXPOSE 8761
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar"]