# Spring Boot Application with MongoDB

This is a simple Spring Boot RESTful API that uses MongoDB as its database. It allows basic CRUD (Create, Read, Update, Delete) operations for managing `Employee` document.

## Features
- Create a new Employee
- Retrieve all Employee
- Retrieve a Employee by ID
- Delete a Employee
- update Employee

## Prerequisites

Before you begin, ensure you have the following installed on your local machine:

- [JDK 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [MongoDB](https://www.mongodb.com/try/download/community) (running locally or via a cloud service like MongoDB Atlas)
- An IDE such as IntelliJ IDEA, Eclipse, or Visual Studio Code

## Installation

### Step 1: Clone the repository

```bash
  https://github.com/Prathamesh-Jagtap/SpringBoot-MongoDB-CRUD.git
  cd spring-boot-mongodb-app
```

## Configure MongoDB
# Update the MongoDB connection settings in src/main/resources/application.properties:
```bash
  spring.data.mongodb.database=your_database_name
  spring.data.mongodb.uri=mongodb://localhost:27017/your_database_name
```

# Build and Run the Application
```bash
  mvn clean install
  mvn spring-boot:run
```

# Test API Endpoint using Postman or other API Testing Tools

