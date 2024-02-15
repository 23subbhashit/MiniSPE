FROM openjdk:11

# Set the working directory in the container
WORKDIR /app

# Copy the application JAR file into the container
COPY target/minispe-1.0-SNAPSHOT.jar /app/

# Define the command to run the application
CMD ["java", "-cp", "minispe-1.0-SNAPSHOT.jar", "org.example.Main"]
