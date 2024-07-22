//* An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:
// Code from filename: Abstract1.java
// abstract class
abstract class Abstract1 {
    public String name = "John";
    public int age = 24;
    public abstract void study(); // abstract method
}

// Subclass (inherit from Abstract1)
class Student extends Abstract1 {
    public int graduationYear = 2018;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
// End code from filename: Abstract1.java
