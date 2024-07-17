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

        //* convert value of txt to upper case (similar toLowerCase())
        String txt2 = "Hello";
        System.out.println(txt2.toUpperCase());

        //* use concatenate 2 strings:
        String firstName2 = "firstName2";
        String lastName2 = "lastName2";
        System.out.println(firstName2.concat(lastName2));

        //* index of the first occurrence of "e":
        String txt3 = "hello everybody";
        System.out.println(txt3.indexOf("e"));

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
    }
}