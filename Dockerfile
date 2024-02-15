FROM openjdk:11

# Set the working directory in the container
WORKDIR /app

# Copy the application JAR file into the container
COPY target/minispe-1.0-SNAPSHOT.jar /app/

# Copy Log4j JAR files into the container
COPY log4j-api-2.14.1.jar /app/
COPY log4j-core-2.14.1.jar /app/

# Define the command to run the application
#CMD ["java", "-cp", "minispe-1.0-SNAPSHOT.jar:log4j-api-2.14.1.jar:log4j-core-2.14.1.jar", "org.example.Main"]
