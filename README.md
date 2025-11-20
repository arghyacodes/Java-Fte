# Java-Fte
Java and beyond

## Day 1 

### Features of Java
1> Java is a platform independent language as it is compiled into bytecodes and they can be run in any platform 

2> Java is Object oriented, the program will go according to entities and attributes + behaviour. The advantage of object orientation is reusability.

3> Java is dynamic 

4> Robust 

5> Multi-threading / concurrency control

6> Highly Secure

Java is not a pure object oriented language as it uses premitive data types and it has a ststic main method.Alternatively java supports wrapper classes.

int

collections need wrapper clases it doesn't work with premitive data types.

Write a java program to take numbers in command line and sum all the numbers in a executable jar file.

run jar file : C:\MLA_Arghya\Java-Fte\mavenproject1\target>java -cp mavenproject1-0.0.1-SNAPSHOT.jar com.example.mavenproject1.p1.Demo1 10 20 30 40

Scope of variables - 
1> Local Scope - i>Method scope & ii> block scope
Local scopes are not auto initialization

2> Instance Scope - Every instance will have a swparate copy.
Eg- num1, num2, num3

Note - It will not have KEYWORD STATIC

Class scope - If the instance variable declared with a variable static it becomes a class scope.
All the instanses will share one single copy of class variable

NOTE - The class scope exists even if the obj goes for garbage collection which can be accessed by class name

Q1> Write a program to accept decimal number and convert it to octal and binary
Q2> Create a matrix class which defines by default 3 x 3 matrix if the size is given
Q3> create a behaviour to create a copy constructor to read data 

Q4> Accept amount in figures and convert into word (limit 1Cr)
Q5> Accept name of the day and display owner and color