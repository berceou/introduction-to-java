public class AccessMethodsWithObject {
    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    // Inside main, call the methods on the myCar object
    public static void main(String[] args) {
        AccessMethodsWithObject myCar = new AccessMethodsWithObject();   // Create a myCar object
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);          // Call the speed() method
    }
}
// The car is going as fast as it can!
// Max speed is: 200

//!: example explained:
/*
1. created a custom AccessMethodsWithObject class with the class keyword
2. created fullThrottle() and speed() methods in AccessMethodsWithObject class
3. methods print out some texts when they are called
4. speed method accepts an int param called maxSpeed
5. in order to use AccessMethodsWithObject class and its methods we need create an object of the AccessMethodsWithObject class.
6. then go to the AccessMethodsWithObject() method built-in java method that runs program -- any code inside main is executed --
7. by using the new keyword and created an object with name myCar
8. Then, we call the fullThrottle() and speed() methods on the myCar object, and run the program using the name of the object (myCar), followed by a dot (.), followed by the name of the method (fullThrottle(); and speed(200);). Notice that we add an int parameter of 200 inside the speed() method.
 */