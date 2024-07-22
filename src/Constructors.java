public class Constructors {
    int x;  // Create a class attribute
    int modelYear;
    String modelName;
    // Create a class constructor for the Main class
    public Constructors() {
        x = 5;  // Set the initial value for the class attribute x
    }
    public Constructors(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Constructors myObj = new Constructors(); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x
        Constructors myCar = new Constructors(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}

//* special method that is used to initialize objects. called when an object of a class is created.
//* it can be used to set initial values for object attributes
//! Note that the constructor name must match the class name, and it cannot have a return type (like void).
//! Also note that the constructor is called when the object is created.
//! All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.