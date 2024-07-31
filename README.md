# Java Basics

This repository is designed for those who want to learn the basics of the Java programming language. The content covers the fundamental building blocks of Java, its syntax, and basic programming concepts.

- [Syntax](#syntax)
- [Variables](#variables)
- [Data Types](#data-types)
- [Type Casting](#type-casting)
- [Operators](#operators)
- [Ternary Operator](#ternary-operator)
- [Loops](#loops)
- [Arrays](#arrays)
- [Methods](#methods)
- [Java Classes](#java-classes)
    - [Java OOP](#java-oop)
    - [Classes & Objects](#what-are-classes-and-objects)
    - [Create a Class](#create-class)
    - [Create an Object](#create-an-object)
    - [Using Multiple Classes](#using-multiple-classes)
    - [Class Attributes](#class-attributes)
    - [Accessing Attributes](#accessing-attributes)
    - [Modify Attributes](#modify-attributes)
    - [Multiple Objects](#multiple-objects)
    - [Multiple Attributes](#multiple-attributes)
    - [Static vs Public](#static-vs-public)
    - [Constructors](#constructors)
    - [Modifiers](#modifiers)
    - [Abstract](#abstract)


**Reference:** [w3Schools](https://www.w3schools.com/java/default.asp), [İrfan Duman](https://www.youtube.com/playlist?list=PLd7oUmRdt0s5uKceEAK50Z6GfC0RI5SFT), [Kodlama Vakti -- Mustafa Çetindağ](https://www.youtube.com/playlist?list=PLEcJSEQK_cD5KHgg9sXumeg659hAr2j4W)

### **Algortirma kurarken:**
> değişkenleri tespit et: kullanıcıdan alınacak girdi ve çıktı vermek için gerekli
> hesaplamaları yap
> koşullara bak: isterlere göre koşul sağlanıyor mu kurgula
> sonucu yazdır: kullanıcıya gösterilmek istenen errormsg - succces vs output çıktıları ver
# Syntax

- every line of code that runs in java must in a class. a class should always start uppercase first letter.
-  java file must match the class name
- You should also note that each code statement must end with a semicolon (`;`)
- package = file
- maven projects -> management 
**every java program has a class name which must match the filename & every program must contain the main() method**

# Variables

- `String` - stores text, such as "Hello". String values are surrounded by double quotes
- `int` - stores integers (whole numbers), without decimals, such as 123 or -123
- `float` - stores floating point numbers, with decimals, such as 19.99 or -19.99
- `char` - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
- `boolean` - stores values with two states: true or false

**syntax:**

```java
type variableName = value;
```


**For numeric values, the `+` character works as a mathematical [operator](https://www.w3schools.com/java/java_operators.asp)**

To declare more than one variable of the **same type**, you can use a comma-separated list:
> Instead of writing:


```
int x = 5;
int y = 6;
int z = 50;
System.out.println(x + y + z);
```

> You can simply write:


```
int x = 5, y = 6, z = 50;
System.out.println(x + y + z);
```


You can also assign the **same value** to multiple variables in one line:

```
int x, y, z;
x = y = z = 50;
System.out.println(x + y + z);
```


All variables has unique name which is the identifier.

It is recommended to use descriptive names in order to create understandable and maintainable code.
> The general rules for naming variables are:

> - Names can contain letters, digits, underscores, and dollar signs
> - Names must begin with a letter
> - Names should start with a lowercase letter, and cannot contain whitespace
> - Names can also begin with $ and _ (but we will not use it in this tutorial)
> - Names are case-sensitive ("myVar" and "myvar" are different variables)
> - Reserved words (like Java keywords, such as `int` or `boolean`) cannot be used as names
    > **Type casting** - convert the following `double` type (myDouble) to an `int` type:

> `double myDouble = 9.78d;`

> `int myInt =  (int)myDouble;`

> Use to print the length of the `txt` string.

> `String txt = "Hello";`

> `System.out.println(txt.length());`

> Convert the value of `txt` to upper case.

> `String txt = "Hello";`

> `System.out.println(txt.toUpperCase());`

> Use the correct method to **concatenate** two strings:

> `String firstName = "John ";`

> `String lastName = "Doe";`

> `System.out.println(firstName.concat(lastName));`

> Return the **index** (position) of the first occurrence of **"e"** in the following string:

> `String txt = "Hello Everybody";`

> `System.out.println(txt.indexOf("e"));`

Main method:
system begin with this method.
> firstly run **main** method. To run other methods, it is necessary to run it through the main method.


General Syntax:
```java
public class OrnekSinif { // Başharfi büyük, class name
    public static void main(String[] args){ // main methodu yerleştiriliyor.
        //todo auto-generated method stub 
      //statementsları bodyde yazarız. body mainde olur. main çalışır.
      System.out.println("Hello World"); 
    }
}
```

System.out: 

```
System.out.print("Merhaba");
System.out.print("Hello");
```
output like this: MerhabaHello. Because of "print"
If use println (ln means line, this output only one line)


> "\n" : bir alt satıra iner. print ile kullanılırsa println mantığına çevirir
> "\t" : tab

```
        // \n means next line
        System.out.print("\nDünya");
        System.out.print("Merhaba\n Dünya");
        // if use \n = println
        System.out.println("Println Dünya");
        //if use \t means 1 tab
        System.out.println("\t Merhaba tablı örnek");

```

# Data Types:

> veri tipi desğişken ismi ve değişken değeri. ama adresleme kısmı işletim sistemiyle alakalı

tamsayı: int, byte, short, long
ondalıklı sayı: float, double
karakter: char
mantıksal: boolean

Data types are divided into two groups:

- Primitive data types - includes `byte`, `short`, `int`, `long`, `float`, `double`, `boolean` and `char`
- Non-primitive data types - such as `[String](https://www.w3schools.com/java/java_strings.asp)`, [Arrays](https://www.w3schools.com/java/java_arrays.asp) and [Classes](https://www.w3schools.com/java/java_classes.asp) (you will learn more about these in a later chapter)

**The `float` and `double` data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles:**
**double:** yüksek duyarlıklı, üst düzey logaritmik fonksiyonlar ve hassas matematiksel işlemler. daha yavaştır ve fazla yer kapsal. bu işlemler arasında ms oynar.
**float**hız ve bellek. tam sayı yazsan da float a = 1.0 çıktısını verir. float tanımlamasından sonra f ya da F konulur doubledan ayırmak için
> hassas işlemleri cos-sin gibi double ile döndürür.

```
float myNum = 5.75f;
System.out.println(myNum);
```


```
double myNum = 19.99d;
System.out.println(myNum);
```

> Use `float` or `double`?

> The **precision** of a floating point value indicates how many digits the value can have after the decimal point. The precision of `float` is only six or seven decimal digits, while `double` variables have a precision of about 15 digits. Therefore it is safer to use `double` for most calculations.


Non-primitive data types are called **reference types** because they refer to objects.
> The main difference between **primitive** and **non-primitive** data types are:

> - Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for `String`).
> - Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
> - A primitive type has always a value, while non-primitive types can be `null`.
> - A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.

# Type Casting

- **Widening Casting** (automatically) - converting a smaller type to a larger type size

  `byte` -> `short` -> `char` -> `int` -> `long` -> `float` -> `double`


- **Narrowing Casting** (manually) - converting a larger type to a smaller size type

  `double` -> `float` -> `long` -> `int` -> `char` -> `short` -> `byte`

# Operators

> Java divides the operators into the following groups:
> - Arithmetic operators: addition (+), subtraction (-), multiplication (*), division(/), modulus(%), increment(++) and decrement (--)
> - Assignment operators: "=", "+=", "-=", "*=", "/=", "%=", "&=", "|=", "^=", "<<=", ">>="
> - Comparison operators: "==", "!=", "<", ">", "<=", ">="
> - Logical operators: &&, ||, !
> - Bitwise operators: b = (a==1) ? 1 : 0

Java Strings:
> ***Java uses the `+` operator for both addition and concatenation.Numbers are added. Strings are concatenated.***

**concat işlemi javada her zaman daha maliyetlidir.**
**formatlamak çok daha az maliyetli ve daha hızlı çalışır concata göre**

special characters:

The backslash (`\`) escape character turns special characters into string characters:

| **Escape character** | **Result** | **Description** |
| -------------------- | ---------- | --------------- |
| '                    | '          | Single quote    |
| "                    | "          | Double quote    |
| \                    | \          | Backslash       |

```
String txt = "We are the so-called \"Vikings\" from the north.";
```


```
String txt = "It\'s alright.";
```


```
String txt = "The character \\ is called backslash.";
```


**Other common escape sequences that are valid in Java are:**

| **Code** | **Result**      |
| -------- | --------------- |
| \n       | New Line        |
| \r       | Carriage Return |
| \t       | Tab             |
| \b       | Backspace       |
| \f       | Form Feed       |

# Ternary Operator


Insert the missing parts to complete the following "short hand `if...else` statement" (**ternary operator**):
> `int time = 20;`

> `String result = time < 18  "Good day."  "Good evening.";`

> `System.out.println(result);`


# Loops:


## switch-case:

> This is how it works:

> - The `switch` expression is evaluated once.
> - The value of the expression is compared with the values of each `case`.
> - If there is a match, the associated block of code is executed.
> - The `break` and `default` keywords are optional, and will be described later in this chapter


- **When Java reaches a `break` keyword, it breaks out of the switch block.**
- **This will stop the execution of more code and case testing inside the block.**
- **When a match is found, and the job is done, it's time for a break. There is no need for more testing.**
- **A break can save a lot of execution time because it "ignores" the execution of all the rest of the code in the switch block.**

**Note that if the `default` statement is used as the last statement in a switch block, it does not need a break.**

## print i as long as i is less than 6:

> `int i = 1;`

> `while(i < 6) {`

> `System.out.println(i);`

> `i++;`

> `}`


**Do not forget to increase the variable used in the condition, otherwise the loop will never end!**

## Use the do/while loop to print i as long as i is less than 6.

> `int i3 = 1;`

> `do {`

> `System.out.println(i3);  
i3++;`

> `}`

> `while(i3<6);`


**This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.**

**Do not forget to increase the variable used in the condition, otherwise the loop will never end!**

##  Loop through the items in the cars array. for-each loop:

> `String[] cars = {"Volvo", "BMW", "Honda"};`

> `for(String car : cars){`

> `System.out.println(car);`

> `}`


**It is also possible to place a loop inside another loop. This is called a nested loop. The "inner loop" will be executed one time for each iteration of the "outer loop".**

##  Stop the loop if i is 5.


**The `break` statement can also be used to jump out of a loop.**
> `for (int i = 0; i < 10; i++) {`

> `if (i == 5) {`

> `break;  
}`

> `System.out.println(i);`

> `}`


## In the loop, when the value is "4", jump directly to the next value.


**The `continue` statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.**
> `for(int i = 0; i<10; i++){`

> `if(i ==4){`

> `continue;  
}`

> `System.out.println(i);`

> `}`


# Arrays


**Array indexes start with 0: [0] is the first element. [1] is the second element, etc.**

**To change the value of a specific element, refer to the index number**

**You can loop through the array elements with the `for` loop, and use the `length` property to specify how many times the loop should run.**
> There is also a "**for-each**" loop, which is used exclusively to loop through elements in arrays → for-each loop:

> - The example above can be read like this: **for each** `String` element (called **i** - as in **i**ndex) in **cars**, print out the value of **i**.
> - If you compare the `for` loop and **for-each** loop, you will see that the **for-each** method is easier to write, it does not require a counter (using the length property), and it is more readable.

## two or multi-dimensional array:


```
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
System.out.println(myNumbers[1][2]); // Outputs 7
```


loop through a multi-dimetional array:
> You can also use a `for loop` inside another `for loop` to get the elements of a two-dimensional array (we still have to point to the two indexes):


```
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
for (int i = 0; i < myNumbers.length; ++i) {
  for (int j = 0; j < myNumbers[i].length; ++j) {
    System.out.println(myNumbers[i][j]);
}}
```

> Or you could just use a **for-each** loop, which is considered easier to read and write:


```
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
for (int[] row : myNumbers) {
  for (int i : row) {
    System.out.println(i);
  
```


# **Methods**


A method is block of code which only runs when it is called. You can pass data, known as parameters, into a method. Methods are used to perform certain actions, and they are also known as **functions**.

```java
public class Main {
  static void myMethod() {
    // code to be executed
  }
}
```

- myMethod() is name of the method
- `static` means that the method belongs to the Main class and not an object of the Main class.
- `void` means that this method does not have a return value

with parameter method

```java
public class Main {
  static void myMethod(String fname) {
    System.out.println(fname + " abc");
  }

  public static void main(String[] args) {
    myMethod("Liam");
    myMethod("Jenny");
    myMethod("Anja");
  }
}
// Liam abc
// Jenny abc
// Anja abc
```


multiple parameters:

```java
public class Main {
  static void myMethod(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    myMethod("Liam", 5);
    myMethod("Jenny", 8);
    myMethod("Anja", 31);
  }
}

// Liam is 5
// Jenny is 8
// Anja is 31
```


## return values:


**if u want method to return a value, u can use a primitive data types (int, char, double, etc) instead of boid & use the return keyword.**

```java
public class Main {
  static int myMethod(int x) {
    return 5 + x;
  } // return keyword and used primitive parameters

  public static void main(String[] args) {
    System.out.println(myMethod(3));
  }
}
```


## method overloading


**Multiple methods can have the same name as long as the number and/or type of parameters are different.**

with overloading, multiple methods can have the same name with different params.

```other
int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)
```


has two methods that add numbers of different types:

```other
static int plusMethodInt(int x, int y) {
  return x + y;
}

static double plusMethodDouble(double x, double y) {
  return x + y;
}

public static void main(String[] args) {
  int myNum1 = plusMethodInt(8, 5);
  double myNum2 = plusMethodDouble(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}
```


also the same thing, it is better to overload one. overload the plusMethod to work for both int and double:

```other
static int plusMethod(int x, int y) {
  return x + y;
}

static double plusMethod(double x, double y) {
  return x + y;
}

public static void main(String[] args) {
  int myNum1 = plusMethod(8, 5);
  double myNum2 = plusMethod(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}
```


## scope

- method scope: variables declared directly inside a method are available anywhere in the method following line of code.

```other
public class Main {
  public static void main(String[] args) {

    // Code here CANNOT use x

    int x = 100;

    // Code here can use x
    System.out.println(x);
  
```

- block scope: code refers to all the ode between curly braces {}. variables declared inside blocks of code are only accessbile by the code between the curly braces:

```other
public class Main {
  public static void main(String[] args) {

    // Code here CANNOT use x because of block scope

    { // This is a block

      // Code here CANNOT use x because of method scope

      int x = 100;

      // Code here CAN use x
      System.out.println(x);

    } // The block ends here

  // Code here CANNOT use x because of block scope

  }
}
```


**A block of code may exist on its own or it can belong to an `if`, `while` or `for` statement. In the case of `for` statements, variables declared in the statement itself are also available inside the block's scope.**

## recursion


Adding two numbers together is easy to do, but adding a range of numbers is more complicated. In the following example, recursion is used to add a range of numbers together by breaking it down into the simple task of adding two numbers:

Use recursion to add all of the numbers up to 10.

```other
public class Main {
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}
```


When the `sum()` function is called, it adds parameter `k` to the sum of all numbers smaller than `k` and returns the result. When k becomes 0, the function just returns 0. When running, the program follows these steps:
> 10 + sum(9)

> 10 + ( 9 + sum(8) )

> 10 + ( 9 + ( 8 + sum(7) ) )

> ...

> 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)

> 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0


Since the function does not call itself when `k` is 0, the program stops there and returns the result.


## halting condition


Just as loops can run into the problem of infinite looping, recursive functions can run into the problem of infinite recursion. Infinite recursion is when the function never stops calling itself. Every recursive function should have a halting condition, which is the condition where the function stops calling itself. In the previous example, the halting condition is when the parameter `k` becomes 0.

It is helpful to see a variety of different examples to better understand the concept. In this example, the function adds a range of numbers between a start and an end. The halting condition for this recursive function is when **end** is not greater than **start**:

```other
public class Main {
  public static void main(String[] args) {
    int result = sum(5, 10);
    System.out.println(result);
  }
  public static int sum(int start, int end) {
    if (end > start) {
      return end + sum(start, end - 1);
    } else {
      return end;
    }
  }
}
```


**The developer should be very careful with recursion as it can be quite easy to slip into writing a function which never terminates, or one that uses excess amounts of memory or processor power. However, when written correctly recursion can be a very efficient and mathematically-elegant approach to programming.**

# **Java Classes**


## Java OOP

1. faster and easier to execute
2. provides clear structure for programs
3. helps to keep the code "Dont Repeat Yourself" (DRY)
4. makes code easier to maintain, modify and debug

## What are classes and objects?


classes and objects are two main aspects of oop
> → exp:

> 	class: car

> 	objects: volvo, toyota, audi

> **so class is template for objects and an object is an instance of a class. when the individual objects are created the inherit all the variables and methods from class.**


everything in java is associated with classes and objects along with its attributes & methods.
> → exp:

> 	a car is an object.

> 	the car has attributes such as weight and color

> 	methods such as drive and brake

> 	**a class is like an object constructor or a "blueprint" for creating objects**


## create class


	use keyword: class

    ```java
    public class Main {
      int x = 5;
    }
    ```


# create an object


	to create an object of main specify class name followed by object name and use the keyword "new"

    ```java
    public class Main {
      int x = 5;
    
      public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
      }
    }
    ```


## 	using multiple classes


	u can also create an object of a class and access it in another class. this is often used for better organization of classes

	→ one class has all the attributes and methods, while the other class holds the `main()` method (code to be executed)

	→ u created two files in the same directory/folder

	→ Main.java:

    ```java
    public class Main {
      int x = 5;
    }
    ```


	→ Second.java:

    ```java
    class Second {
      public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
      }
    }
    ```


	→ when both files have been compiled

	→ run the Second.java file

	→ output: 5

## class attributes


it is actually an attribute of class

create a class called "main" with two attributes x & y :

```
public class Main {
  int x = 5;
  int y = 3;
}
```


**other term for class attributes is fields.**

## accessing attributes


You can access attributes by creating an object of the class, and by using the dot syntax (`.`)

## modify attributes

> set value of x to 40:


```java
public class Main {
  int x;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 40;
    System.out.println(myObj.x);
  }
}
```


or override existing values:
> Change the value of `x` to 25:


```java
public class Main {
  int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);
  }
}
```


**If you don't want the ability to override existing values, declare the attribute as `final`:**

```java
public class Main {
  final int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
```


**The `final` keyword is useful when you want a variable to always store the same value, like PI (3.14159...). The `final` keyword is called a "modifier".**

## multiple objects


If you create multiple objects of one class, you can change the attribute values in one object, without affecting the attribute values in the other:
> Change the value of `x` to 25 in `myObj2`, and leave `x` in `myObj1` unchanged:


```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj1 = new Main();  // Object 1
    Main myObj2 = new Main();  // Object 2
    myObj2.x = 25;
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
  }
}
```


## multiple attributes


```java
public class Main {
  String fname = "John";
  String lname = "Doe";
  int age = 24;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
  }
}
```


## static vs public


You will often see Java programs that have either `static` or `public` attributes and methods.

In the example above, we created a `static` method, which means that it can be accessed without creating an object of the class, unlike `public`, which can only be accessed by objects:
> remember it:

> - The dot (`.`) is used to access the object's attributes and methods.
> - To call a method in Java, write the method name followed by a set of parentheses **()**, followed by a semicolon (`;`).
> - A class must have a matching filename (`Main` and **Main.java**).

## constructors


A constructor in Java is a **special method** that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes
> note that:

> - the constructor name must **match the class name**, and it cannot have a **return type** (like `void`).
> - Also the constructor is called when the object is created.
> - All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.

## modifiers


The `public` keyword is an **access modifier**, meaning that it is used to set the access level for classes, attributes, methods and constructors.
> We divide modifiers into two groups:

> - **Access Modifiers** - controls the access level
    > public: any class (for class & attributes & methods)

> default: accessible by classes in the same package (for class)

> private: only accesible within declared class  (for class & attributes & methods)

> protected: in the same packgae and sub-classes.  (for class & attributes & methods)

> - **Non-Access Modifiers** - do not control access level, but provides other functionality
    > final: cannot be inherited by other classes (for classes)

> abstract: cannot used create objects. to access an abstract class it MUST be inherited from another class (for classes)

> final: cannot be overridden/modified (method & attributes)

> static: belongs to class rahter than an object (method & attributes)

> abstract: Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example **abstract void run();**. The body is provided by the subclass (inherited from).  (method & attributes)

> transient: sk,pped when serializng object containing them  (method & attributes)

> synchronized: be accessed by one thread at a time  (method & attributes)

> volatile: is not cached thread-locally & always read from the main memory  (method & attributes)


**If you don't want the ability to override existing attribute values, declare attributes as `final`**

## static vs public:


```java
public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[ ] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would output an error

    Main myObj = new Main(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method
  }
}
```


## abstract


An `abstract` method belongs to an `abstract` class, and it does not have a body. The body is provided by the subclass:

```
// Code from filename: Main.java
// abstract classabstract class Main {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends Main {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}
// End code from filename: Main.java

// Code from filename: Second.java
class Second {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Main)
    Student myObj = new Student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method  }
}
```

