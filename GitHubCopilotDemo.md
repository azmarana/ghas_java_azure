# IntelliJ IDEA Copilot Training Session

## Introduction

**What is GitHub Copilot?**  
GitHub Copilot is an AI-powered code assistant developed by GitHub in collaboration with OpenAI. It uses machine learning models to provide real-time code suggestions and completions based on the context of the code you are writing. Copilot can help increase coding speed, reduce errors, and introduce new ways to solve problems by suggesting entire lines or blocks of code, generating documentation, and even creating unit tests. It integrates seamlessly with popular code editors like Visual Studio Code and IntelliJ IDEA.

**Benefits of Using Copilot**  
GitHub Copilot offers several benefits:

- **Increased Coding Speed**: By providing real-time code suggestions and completions, Copilot helps you write code faster, reducing the time spent on boilerplate and repetitive tasks.
- **Reduced Errors**: Copilot's suggestions are based on best practices and common patterns, which can help minimize coding errors and improve code quality.
- **Learning New Ways to Solve Problems**: Copilot introduces you to new coding techniques and solutions that you might not have considered, enhancing your problem-solving skills and expanding your knowledge.

**Target Audience**  
This training is for developers who want to use Copilot specifically within IntelliJ IDEA.

---

## Setup and Prerequisites

1. **Active Copilot Subscription**  
   To use GitHub Copilot, you need an active subscription. There are two main types of subscriptions:

   - **Individual Subscription**: This is for individual developers who want to use Copilot for personal projects. It provides access to all Copilot features within supported IDEs.
   - **Organizational Subscription (Business or Enterprise)**: This is for teams and organizations. It allows multiple users within an organization to use Copilot, providing centralized billing and management. This option is ideal for companies looking to enhance their development workflow across the team.

2. **Compatible IntelliJ IDEA Version**  
   GitHub Copilot is compatible with the following IntelliJ IDEA versions:

   - IntelliJ IDEA 2021.1 and later

   Additionally, GitHub Copilot is compatible with other JetBrains IDEs, including:

   - PyCharm 2021.1 and later
   - WebStorm 2021.1 and later
   - PhpStorm 2021.1 and later
   - RubyMine 2021.1 and later
   - GoLand 2021.1 and later
   - Rider 2021.1 and later
   - CLion 2021.1 and later

   Ensure you have one of these versions or later to use GitHub Copilot effectively.

3. **Install the GitHub Copilot Plugin**  
   Installing GitHub Copilot Plugin from the JetBrains Marketplace:

   - **Open IntelliJ IDEA**: Launch IntelliJ IDEA on your computer.
   - **Navigate to Plugins**: Go to `File > Settings` (or `IntelliJ IDEA > Settings` on macOS). In the Settings/Preferences dialog, select `Plugins` from the left-hand menu.
   - **Search for GitHub Copilot**: In the Plugins window, click on the `Marketplace` tab. In the search bar, type `GitHub Copilot` and press Enter.
   - **Install the Plugin**: Find the GitHub Copilot plugin in the search results. Click the `Install` button next to the GitHub Copilot plugin.
   - **Restart IntelliJ IDEA**: After the installation is complete, you will be prompted to restart IntelliJ IDEA. Click `Restart IDE` to apply the changes.
   - **Log in to GitHub**: After restarting, you will need to log in to your GitHub account to activate the Copilot plugin. Follow the on-screen instructions to authenticate with your GitHub account.

4. **Log in to GitHub within IntelliJ IDEA**  
   Authenticating with a GitHub Account in IntelliJ IDEA:

   - **Open IntelliJ IDEA**: Launch IntelliJ IDEA on your computer.
   - **Open the GitHub Login Dialog**: Go to `File > Settings` (or `IntelliJ IDEA > Settings` on macOS). In the Settings/Preferences dialog, select `Version Control > GitHub` from the left-hand menu.
   - **Add a GitHub Account**: Click the `+` button to add a new account. Select `Log In via GitHub`.
   - **Authenticate with GitHub**: A browser window will open, prompting you to log in to your GitHub account. Enter your GitHub username and password, and complete any two-factor authentication if enabled.
   - **Authorize IntelliJ IDEA**: After logging in, you will be asked to authorize IntelliJ IDEA to access your GitHub account. Click `Authorize` to grant the necessary permissions.
   - **Return to IntelliJ IDEA**: Once authorization is complete, return to IntelliJ IDEA. You should see your GitHub account listed under the `GitHub` section in the Settings/Preferences dialog.
   - **Confirm and Apply**: Click `OK` or `Apply` to save the changes. Your GitHub account is now authenticated, and you can use GitHub Copilot and other GitHub-related features within IntelliJ IDEA.

---

## Core Copilot Features in IntelliJ IDEA (30 minutes)

### 1. Code Completion

- **Real-time Suggestions**  
  Below we will explain how Copilot suggests code as you type, based on context and style.
  GitHub Copilot suggests code as you type by analyzing the context and style of your existing code. It uses machine learning models trained on a vast amount of code to provide relevant suggestions. Here are some examples based on the current project:

  **Example 1: Adding a New Method in TaskService**
  1. Open `TaskService`.
  2. Start typing a new method to find completed tasks:
  ```java
  // Start typing this comment
  // Method to find all completed tasks
  public List<Task> findCompletedTasks() {
      // Copilot will suggest the implementation based on the context
      return taskRepository.findAll().stream()
              .filter(Task::isCompleted)
              .collect(Collectors.toList());
  }
  ```

  **Example 2: Completing a Method in `TaskRepository`**
  1. Open TaskRepository.
  2. Start typing a new method to update a task:
  ```java
  // Start typing this comment
  // Method to update an existing task
  public Task updateTask(Task task) {
      // Copilot will suggest the implementation based on the context
      Optional<Task> existingTask = findById(task.getId());
      if (existingTask.isPresent()) {
          tasks.remove(existingTask.get());
          tasks.add(task);
          return task;
      }
      return null;
  }
  ```

  **Example 3: Writing a Test Case in `TaskServiceTest`**
  1. Open TaskServiceTest.
  2. Start typing a new test method for `findCompletedTasks`:
  ```java
  // Start typing this comment
  // Test to verify finding completed tasks
  @Test
  void testFindCompletedTasks() {
      Task task1 = new Task(1, "Task 1", "Description 1", true);
      Task task2 = new Task(2, "Task 2", "Description 2", false);
      taskService.addTask(task1);
      taskService.addTask(task2);
      List<Task> completedTasks = taskService.findCompletedTasks();
      assertEquals(1, completedTasks.size());
      assertTrue(completedTasks.contains(task1));
      assertFalse(completedTasks.contains(task2));
  }
  ```

  These examples demonstrate how Copilot can provide relevant code suggestions based on the context and style of your existing code, helping you write code faster and more efficiently.

- **Multi-file Editing**  
  TODO Showcase Copilot's ability to edit multiple files at the same time.

- **Accepting and Cycling through Suggestions**  
  Demonstrate accepting suggestions with Tab and using shortcuts to see alternatives.

- **IntelliJ IDEA Specific Shortcuts**  
  Cover shortcuts specific to IntelliJ IDEA for interacting with suggestions.

### 2. Copilot Chat

- **Accessing Copilot Chat**  
  How to open the chat window in IntelliJ IDEA.
  Opening the GitHub Copilot Chat Window in IntelliJ IDEA:
  - Open IntelliJ IDEA:
    Launch IntelliJ IDEA on your computer.
  - Open the Copilot Chat Window:
    Go to the View menu at the top of the screen.
    Select Tool Windows from the dropdown menu.
    Click on GitHub Copilot to open the Copilot tool window.
  - Using the Copilot Chat:
    In the Copilot tool window, you will see a chat interface.
    You can start typing your questions or prompts in the chat input field.
    Press Enter to send your message and receive responses from Copilot.

- **Generating a New Method Using Copilot Chat**  
  1. Open the `TaskService` class.
  2. Access Copilot Chat and type a prompt to "Create a method to find all incomplete tasks".
  3. Observe how Copilot Chat generates the method and review the output.

- **Asking Questions**  
  Demonstrate asking coding-related questions in natural language.
  - Open the Copilot Chat Window:
    Follow the steps to open the Copilot chat window in IntelliJ IDEA.
  - Ask a Coding-Related Question:
    In the Copilot chat input field, type a natural language question related to Java coding. For example:
    ```
    How do I create a singleton class in Java?
    ```
  - Receive and Review the Response:
    Press Enter to send your question.
    Copilot will provide a response with an explanation and example code.

  **Additional Examples**
  - Question:
    ```
    How do I sort a list of tasks by their due date in Java?
    ```

- **Requesting Code**  
  **Example 1: Asking Copilot to Write a Function**
  - Question:
    ```
    Write a function to calculate the factorial of a number in Java.
    ```
  - Copilot Response:
    ```java
    public class MathUtil {
      // Function to calculate the factorial of a number
      public static int factorial(int n) {
          if (n == 0) {
              return 1;
          }
          return n * factorial(n - 1);
      }
    }
    ```

  **Example 2: Asking Copilot to Complete a Code Block**
  - Question:
    ```
    Complete the code block to read a list of tasks from a file in Java.
    ```

  **Example 3: Asking Copilot to Fix a Bug**
  - Question:
    ```
    Fix the bug in the following code that causes a NullPointerException.
    ```
  - Original Code:
    ```java
    public class TaskService {
      public void printTaskDetails(Task task) {
          System.out.println("Task ID: " + task.getId());
          System.out.println("Task Name: " + task.getName());
          System.out.println("Task Description: " + task.getDescription());
      }
    }
    ```
  - Copilot Response:
    ```java
    public class TaskService {
      public void printTaskDetails(Task task) {
          if (task != null) {
              System.out.println("Task ID: " + task.getId());
              System.out.println("Task Name: " + task.getName());
              System.out.println("Task Description: " + task.getDescription());
          } else {
              System.out.println("Task is null");
          }
      }
    }
    ```

- **Understanding Code**  
  Using Copilot Chat to Explain Existing Code:
  GitHub Copilot Chat can help you understand existing code by providing explanations and clarifications. Here’s how you can use it:
  - Open the Copilot Chat Window:
    Follow the steps to open the Copilot chat window in IntelliJ IDEA.
  - Ask for an Explanation:
    Select the code you want to understand.
    In the Copilot chat input field, type a natural language question asking for an explanation. For example:
    ```
    Can you explain what this method does?
    ```
    or use slash command `/explain`

**Note:** VS Code may have additional chat features not available in IntelliJ IDEA.

---

## Advanced Copilot Usage

### 1. Generating Code from Comments

Let's create a new utility class in the util folder and use natural language comments to guide Copilot to produce complex code.

#### Step-by-Step Guide

**Create a New File**:
- Create a new file named `AdvancedUtil.java` in the `util` folder.

**Add Multi-line Top Comment**:
- Add a multi-line comment at the top of the file to guide Copilot in generating complex code.
    ```java
    package com.taskmanager.util;

    /**
    * Utility class for advanced operations.
    * 
    * This class includes:
    * 1. A method to calculate the nth Fibonacci number using dynamic programming.
    * 2. A method to sort a list of tasks by their due date.
    * 3. A method to validate an email address.
    * 4. A method to find the longest common subsequence between two strings.
    */
    ```

**Let Copilot Generate the Code**:
- Based on the comments, Copilot will suggest the implementation.

**Example: `AdvancedUtil.java`**
```java
package com.taskmanager.util;

/**
 * Utility class for advanced operations.
 * 
 * This class includes:
 * 1. A method to calculate the nth Fibonacci number using dynamic programming.
 * 2. A method to sort a list of tasks by their due date.
 * 3. A method to validate an email address.
 * 4. A method to find the longest common subsequence between two strings.
 */

import java.util.*;
import java.util.regex.*;

public class AdvancedUtil {

    // Method to calculate the nth Fibonacci number using dynamic programming
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    // Method to sort a list of tasks by their due date
    public static void sortTasksByDueDate(List<Task> tasks) {
        tasks.sort(Comparator.comparing(Task::getDueDate));
    }

    // Method to validate an email address
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        if (email == null) {
            return false;
        }
        return pattern.matcher(email).matches();
    }

    // Method to find the longest common subsequence between two strings
    public static String longestCommonSubsequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        StringBuilder lcs = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs.append(s1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        return lcs.reverse().toString();
    }
}
```

### 2. Refactoring Code with Copilot

- **Using Copilot Chat for Refactoring**  
  #### Step-by-Step Guide
  **Open the Copilot Chat Window**:
  - Follow the steps to open the Copilot chat window in IntelliJ IDEA.

  **Select the Code to Refactor**:
  - Highlight the code you want to refactor.

  **Ask Copilot to Refactor the Code**:
  - In the Copilot chat input field, type a natural language request to refactor the code. For example:
    ```
    Can you optimize this loop?
    ```

  **Review and Apply the Refactored Code**:
  - Press Enter to send your request.
  - Copilot will provide a refactored version of the code.
  - Review the suggested changes and apply them if they meet your requirements.

- **Other Refactoring Techniques**  
  #### Step-by-Step Guide
  **Open the Copilot Chat Window**:
  - Follow the steps to open the Copilot chat window in IntelliJ IDEA.

  **Select the Code to Simplify**:
  - Highlight the code you want to simplify.

  **Use the `/simplify` Command**:
  - In the Copilot chat input field, type `/simplify` and press Enter.

  **Review and Apply the Simplified Code**:
  - Copilot will provide a simplified version of the code.
  - Review the suggested changes and apply them if they meet your requirements.

  **Example Interaction**
  **Original Code**:
  ```java
  public class TaskService {
      public List<Task> getHighPriorityTasks(List<Task> tasks) {
          List<Task> highPriorityTasks = new ArrayList<>();
          for (Task task : tasks) {
              if (task.getPriority() > 5) {
                  highPriorityTasks.add(task);
              }
          }
          return highPriorityTasks;
      }
  }
  ```

  **Command**:
  ```
  /simplify
  ```

  **Copilot Response**:
  ```java
  public class TaskService {
      public List<Task> getHighPriorityTasks(List<Task> tasks) {
          return tasks.stream()
                  .filter(task -> task.getPriority() > 5)
                  .collect(Collectors.toList());
      }
  }
  ```

### 3. Generating Unit Tests

**Using the /test Command to Generate Unit Tests**
You can use the `/test` command in GitHub Copilot Chat to generate unit tests for your existing code. Here’s how you can do it:

#### Step-by-Step Guide

**Open the Copilot Chat Window**:
- Follow the steps to open the Copilot chat window in IntelliJ IDEA.

**Select the Code to Test**:
- Highlight the method or class you want to generate unit tests for.

**Use the `/test` Command**:
- In the Copilot chat input field, type /test and press Enter.

**Review and Apply the Generated Tests**:
- Copilot will provide a unit test for the selected method or class.
- Review the suggested test code and apply it if it meets your requirements.

**Example Interaction**
**Code to Test**:
```java
public class TaskService {
    public List<Task> findCompletedTasks() {
        return taskRepository.findAll().stream()
                .filter(Task::isCompleted)
                .collect(Collectors.toList());
    }
}
```

**Command**:
```
/test
```

**Copilot Response**:
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class TaskServiceTest {

    @Test
    void testFindCompletedTasks() {
        TaskRepository taskRepository = new TaskRepository();
        TaskService taskService = new TaskService(taskRepository);

        Task task1 = new Task(1, "Task 1", "Description 1", true);
        Task task2 = new Task(2, "Task 2", "Description 2", false);
        Task task3 = new Task(3, "Task 3", "Description 3", true);

        taskRepository.save(task1);
        taskRepository.save(task2);
        taskRepository.save(task3);

        List<Task> completedTasks = taskService.findCompletedTasks();

        assertEquals(2, completedTasks.size());
        assertTrue(completedTasks.contains(task1));
        assertTrue(completedTasks.contains(task3));
        assertFalse(completedTasks.contains(task2));
    }
}
```

### 4. Generating Documentation

You can use the `/doc` command in GitHub Copilot Chat to generate documentation comments for your methods and classes. Here’s how you can do it:

#### Step-by-Step Guide

**Open the Copilot Chat Window**:
- Follow the steps to open the Copilot chat window in IntelliJ IDEA.

**Select the Method or Class**:
- Highlight the method or class you want to generate documentation for.

**Use the `/doc` Command**:
- In the Copilot chat input field, type `/doc` and press Enter.

**Review and Apply the Generated Documentation**:
- Copilot will provide documentation comments for the selected method or class.
- Review the suggested comments and apply them if they meet your requirements.

**Example Interaction**
**Code to Document**:
```java
public class TaskService {
    public List<Task> findCompletedTasks() {
        return taskRepository.findAll().stream()
                .filter(Task::isCompleted)
                .collect(Collectors.toList());
    }
}
```

**Command**:
```
/doc
```

**Copilot Response**:
```java
/**
 * Service class for managing tasks.
 */
public class TaskService {

    /**
     * Finds all completed tasks.
     *
     * @return a list of completed tasks
     */
    public List<Task> findCompletedTasks() {
        return taskRepository.findAll().stream()
                .filter(Task::isCompleted)
                .collect(Collectors.toList());
    }
}
```
---

## Best Practices

### 1. Writing Effective Prompts

- **Clarity and Specificity**  
  When using GitHub Copilot, it's crucial to provide clear and specific prompts to get the most accurate and relevant suggestions. Here’s why clarity and specificity matter, along with an example:

  **Why Clarity and Specificity Matter**
  - **Improves Accuracy**: Clear and specific prompts help Copilot understand exactly what you need, leading to more accurate code suggestions.
  - **Reduces Ambiguity**: Specific prompts reduce the chances of ambiguous or irrelevant suggestions.
  - **Saves Time**: By providing precise instructions, you can save time by getting the correct code on the first try.

  **Example**
  - **Unclear Prompt**:
    ```
    // Method to process tasks
    ```
    **Copilot Suggestion**:
    ```java
    public void processTasks(List<Task> tasks) {
        // Implementation here
    }
    ```

  - **Clear and Specific Prompt**:
    ```
    // Method to handle tasks by archiving completed tasks and returning the count of archived tasks
    ```
    **Copilot Suggestion**:
    ```java
    public int handleTasks(List<Task> tasks) {
        int archivedCount = 0;
        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.isCompleted()) {
                archiveTask(task);
                iterator.remove();
                archivedCount++;
            }
        }
        return archivedCount;
    }

    private void archiveTask(Task task) {
        // Archive task implementation
    }
    ```

- **Providing Context**  
  Explain how to give Copilot the right context (open files, selected code) for accurate results.

### 2. Using Relevant Files

**Giving Copilot the Right Context for Accurate Results**
To get the most accurate and relevant suggestions from GitHub Copilot, it's important to provide the right context. Here’s how you can do that:

1. **Open Relevant Files**
   - **Why**: Copilot uses the context of open files to understand the structure and dependencies of your project.
   - **How**:
     - Open all relevant files that are related to the code you are working on.
     - For example, if you are working on a method in TaskService, also open Task, TaskRepository, and any other related files.

2. **Select the Code**
   - **Why**: Selecting specific code helps Copilot focus on the exact part of the code you want to work on.
   - **How**:
     - Highlight the method, class, or code block you want Copilot to assist with.
     - For example, if you want to refactor a method, select the entire method.

3. **Provide Clear Prompts**
   - **Why**: Clear and specific prompts help Copilot understand your exact requirements.
   - **How**:
     - Use comments to describe what you want to achieve.
     - Be specific about the functionality, conditions, and expected output.

### 3. Iterating with Copilot

To get the best results from GitHub Copilot:

- **Experiment with Prompts**: Try different ways of phrasing your prompts to see how Copilot responds. Be clear and specific.
- **Review Suggestions**: Carefully review the code suggestions provided by Copilot. Make adjustments as needed to fit your requirements.

### 4. Understanding Limitations

- **Not a Replacement for Knowledge**  
  GitHub Copilot is a powerful tool to assist with coding, but it is not a substitute for understanding coding principles. Always ensure you understand the code you are writing and review Copilot's suggestions critically to maintain code quality and correctness.

- **Potential for Errors**  
  Always review GitHub Copilot's suggestions to ensure they are:
  - **Correct**: Verify that the suggested code works as intended and integrates properly with your existing codebase.
  - **Secure**: Check for potential security vulnerabilities and ensure the code follows best practices for security.


---

## Additional Resources and Q&A

1. **GitHub Copilot Documentation**  
   Bing search results for "GitHub Copilot official documentation"

You can find the official GitHub Copilot documentation at the following links:

- [GitHub Copilot documentation](https://docs.github.com/en/copilot)
- [What is GitHub Copilot?](https://docs.github.com/en/copilot/about-github-copilot/what-is-github-copilot)

For IntelliJ IDEA-specific documentation related to GitHub Copilot, you can refer to the [Getting started with GitHub Copilot](https://github.com/features/copilot/getting-started) guide.

2. **IntelliJ IDEA Copilot-Specific Resources**  
   You can find specific documentation and tutorials for GitHub Copilot within IntelliJ IDEA at the following links:

- [Using GitHub Copilot in JetBrains IDEs](https://docs.github.com/en/copilot/quickstart?tool=jetbrains)
- [Getting Started with GitHub Copilot](https://github.com/features/copilot/getting-started)




