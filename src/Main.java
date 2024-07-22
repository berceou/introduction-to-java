//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //? how to print something
        System.out.println("Hello and welcome!"); //* print a line of next to the screen
        System.out.print("You can use print"); //* also u can use print() for does not insert a new line at the end of the output
        System.out.println(123); //* u can print numbers

        //? Variables
        String name = "Ozum"; //* string, stores text
        System.out.println("Hello, " + name);
        int age = 22; //* stores integers without decimals such as 123 or -123
        System.out.println("Hello, " + age);
        float age2 = 22.5f; //* stores floating point numbers with decimals such as 19.99 or -19.99
        System.out.println("Hello, " + age2);
        char myLetter = 'A'; //* stores single char such as 'a' or 'B'. surrounded single quotes. ASCII table
        System.out.println("Hello, " + myLetter);
        boolean isItBool = true; //* stores two states true or false
        System.out.println("Hello, " + isItBool);
        //! for numeric values the '+' character works as a math operator
        String firstName = "firstName";
        String lastName = "lastName";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        //! same type variables u can use a comma-separated list:
        //*instead of writing
        int x = 5;
        int y = 6;
        int z = 50;
        System.out.println(x + y + z);
        //* simply write:
        int x1 = 5, y1 = 6, z1 = 50;
        System.out.println(x1 + y1 + z1);

        //calculate integer variables
        int length = 4;
        int width = 6;
        int area;
        // calculate the area of a rectangle
        area = length * width;
        System.out.println("Area of the desired rectangle is:" + area);
        System.out.println("Width is:" + width);
        System.out.println("Length is:" + length);

        //* type casting - convert double type to an int type:
        double myDouble2 = 9.98d;
        int myInt2 = (int) myDouble2;
        System.out.println(myInt2);

        //* use to print the length the string:
        String txt = "hello";
        System.out.println(txt.length());

        String txt0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt0.length());


        //* convert value of txt to upper case (similar toLowerCase())
        String txt2 = "Hello";
        System.out.println(txt2.toUpperCase());

        //* use concatenate 2 strings:
        String firstName2 = "firstName2";
        String lastName2 = "lastName2";
        System.out.println(firstName2 + " " + lastName2);
//!: Note that we have added an empty text (" ") to create a space between firstName and lastName on print.
        System.out.println(firstName2.concat(lastName2));

        //* index of the first occurrence of "e":
        String txt3 = "hello everybody";
        System.out.println(txt3.indexOf("e"));
        System.out.println(txt3.indexOf("hello"));

        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);

        //* automatic casting:
       /*
       int myInt4 = 9;
        double myDouble4 = myInt4; // Automatic casting: int to double

        System.out.println(myInt4);      // Outputs 9
        System.out.println(myDouble4);   // Outputs 9.0
        */

        //* narrowing casting:
        double myDouble5 = 9.78d;
        int myInt5 = (int) myDouble5; // Manual casting: double to int

        System.out.println(myDouble5);   // Outputs 9.78
        System.out.println(myInt5);      // Outputs 9

        // Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /* Calculate the percentage of the user's score in relation to the maximum available score.
Convert userScore to float to make sure that the division is accurate */
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);

        //* Special String Chars
        String txtDoubleQuote = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txtDoubleQuote);
        // String txtSingleQuote = "It\'s alright.";
        // System.out.println(txtSingleQuote);
        String txtSingleBackslash = "The character \\ is called backslash.";
        System.out.println(txtSingleBackslash);

        //* java math expressions:
        int maximumNum = Math.max(5, 10);// highest value
        System.out.println(maximumNum);
        int minimumNum = Math.min(5, 10); // lowest value
        System.out.println(minimumNum);
        int squareRootNum = (int) Math.sqrt(64); // returns the square root of x
        System.out.println(squareRootNum);
        int absNum = (int)  Math.abs(-4.7); // returns absolute positive value
        System.out.println(absNum);
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum); // returns random number between 0.0 - 1.0

        //* ternary operator
        int exp1 = 20;
        String result =(exp1 > 10) ? "Good" : "Bad";
        System.out.println(result);

        //* loops:

        //? Print i as long as i is less than 6
        int i2 = 1;
        while(i2 < 6){
            System.out.println(i2);
            i2++;
        }

        //? Use the do/while loop to print i as long as i is less than 6.

        int i3 = 1;
        do {
            System.out.println(i3);
            i3++;
        }
        while(i3<6);

        //? Loop through the items in the cars array.
        String[] cars = {"Volvo", "BMW", "Honda"};
        for(String car : cars){
            System.out.println(car);
        }

        //? Stop the loop if i is 5.

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        //? In the loop, when the value is "4", jump directly to the next value.
        for(int i = 0; i<10; i++){
            if(i ==4){
                continue;
            }
            System.out.println(i);
        }

        //* Arrays
        // length for how many elements are there
        String[] cars4 = {"Volvo", "BMW", "Ford"};
        System.out.println(cars4.length);
        System.out.println(cars4[0]);

        //? two-dimensional array:

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[0].length);

        //* methods:
        /*
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
         */

        /*
        public class Main {

  // Create a checkAge() method with an integer variable called age
  static void checkAge(int age) {

    // If age is less than 18, print "access denied"
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!");

    // If age is greater than, or equal to, 18, print "access granted"
    } else {
      System.out.println("Access granted - You are old enough!"); // return value
    }

  }

  public static void main(String[] args) {
    checkAge(20); // Call the checkAge method and pass along an age of 20
  }
}

// Outputs "Access granted - You are old enough!"

         */

        //? method overloading:
        // instead of two or more methods that should do the same thing, overload one.
        /*
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

// we overload the plusMethod method to work for both int and double:
static int plusMethod(int x, int y) {
  return x + y;
}

static double plusMethod(double x, double y) {
  return x + y;
} // use one method for the same method process

public static void main(String[] args) {
  int myNum1 = plusMethod(8, 5);
  double myNum2 = plusMethod(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}
         */

        //? method overriding:
        // It is performed in two classes with inheritance relationships.
        /*
        import java.io.*;

// Base Class
class Animal {
    void eat() {
        System.out.println("eat() method of base class");
        System.out.println("Animal is eating.");
    }
}

// Derived Class
class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("eat() method of derived class");
        System.out.println("Dog is eating.");
    }

    // Method to call the base class method
    void eatAsAnimal() {
        super.eat();
    }
}

// Driver Class
class MethodOverridingEx {
    // Main Function
    public static void main(String args[]) {
        Dog d1 = new Dog();
        Animal a1 = new Animal();

        // Calls the eat() method of Dog class
        d1.eat();
        // Calls the eat() method of Animal class
        a1.eat();

        // Polymorphism: Animal reference pointing to Dog object
        Animal animal = new Dog();

        // Calls the eat() method of Dog class
        animal.eat();

        // To call the base class method, you need to use a Dog reference
        ((Dog) animal).eatAsAnimal();
    }
}

         */

        //* scope:
        /*
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
         */
        //? create an object of MyClass called myObj
        // MyClass myObj = new MyClass();

        //? use myObj to access and print the value of the x attribute of MyClass
        /*
        public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
   System.out.println(
myObj.x);
  }
}
         */

        //? call myMethod on the object
        /*
        public class MyClass {
  public void myMethod() {
    System.out.println("Hello World");
  }

  public static void main(String[] args) {
    MyClass myObj = new MyClass();

myObj.myMethod();
  }
}
         */

        //? Create and call a class constructor of MyClass
        /*
        // Create a MyClass class
public class MyClass{
  int x;  // Create a class attribute x

  // Create a class constructor for the MyClass class
  public MyClass() {
    x = 5;  // Set the initial value for the class attribute x to 5
  }

  public static void main(String[] args) {
    // Create an myObj object of class MyClass (This will call the constructor)
    MyClass
myObj = new MyClass();
    // Print the value of x
    System.out.println(myObj.x);
  }
}
         */

        //? The class below should not be inherited by other classes. The correct modifier:
        // final class MyClass

        //? import the java.util.Scanner class from the Java API:
        // import java.util.Scanner;

        //? The Car class should inherit the attributes and methods from the Vehicle class:
        // class Car extends Vehicle

    }
}