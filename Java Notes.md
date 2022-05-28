### Control Statements
Three types of Control Statements in java
- Decision Making Satements
  - if Statements
  - switch statement
- Loop Statements
  - while
  - for
  - do-while
  - for-each
- Jump Statements
  - break
  - continue

#### if statements
```java
class First{
  public static void main(String arguments[]){
    // want to print anything? use 
    int x = -1;
    if(x>0){
      System.out.println("Positive");
    }else if(x==0){
      System.out.println("Not Positive | Negative");
    }else{
      System.out.println("Negative");
    }
  }
}
```

```
A Certain grade of meat has to be graded according to the following conditions
Condition 1: if the meat is weights more than 10kgs
Condition 2: if the meat is having less than 0.5 days of age
Condition 3: if the meat is ready to cook

1. if all the conditions are matched, the meat can be rated with 10
2. if the first two conditions meet and the third condition fails, the meat can be given 9 rating
3. if the second, third conditions are met, the rating can be 8
4. if the first and third conditions are only met, the rating can be 7.
5. if the only one condition is meeting and the other conditions are failing, the meat can be rated as 6.
```

#### Switch in java
```java
switch(value/expr){
  case 0:
    //statements
    break;
  case 1:
    // statements
    break;
  .
  .
  .
  default:
    //statements
    break;
}
```

##### Example
```java
import java.util.Scanner;
class Second{
  public static void main(String args[]){
    int a;
    Scanner s = new Scanner(System.in);
    a = s.nextInt();
    switch(a){
      case 0:
        System.out.println("CASE 0");
        System.out.println("PAVAN");
        break;
      case 1:
        System.out.println("CASE 1");
        break;
      default:
        System.out.println("DEFAULT CASE");
    }
  }
}
```

#### Loops
##### While

```java
while(Condition){
  //statements
}
```
###### Example
```java
class Third{
  public static void main(String args[]){
    int i=1;
    while(i<=10){
      System.out.println(i);
      i++;
    }
  }
}
```

Assignment 2
```
Write a program to find if a given number is prime or not!
```

##### do-while
```java
public static void main(String []args){
    int i=1;
    do{
      System.out.println(i);
      i++;
    }while(i<=10);
  }
```

##### for-loop
```java
public static void main(String args[]){
    for(int i=1; i<=10; i++){
      System.out.println(i);
    }
  }
```

Assignment 3:
```
Write a program to print the factorial of any given number
```

Assignment 4:
```
Write a program to find if a given number is special number or not!
Definition of Special Number: Special number is a number which equals to the same number when the individual digits of the number are added.
```

Assignment 5:
```
Write a program to print all the prime numbers with in any given range of numbers.
```
#### JUMP Statements in java
#### Break
break statement whenever it is encountered, the loop will break.<br>
Example:
```java
while(i<=10){
      System.out.println(i);
      if(i==5){
        break;
      }
      i++;
    }
```

##### Continue
When ```continue``` statement is encountered in the loop, the statements following the ```continue```will not execute and the loop goes to the next iteration.

Example
```java
while(i<=10){
      if(i==5){
        i++;
        continue;
      }
      System.out.println(i);
      i++;
    }
```
### JAVA OOPs concepts
- OOPs - Object oriented programming
- You cannot write a java program without declaring a class
- Important Concepts
    - object
    - class
    - inheritance
    - Polymorphism
    - Abstraction (Interfaces)
    - Encapsulation
- Object : Any real world entity can be considered as an object if it exhibits Properties and behaviors. an object is an instance (Copy) of a class.
  - Example: Dog (Name, age, weight - walking(), barking())
  - All Properties will become variables
  - All behaviors will become methods (Functions)

- Class : Blueprint of an object.
  - Class Does not occupy any space
  - Only when you create an object, the memory is allocated.

Syntax of Creating a class
```Java
class Dog{
  int age;
  String name; //properties

  // behaviors
  public void bark(){
    // statements
  }

  public void walk(){
    // statements
  }
}
```
Example for creating an object:
```java
Dog d = new Dog();
```

```java
class Dog{
  //properties
  String name;
  int age;

  // behaviors
  public void bark(){
    System.out.println(name+" says BOW! BOW!");
  }

  public void swim(){
    System.out.println(name + " with "+age+" age is Swimming across the river!");
  }
}

class Main{
  public static void main(String args[]){
    // Creating an object for Dog
    Dog d = new Dog(); 
    d.name = "Tommy!";
    d.age = 10;
    d.bark();
    
    
    Dog e = new Dog();
    e.name = "Elizabeth";
    e.age = 12;
    e.bark();
    e.swim();
    d.swim();
  }
}
```

#### Constructors in java

- At the time of initializing an object, if you want to initialize a few variables of that object, you can create a constructor. 
- Whenever a class is created there will be a default constructor
- In java we can have multiple constructors for the smae class (Overloading constructors)

- Types of Constructors in java
  - Default Constructors (No-arguments)
  - Parameterized Constructors

- Constructors look like methods but does not have return types
- Constructors will have the same name as that of your class name

Example

```java
class Student{
    // variables that are defined inside the class
    // can be called as INSTANCE VARIABLES
    // These instance variables belong objects but 
    // not to the class
    String name;
    int student_id;
    int age;
    // Overloading constructors
    Student(String n, int i){
        name = n;
        student_id = i;
    }
    
    Student(String n, int i, int a){
        name = n;
        student_id = i;
        age = a;
    }
    
    public void display(){
        System.out.println(name+":"+student_id);
    }
    
    public void display1(){
        System.out.println(name+":"+student_id+":"+age);
    }
}

class Main{
    public static void main(String args[]){
        Student s = new Student("PAVAN",30);
        s.display();
        
        Student e = new Student("AMAN",28,21);
        e.display1();
    }
}
```

### Inheritance
- It is a mechanism in which one object acquires the properties & behaviors of a parent object.
- the Main purpose is to support code reusability.
- Super class/ Parent class / Base class
  - if it is inherited by other classes
- Child class / Derived class
  - This is the class into which you will acquire the properties and behaviors.

```extends``` keyword is used to inherit the properties and behaviors of a class into another class. 

#### Types of Inheritance
- Single Inheritance
  - Where one class (Child/Derived/subclass) acquires the properties and behaviors of another class(Super class/ base / parent)<br>
[Single inheritance](https://www.canva.com/design/DAFBhgGNAIM/RrX1ym_MXE0AagTvaPkCEg/edit?utm_content=DAFBhgGNAIM&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)

- Multi Level Inheritance
  - When there is a chain of inheritance, it is called as Multi level inheritance.
  - [Multi Level Inheritance ](https://www.canva.com/design/DAFBhq5jpOc/W3yDRjmXkVmzYagvnE41cg/edit?utm_content=DAFBhq5jpOc&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)

- Hierarchical Inheritance
  - Where one class properties and behaviors are acquired by multiple classes
  - [Hierarchical Inheritance](https://www.canva.com/design/DAFBhmD9gTc/njQdV73-9DnFYEh5YaZQoA/edit?utm_content=DAFBhmD9gTc&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)

- JAVA does not support Multiple Inheritance
  - You cannot subclass two classes at once into a single class

Example 1 : (Single Inheritance)

```java
import java.lang.Math;
// Single Inheritance
// Code Reusability - Child class has additional features than that of the Parent class
class Parent{
    int a;
    public int square(){
        return a*a;
    }
}

class Child extends Parent{
    double b;
    public double squareRoot(){
        return Math.sqrt(b);
    }
}

class Main{
    public static void main(String a[]){
        Child c = new Child();
        c.a = 10;
        int s = c.square();
        System.out.println(s);
        
        c.b = 4.00;
        double sq = c.squareRoot();
        System.out.println(sq);
    }
}
```

Example 2 (Multi Level Inheritance)

```java
import java.lang.Math;
// Multi level Inheritance
class Parent{
    int a;
    public int square(){
        return a*a;
    }
}

class Child extends Parent{
    double b;
    public double squareRoot(){
        return Math.sqrt(b);
    }
}

class Child2Child extends Child{
    double x,y;
    public double num2Power(){
        return Math.pow(x,y);
    }
}

class Main{
    public static void main(String a[]){
        Child2Child c = new Child2Child();
        c.a = 10;
        int s = c.square();
        System.out.println(s);
        
        c.b = 4.00;
        double sq = c.squareRoot();
        System.out.println(sq);
        
        c.x = 4;
        c.y = 2;
        double z = c.num2Power();
        System.out.println(z);
    }
}
```

Example 3 (hierarchical Inheritance)

```java
// Hierarchical Inheritance

class Animal{
   public void eat(){
       System.out.println("Eating...");
   }
}

class Cat extends Animal{
    public void Shout(){
        System.out.println("Meow!");
    }
}

class Dog extends Animal{
   public void Shout(){
        System.out.println("Bow!");
    }
}

class Main{
   public static void main(String a[]){
       Cat c = new Cat();
       c.Shout();
       c.eat();
   
      Dog d = new Dog();
      d.Shout();
      d.eat();
   }
}
```

Example (hierarchical Inheritance)

```java
class A{
    int a;
    public int doubleA(){
        return 2*a;
    }
}

class B extends A{
    public int doubleDouble(){
        return 2*doubleA();
    }
}

class C extends A{
    public double halfDouble(){
        return doubleA()/2;
    }
}

class Main{
    public static void main(String a[]){
        B b = new B();
        b.a = 10;
        System.out.println(b.doubleDouble());
        
        C c = new C();
        c.a = 500;
        System.out.println(c.halfDouble());
    }
}
```

### Polymorphism
- Means existing in multiple forms
- Two Types of Polymorphism
  - 1. Run Time Polymorphism (Method Overriding)
    2. Compile time Polymorphism (Method Overloading)
- Method Overloading (Compile time polymorphism)
  - if a class has multiple methods of same name but different number / type of parameters, then it is known as Method Overloading

Example:

```java
class MethodOverloading{
    public void sum(int a, int b){
        System.out.println(a+b);
    }
    
    public void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    
    public void sum(double a, double b){
        System.out.println(a+b);
    }
}

class Main{
    public static void main(String args[]){
        MethodOverloading mo = new MethodOverloading();
        mo.sum(1.0,2.3);
    }
}
```
- If you change the return type of the methods and expect method overloading to take place, it won't.

- Method Overriding (Run Time Polymorphism)
  - Inorder to implement Method overriding, we need to first implement inheritance.
  - Method overriding means that creating the same method in child class which is already present in the parent class.

Example (method overriding)

```java
class A{
    public void sum(int a, int b){
        System.out.println("This is from class A");
        System.out.println(a+b);
    }
}

// Inheritance has to be there to work with overriding
class B extends A{
    public void sum(int a, int b){
        System.out.println("this is from class B");
        System.out.println(a*b);
    }
}

class Main{
    public static void main(String args[]){
        B b = new B();
        b.sum(10,5);
    }
}
```
### Super Keyword
- ```super``` is a keyword in java, which is used to refer to the immediate super class object.
- if you create an object for a class B that is extending to class A, implicitly, there will be an object created for class A. To refer to that implicitly created object, we can use ```super``` keyword.

Uses
1. super -> refer to the immediate parent class variable
2. super -> to refer to the immediate parent class method
3. super -> refer to the immediate parent class Constructor

Example 1 (refer to parent class variable)

```java
class A{
    int count = 0;
}


class B extends A{
    int count = 0;
    public void showNumber(){
        System.out.println(count);
        System.out.println(super.count);
    }
   
}

class Main{
    public static void main(String args[]){
        B b = new B();
        b.count = b.count + 1;
        b.showNumber();
    }
}
```

Example (Refer to the parent class Method)
```java
class A{
    int count = 0;
    public void showNumber(){
        System.out.println("Naresh Technologies");
    }
}


class B extends A{
    int count = 0;
    public void showNumber(){
        System.out.println(count);
        super.showNumber();
    }
   
}

class Main{
    public static void main(String args[]){
        B b = new B();
        b.count = b.count + 1;
        b.showNumber();
    }
}
```
Example (refer to the parent class constructor)

```java
class A{
    A(){
        System.out.println("Constructor in A is called");
    }
}

class B extends A{
    // whenever you call super() constructor, always keep the call 
    // in the first line of the sub class constructor
    B(){
        super();
        System.out.println("Constructor in B is called");
    }
}

class Main{
    public static void main(String args[]){
        B b = new B();
    }
}
```

Two Types of Variables
- Class variables
- Instance Variables

### static keyword
- It is used for Memory Management
- ```static``` keyword can be applied for variables, methods, blocks and nested classes ( classes defined inside another class)

- Java Static Variables
  - static variables are defines using ```static``` keyword.
  - if you have a common property that needs to be applied for all the objects that you create for a class - then, to manage the memory well, you can use a static variable.
  - You can access the static variable without creating an instance of the class.

Example

```java
class Count{
    static int count  = 0;
    Count(){
        count++;
    }
    
    public static void displayTotalNumber(){
        System.out.println(count);
    }
    
}

class Main{
    public static void main(String args[]){
        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();
        
        Count.displayTotalNumber();
    }
}
```

- Java Static Methods
  - Java static methods belong to the class than that of the instances/ objects that you create for the class
  - Static methods can be accessed without a need to create an object for the classes
  - Java static methods can access the java static variables and change the value in them.
  - You cannot access non static members (variables & objects ) directly from a static method.
  - ```this``` and ```super``` keywords in the static context.

```java
class Student{
    String name;
    int student_id;
    static String college_name = "Naresh Technologies College";
    
    public static void change(){
        college_name = "Naresh IT Technologies";
    }
    
    Student(String n, int s_id){
        name = n;
        student_id = s_id;
    }
    
    public void display(){
        System.out.println(name+" "+student_id+" "+college_name);
    }
}

class Main{
    public static void main(String args[]){
        Student s1 = new Student("PAVAN",123);
        Student s2 = new Student("Aman",456);
        Student.change();
        Student s3 = new Student("Darshana",789);
        
        s1.display();
        s2.display();
        s3.display();
    }
}
```
Non Static Member of a class cannot be called directly from a static instance
![Example-Image](https://raw.githubusercontent.com/tadipavankumarreddy/Naresh-Technologies---Android-Resources/master/ref_img.png)

- Java static blocks
  - It can be used to initialize the static data member
  - It is something that gets executed before the main() method, so, if you want to perform any logic before the main method is called, you can use static block

Example
```java
class Main{
    static{
        System.out.println("I get printed first!");
    }
    public static void main(String args[]){
        System.out.println("I get printed next to static block");
    }
}
```
### ```this``` keyword in java
- ```this``` is a reference variable that refers to the current object
- Uses of ```this``` keyword
  - this can be used to implicitly invoke current class Method
  - this() can be used to invoke the current class constructor
  - this can be passed as an arg in the method call

Example (using ```this``` to refer to the current class instance variables)
```java
class Employee{
    String name;
    int id;
    int salary;
    
    Employee(String name, int id, int salary){
      this.name = name;  
      this.id = id;
      this.salary = salary;
    }
    
    public void print(){
        System.out.println(name+" "+id+" "+salary);
    }
}
```
Example (invoke the current class method  with the help of ```this``` keyword)
```java
class Employee{
    String name;
    int id;
    int salary;
    
    Employee(String name, int id, int salary){
      this.name = name;  
      this.id = id;
      this.salary = salary;
    }
    
    public void print(){
        System.out.println(name+" "+id+" "+salary);
        this.printDevName(); // same as that of calling the method without this keyword
    }
    
    public void printDevName(){
        System.out.println("The developer is anonymous");
    }
}
```
Example (how to use ```this``` keyword to call the current class constructor)
```java
class Employee{
    String name;
    int id;
    int salary;
    
    Employee(String name){
        this(name, 123, 30000);
    }
    
    Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    public void print(){
        System.out.println(name+" "+id+" "+salary);
        this.printDevName(); // same as that of calling the method without this keyword
    }
    
    public void printDevName(){
        System.out.println("The developer is anonymous");
    }
}
```

### Abstract classes in Java
- When you declare a class with ```abstract``` keyword, that becomes an abstract class
- In abstract classes we can include method with definition and methods without definition (Methods without definition are called abstract methods)
#### Abstraction
  - Abstraction is the process of hiding the implementation details and also showing the functionality to the user.
  - Two ways to achieve abstraction in Java
      1. abstract classes (0% to 100%) 
      2. interfaces (100%)

##### Important points to remember when it comes to abstract classes
- Abstract classes must be inherited by other classes where the definition of abstract methods of the class will be written.
- Abstract classes cannot be instantiated (you cannot create objects for abstract classes).
- abstract classes can have static methods and Constructors.
- You can also define ```final``` methods which will force the subclass not to modify the defined methods.

How to define an Abstract class ?
```java
abstract class RBI{
    
}
```
Example

```java
abstract class RBI{
    RBI(){
        System.out.println("This bank follows RBI guidelines and is a RBI registered bank");
    }
    public abstract int homeLoanInterestRate(); // this is an abstract method - This method will not have any definition.
    public final int personalLoanInterestRate(){
        return 7;
    }
}

class SBI extends RBI{
    public int homeLoanInterestRate(){
        // you can define body here in the subclass
        return 17;
    }
}

class ICICI extends RBI{
    public int homeLoanInterestRate(){
        //banks are given an opportunity to charge what ever the interest rate that they want to collect on home loan
        return 19;
    }
}

class Main{
    public static void main(String args[]){
        SBI s = new SBI();
        System.out.println(s.homeLoanInterestRate()+"%");
        System.out.println(s.personalLoanInterestRate()+"%");
        
        ICICI i = new ICICI();
        System.out.println(i.homeLoanInterestRate()+"%");
        System.out.println(i.personalLoanInterestRate()+"%");
    }
}
```
### Final Keyword in java
- ```final``` keyword is used to restrict the user to perform certain actions. 
- ```final``` can be used for
    - variables (The value that you assigned for a final variable cannot be changed - It becomes a constant) 
    - methods (if you apply final keyword for methods, they cannot be overrided in the subclasses)
    - class (if you apply final keyword for classes, they cannot be inherited by other classes)
![Final classes](https://raw.githubusercontent.com/tadipavankumarreddy/Naresh-Technologies---Android-Resources/master/Screenshot%202022-05-26%20201942.png)

Example

```java
class Main{
    public static final int age = 10;
    public static void main(String args[]){
        age = 11;
        System.out.println(age);
    }
}
```
Output:
```
Main.java:4: error: cannot assign a value to final variable age
        age = 11;
        ^
1 error
```
### Interfaces in java
- An interface in java is a blueprint of a class
- It consists of Static Constants and abstract methods (You can only have abstract methods)
- With interfaces we can be sure of 100% of abstraction.
- With interfaces, you can also implement Multiple inheritance in java. 
- Interfaces cannot be instantiated (you cannot create objects for interfaces)
##### Why Interfaces ?
- for implementation of abstraction
- for implementing multiple inheritance

Syntax
```java
interface NareshItTechnologies{
  // Constants
  ..
  // Abstract methods
}
```
Example
```java
interface Sample{
    // you need not to declare a method in an interface as abstract
    // because by default any method you declare inside an interface is abstract.
    void display();
}

// to use an interface in a class, you can use implements keyword in java 
// extends -> inheriting a class into another class
// implements -> implement the methods of an interface.
class A implements Sample{
    
    public void display(){
        System.out.println("Hello World!");
    }    
    
}

class Main{
    public static void main(String args[]){
        A a = new A();
        a.display();
    }
}
```

Example

```java
// No matter how many times you defined a method of an interface, it is absolutely necessary that 
// you define it in whatever the class that is implementing the interface

interface Shape{
    void shapeName();
}

class Rectangle implements Shape{
    public void shapeName(){
        System.out.println("Rectangle");
    }
}

class Triangle implements Shape{
    public void shapeName(){
        System.out.println("Triangle");
    }
}

class Square implements Shape{
    public void shapeName(){
        System.out.println("Square");
    }
}

class Main{
    public static void main(String args[]){
        Triangle t = new Triangle();
        t.shapeName();
    }
}
```

###### How to implement Multiple inheritance using interfaces?
![Reference Image](https://raw.githubusercontent.com/tadipavankumarreddy/Naresh-Technologies---Android-Resources/master/ref_img_2.png)


