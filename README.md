# Tasca S1 02

## Description

This is a project created for academic purposes. More specifically, it is created to complete the exercises included in the first Topic of IT ACADEMY Java & Spring specialization phase.
The indicated exercises are designed to understand how exceptions work in Java.


## Techonologies

- Java
- Maven


## Project Structure
TascaS1.01
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