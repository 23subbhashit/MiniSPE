# Use a base image with Java installed
FROM openjdk:11-jre

# Set the working directory in the container
WORKDIR /app

# Copy the compiled Java application JAR file into the container
COPY target/my-application.jar /app

# Specify the command to run the Java application
CMD ["java", "-jar", "my-application.jar"]
