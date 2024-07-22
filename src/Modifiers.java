public class Modifiers {
    //* exp of "final"
    final int x = 10;
    final double PI = 3.14;

    //* exp of "static"  s "public"
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    //* exp of abstract


    public static void main (String[] args) {
        Modifiers myObj = new Modifiers();
      //!  myObj.x = 50; // will generate an error: cannot assign a value to a final variable
      //!  myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);
        System.out.println(myObj.PI);
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would output an error

        Modifiers myObj2 = new Modifiers(); // Create an object of Main
        myObj2.myPublicMethod(); // Call the public method
    }
}
