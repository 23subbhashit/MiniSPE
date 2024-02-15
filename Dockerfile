FROM openjdk:11

# Set the working directory in the container
WORKDIR /app

# Copy the application JAR file into the container
COPY target/minispe-with-dependencies.jar /app/

# Define the command to run the application
CMD ["java", "-cp", "minispe-with-dependencies.jar", "org.example.Main"]
