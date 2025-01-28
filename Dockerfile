# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine
# Set the working directory in the container
WORKDIR /app
# Copy the executable jar file to the container
COPY target/micro-service-1.0.0.jar /app/micro-service.jar
# Expose the port the application runs on
EXPOSE 8080
# Run the jar file
ENTRYPOINT ["java", "-jar", "/app/micro-service.jar"]