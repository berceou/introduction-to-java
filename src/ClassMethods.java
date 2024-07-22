public class ClassMethods {
    static void myMethod() {
        System.out.println("My Method");
    }

    //? Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    //? Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        myMethod();
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        ClassMethods myObj = new ClassMethods(); // Create an object of ClassMethods
        myObj.myPublicMethod(); // Call the public method on the object
    }
}

//* Static vs Public:
// static method which means that it can be accessed without creating an pbject of class
// public which can only be accessed by objects:
