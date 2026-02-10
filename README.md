# Tasca S1 02

## Description

This is a project created for academic purposes. More specifically, it is created to complete the exercises included in the first Topic of IT ACADEMY Java & Spring specialization phase.
The indicated exercises are designed to understand how exceptions work in Java.


## Techonologies

- Java
- Maven


## Project Structure
TascaS1.02
src/
    └── main/
        └── java/
            └── FirstLevel
                └── Ex1
                    └── Product.java
                    └── Sale.java
                    └── EmptySaleException.java
                    └── Ex1Main.java
                └── Ex2
                    └── ConsoleReader.java
                    └── InvalidTypeException.java
                    └── ConsoleReaderMain.java



## Installation

1. Clone the repository: git clone https://github.com/isalvama/tascaS1.01.git
2. Navigate to the project directory: cd java
3. Compile the project using Maven: mvn clean compile
4. Run the application using: mvn exec:java


## Concepts covered

- Declaration and implementation of different kind of Exceptions
- Difference between Checked and Unchecked exceptions
- Custom creation of Unchecked exceptions that extend from Exception superclass
- Handling of exceptions and the need of doing so when throwing Unchecked exceptions


## First Level

### Ex1: Personalized exceptions and errors control

#### Product class

Product is the class created to instance products in order to be added in the Sale's 'addedProducts' attribute and to calculate the sum of its prices. 'price' and 'name' attributes are final as they should not change during the course of the execution of the program once a product is created.

#### Sale class

Sale class is a class created to add products to a Shopping Cart and calculate the total price of all of them. For this purpose, addedProducts attribute has been created, which represents the shoppingCart of the sale, and removeProducts() and addProducts() methods have been declared and implemented, in order to add or remove products to or from addedProducts ArrayList, if desired.
The key in this exercise is the implementation of EmptySaleException custom exception in the mentioned calculateTotalPrice() and removeProduct() methods. In the method's declarations, the 'throw' keyword has been used to indicate that they might throw an EmptySaleException exception and the logic of their launch has been established using the condition 'if (addedProducts.isEmpty()){...}'

#### EmptySaleException

EmptySaleException is the custom exception created to use in calculateTotalPrice() and removeProduct() methods of Sale class. 
When it was firstly created, the EmptySaleException extended from Exception class, and therefore constituted a Checked Exception. As such, when implementing the exception in calculateTotalPrice() and removeProduct(), the declaration of such methods had to include the 'throws' keyboard followed by the name of the exception: EmptySaleException. Then, in the call of the methods throughout the code (in the current project, in main file), the handling of exceptions had to be established, which was done with try-catch structure.
Afterwards, EmptySaleException's superclass has been changed to RuntimeException, and therefore EmptySaleException has become an Unchecked Exception. Therefore, 'throws' keyboard and the exception's name 'EmptySaleException' were not mandatory to be included in the declaration of calculateTotalPrice() and removeProduct() methods. Neither the exceptions had to be handled when calling the mentioned methods in main file.

# Second Level

### Ex1: Secure reading from the keyboard

#### Console Reader: the utility class

ConsoleReader is the key of the program. It is a utility class that allows the user to read different types of data from the keyboard safely, handling errors that may occur when the user enters incorrect values, such as text instead of numbers.
To do this, a Scanner object has been created in the class as an attribute to be used in all the static class methods included to read different kinds of data safely. These methods are static so they can be accessed without instancing an object of the class. 

All methods are made to show a custom message, read the value, and validate it. If the input is incorrect, an error message is displayed and the data is requested again until it is valid.

In this context, the exceptions handled by 'readByte' 'readInt' 'readFloat' and 'readDouble' methods handle InputMismatchException kind of exception, a type of unchecked exception that inherits from superclasses that come from RunTimeException. As so, the exception would not have to be handled with a try-catch structure. However, we have implemented it in order to achieve our purpose: to display an error message when an exception is caught indicating the cause of the error so the user can correct it in the next round. Besides, in the catch block, the program cleans the buffer of the scanner so a new input introduced by the user in the next round can be validated. 

On the other hand, 'readChar', 'readString' and 'readYesNo' methods throw a custom exception called InvalidInputTypeException. 
InvalidInputTypeException is a class that inherits from Exception superclass and therefore is a checked kind of exception. In 'readChar', 'readString' and 'readYesNo' methods, the logic and conditions in which the excpetion should be thrown are implemented. As so, the 'throws' keyboard is included in the declaration of the class and in the block of code that is executed when the conditions that have been set for the exception to be thrown are met.

#### ConsoleReaderMain

ConsoleReaderMain is a class designed to test the static methods of ConsoleReader class. In order to create the loop when invalid data is given when calling 'readChar', 'readString' and 'readYesNo' methods, a set of methods have been created to They have been created to bring together all the logic: 'validateChar', 'validateString' and 'validateYesNo'. These methods handle inside a while structure the handling of the exceptions the methods that each one calls can throw. This handling is made using the try-catch structure, which helps to achieve our purpose: display an error message when an exception is caught indicating the cause of the error so the user can correct it in the next round by printing the caught exception's message.

#### InvalidInputTypeException

InvalidInputTypeException is the custom exception created to use in readChar(), readString() and readYesNo() methods of ConsoleReader class.
This exception extends from Exception class, and therefore constitutes a Checked Exception. As we have mentioned, with that condition, when implementing the exception in readChar(), readString() and readYesNo(), the declaration of such methods has to include the 'throws' keyboard followed by the name of the exception (InvalidInputTypeException) and implement the logic in which the exception has to be thrown. Then, in the call of the methods throughout the code (in the current project, in ConsoleReaderMain file), the handling of exceptions has to be established, which was done with try-catch structure.
