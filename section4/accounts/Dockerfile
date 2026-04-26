# Start with a base image containing Java runtime
FROM openjdk:21-ea-21-jdk-slim

# Information around who maintains the image
LABEL maintainer="schmitzcl"

# Add the applications's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# Execute the application
ENTRYPOINT ["java", "-jaNAPSHOT.jar"]