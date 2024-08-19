# Stage 1: Build the application
FROM maven:3.9.8-eclipse-temurin-17-alpine

# Set the working directory in the container
WORKDIR /opt/build

# Copy the pom.xml and download the dependencies
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy the source code into the container
COPY src ./src

# Package the application (skip tests to speed up the build process)
RUN mvn -f /opt/build clean package

# Set the working directory in the container
WORKDIR /opt/build/target

# Copy the jar file from the build stage
RUN mv /opt/build/target/*.jar app.jar

# Expose the port on which the application runs
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]