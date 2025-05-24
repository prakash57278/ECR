# Use an official JDK as the base image
FROM openjdk:17-jdk-slim

# Set environment variables
ENV APP_HOME=/app
WORKDIR $APP_HOME

# Copy the jar file (change `target/*.jar` if your JAR name is specific)
COPY target/tesingECR.jar tesingECR.jar

# Expose port (optional but recommended)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "tesingECR.jar"]
