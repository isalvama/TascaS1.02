# Sprint 1.2: Exceptions

## Description

This project was created for academic purposes, specifically to complete the exercises for the first topic of the IT ACADEMY Java & Spring specialization. These exercises are designed to provide a deep understanding of how exceptions work in Java.

## Techonologies

- Java
- Maven


## Project Structure
```
TascaS1.02/
src/
└── main/
    └── java/
       └── first_level/
            └── exercici1/
                ├── Product.java
                ├── Sale.java
                ├── EmptySaleException.java
                └── Ex1Main.java
        └── second_level/
            └── exercici1/
                ├── ConsoleReader.java
                ├── InvalidTypeException.java
                └── ConsoleReaderMain.java
```


## Installation

1. Clone the repository: 
```bash
  git clone https://github.com/isalvama/tascaS1.01.git
```
2. Navigate to the project directory: 
```bash
  cd TascaS1.02
```
3. Compile the project using Maven: 
```bash
  mvn clean compile
```
4. Run the application using:
```bash
  mvn exec:java
```


## Concepts covered

- Declaration and implementation of different kind of **Exceptions**
- Difference between **Checked** and **Unchecked** exceptions
- Creating **Custom Exceptions** by extending the `Exception` or `RuntimeException` classes.
- Exception handling and the requirement of using `try-catch` and `throws` when throwing **Checked** exceptions.


## First Level

### Ex1: Personalized exceptions and Error Control

#### `Product` class

The `Product` class is used to instantiate products that are added to a `Sale`. Its `id` and `name` attributes are final as they should not change once a product is created.

#### Sale class

The `Sale` class manages a collection of products. It includes an `addedProducts` attribute (a `List` representing the shopping cart) and methods to `addProduct()` or `removeProduct()`.
The key part of this exercise is the implementation of the `calculateTotalPrice()` and `removeProduct()` methods. These methods check if the cart is empty using if (`addedProducts.isEmpty()`). If it is, they throw throws a custom `EmptySaleException`.

#### EmptySaleException

`EmptySaleException` is the custom exception created to use in `calculateTotalPrice()` and `removeProduct()` methods of `Sale` class. 
Initially, `EmptySaleException` extended `Exception` class, making it a **Checked Exception**. In this stage, the methods `calculateTotalPrice()` and `removeProduct()`had to include the `throws` keyword in their signature. Consequently, the `Main` class was required to handle this exception using a `try-catch` block.

Later, the superclass of `EmptySaleException` was changes to `RuntimeException`, turning it into an **Unchecked Exception**. Therefore, the `throws` keyword became optional in the method signature of `calculateTotalPrice()` and `removeProduct()` methods, and explicit handling in the `Main` class was no longer strictly required by the compiler, although it remains good practice for flow control.


# Second Level

### Ex1: Secure reading from the keyboard

#### Console Reader: the utility class

`ConsoleReader` class is the key of the program. It is a utility class designed to read different types of data from the keyboard safely. It handles potential input errors, such as entering text when a number is expected.

It uses a `Scanner` object as an internal attribute. All methods are static so they can be accessed without instancing the class. They display a custom message, read an input, and validate it. If the input is invalid, an error message is displayed and the user is prompted again until a valid value is entered.

- **InputMismatchException**: Handled in methods like `readByte`, `readInt`, `readFloat`, and `readDouble`. Although this is an **Unchecked Exception**, try-catch is used to display a user-friendly error message and clear the scanner buffer (`sc.nextLine()`) to avoid infinite loops during the next input attempt.
- **InvalidInputTypeException**: a custom **Checked Exception** thrown by methods like `readChar`, `readString`, and `readYesNo`. It validates specific business logic (e.g., ensuring a string is not empty or a "yes/no" answer is valid).

#### ConsoleReaderMain

This class tests the `ConsoleReader`methods. To manage the input loop for checked exceptions, it uses helper methods like `validateChar`, `validateString`, and `validateYesNo`. These methods contain `while` loops and `try-catch` structures to ensure the program continues running until the user provides the correct input format.

#### InvalidInputTypeException

A custom exception extending `Exception` (Checked). It forces the developer to handle the error at compile-time, ensuring that any input that doesn't match the expected type or format is explicitly managed through a `try-catch` block in the Main execution flow.
