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

## Day 2

### Inheritance, Interface, Polymorphism, Access modifiers, getter & setter, Exceptions, Try-catch, Finally, 

Virtual function : When loosely coupled techniques methods of the sub class should be virtually defined in the  super class.

### Is a & Has a Relationship in Inheritance

What is : Composition, Aggregation, Association
 Association - child class directly depends on parent class is an association.
 Aggregation - 

Overriding - If same method present in super and sub class then that method will be called to which object belongs to.

Q> Write a program to reverse int, float, string, long

checked & unchecked exceprion, why do we need finally block

loose coupling is a example of runtime polymorphism.


## Day 3

Java has lambda expression thus we can implement interface without creating class (can be used for one )

create a function which receives lamda expression and perform the operation use Interface IsMath

write a code to check a number is even or odd using predicate interface

### Collection  -
It is a framework we can reuse it, made up of APIs which are ready to use.

Create a employee data and sort the names in ascending order.

a collection fwk is made up of interface, classes and algos.
Collection supports dynamic insertion and deletions, it supports some processing with inbuilt 

we have got interfaces called collection and map, each interface has its own class
Under collection we have got sub Interface called - list, set, queue, Dqueue 

Questions

To open any image and convert it to b/w

Read data from notepad and 

Create a generics with wild card

Create a database connection of singleton pattern

