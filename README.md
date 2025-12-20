# Java Learning Journey - Session 1 ☕



Welcome to the first session of my Java learning journey at [Route](https://www.route-academy.com/)! This repository documents my exploration of Java fundamentals through hands-on practice and assignments.

## 📋 Table of Contents

- [Overview](#overview)
- [Topics Covered](#topics-covered)
- [Assignment Details](#assignment-details)
- [Key Features](#key-features)
- [Getting Started](#getting-started)
- [Code Examples](#code-examples)
- [Lessons Learned](#lessons-learned)
- [Next Steps](#next-steps)

## 🎯 Overview

This session establishes the foundation of Java programming by introducing essential concepts that every Java developer must master. Through practical exercises and a comprehensive assignment, I've gained hands-on experience with Java syntax, operators, and control flow.

## 📚 Topics Covered

### Core Concepts

| Topic | Description |
|-------|-------------|
| **Data Types** | Understanding primitive types (int, double, boolean, char) and their usage |
| **Scanner Class** | Reading user input from the console |
| **Arithmetic Operators** | Addition (+), Subtraction (-), Multiplication (*), Division (/), Modulus (%) |
| **Conditional Statements** | Decision-making with if, else if, and else |
| **Comparison Operators** | Evaluating expressions using ==, !=, >, <, >=, <= |
| **Logical Operators** | Combining conditions with AND (&&) and OR (\|\|) |
| **Ternary Operator** | Compact conditional expressions using ? : |

## 🎓 Assignment Details

### Program Functionality

The assignment demonstrates a comprehensive Java program that:

1. **User Input Collection**
   - Accepts two integer values from the user
   - Utilizes the Scanner class for input handling

2. **Arithmetic Operations**
   - Calculates sum, difference, and product
   - Computes remainder with proper division-by-zero handling
   - Displays formatted results to the user

3. **Conditional Logic**
   - Compares two numbers to determine which is greater
   - Checks for equality between inputs
   - Validates number properties (positive/negative)

4. **Logical Operations**
   - Uses AND operator to check if both numbers are positive
   - Demonstrates compound boolean expressions

5. **Ternary Operator Applications**
   - Determines the greater number using compact syntax
   - Identifies even or odd numbers efficiently

## ✨ Key Features

- **Error Handling**: Division-by-zero validation
- **User-Friendly Output**: Clear and formatted console messages
- **Best Practices**: Clean code structure and meaningful variable names
- **Comprehensive Coverage**: Demonstrates multiple fundamental concepts in one program

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE (Eclipse, IntelliJ IDEA, VS Code) or text editor
- Basic understanding of command-line operations

### Running the Program

```bash
# Clone the repository
git clone https://github.com/yourusername/RouteJavaFirstSession.git

# Navigate to the project directory
cd RouteJavaFirstSession

# Compile the Java file
javac Assignment.java

# Run the program
java Assignment
```

## 💻 Code Examples

### Using the Ternary Operator
```java
int max = (num1 > num2) ? num1 : num2;
System.out.println("Greater number: " + max);
```

### Conditional Logic with Error Handling
```java
if (num2 != 0) {
    int remainder = num1 % num2;
    System.out.println("Remainder: " + remainder);
} else {
    System.out.println("Cannot divide by zero!");
}
```

### Logical Operators
```java
if (num1 > 0 && num2 > 0) {
    System.out.println("Both numbers are positive");
}
```

## 📖 Lessons Learned

Throughout this session, I've gained valuable insights into:

- The importance of input validation and error handling
- How to structure a Java program with proper syntax
- The relationship between different operators and their precedence
- When to use conditional statements versus ternary operators
- Best practices for user interaction and output formatting

## 🔜 Next Steps

This is just the beginning of my Java journey! The next session will build upon these fundamentals by introducing:

- **Control Flow**: Advanced loops (for, while, do-while)
- **Object-Oriented Programming**: Classes, objects, methods
- **String Manipulation**: Working with text data
- **Arrays**: Storing and processing collections of data

👉 **[Session 2 - Coming Soon!](../RouteJavaSecondSession/README.md)**

