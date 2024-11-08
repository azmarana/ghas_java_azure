# Task Manager Application

## Overview
The Task Manager is a command-line application built using Java and Maven. It allows users to manage tasks efficiently, providing functionalities to add, update, delete, and retrieve tasks. This project showcases the features of GitHub Copilot in IntelliJ IDEA.

## Features
- Add, update, and delete tasks
- Retrieve task details
- Console-based user interaction

## Project Structure
```
task-manager
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── taskmanager
│   │   │           ├── Main.java
│   │   │           ├── model
│   │   │           │   └── Task.java
│   │   │           ├── service
│   │   │           │   └── TaskService.java
│   │   │           ├── repository
│   │   │           │   └── TaskRepository.java
│   │   │           └── util
│   │   │               └── ConsoleUtil.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── taskmanager
│                   ├── service
│                   │   └── TaskServiceTest.java
│                   └── util
│                       └── ConsoleUtilTest.java
├── pom.xml
└── README.md
```

## Setup Instructions
1. **Clone the Repository**
   ```bash
   git clone <repository-url>
   cd task-manager
   ```

2. **Build the Project**
   Ensure you have Maven installed. Run the following command to build the project:
   ```bash
   mvn clean install
   ```

3. **Run the Application**
   After building, you can run the application using:
   ```bash
   mvn exec:java -Dexec.mainClass="com.taskmanager.Main"
   ```

## Usage
Follow the on-screen instructions to manage your tasks. You can add new tasks, view existing ones, update their status, or delete them.

## Testing
To run the unit tests, execute:
```bash
mvn test
```
## START COPILOT TRAINING HERE

For copilot training instructions refer to the [GitHub Copilot Demo](GitHubCopilotDemo.md).