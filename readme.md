# Hello World Containerized Quarkus

This is a simple "Hello World" application built with **Quarkus** and designed to be **containerized**. It provides a single JSON endpoint and is configured for efficient running on a JVM within a container environment.

## Features
- **Quarkus Framework**: Leveraging the latest Quarkus features for high performance and low memory footprint.
- **RESTful API**: A simple `/` endpoint returning a JSON response.
- **Multi-stage Dockerfile**: Optimized container build process using Red Hat UBI 9 images.
- **JVM Optimization**: Pre-configured JVM options for container environments, including Shenandoah GC.

## Prerequisites
- Java 21+
- Maven (or use the provided `./mvnw`)
- Docker or Podman (for containerization)

## Getting Started

### Running in Development Mode
You can run your application in dev mode that enables live coding using:
```shell
./mvnw compile quarkus:dev
```
The application will be available at `http://localhost:8080`.

### Building the Application
To build the application and package it into a runnable JAR:
```shell
./mvnw clean package
```
The artifacts will be generated in the `target/quarkus-app/` directory.

### Running with Docker
You can build and run the containerized application using the provided `Dockerfile`.

1. **Build the image:**
```shell
docker build -t hello-world-quarkus .
```

2. **Run the container:**
```shell
docker run -i --rm -p 8080:8080 hello-world-quarkus
```

## API Endpoint
- **URL**: `/`
- **Method**: `GET`
- **Response**: `{"hello":"world"}`

## Project Structure
- `src/main/java`: Contains the Java source code (`IndexController.java`).
- `src/main/resources`: Contains configuration files (`application.properties`).
- `Dockerfile`: Multi-stage Docker build file for creating optimized JVM images.
- `pom.xml`: Maven project configuration.

## Author
**Muhammad Edwin**
- Email: edwin at redhat dot com
