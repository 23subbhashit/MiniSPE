# Use the OpenJDK 11 JRE slim image as base
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Main.java file from your source directory to the working directory inside the container
COPY src/main/java/org/example/Main.java /app/

# Compile the Main.java file
RUN javac Main.java

# Specify the command to run your Java application
CMD ["java", "Main"]
