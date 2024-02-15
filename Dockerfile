FROM openjdk:11

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file and Log4j JAR files into the container
COPY target/minispe-1.0-SNAPSHOT.jar /app/
COPY lib/log4j-api-2.14.1.jar /app/
COPY lib/log4j-core-2.14.1.jar /app/

# Define the command to run the JAR file with Log4j dependencies
#CMD ["java", "-cp", "minispe-1.0-SNAPSHOT.jar:log4j-api-2.14.1.jar:log4j-core-2.14.1.jar", "org.example.Main"]
