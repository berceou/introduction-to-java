public class MultipleAttributes {
    String name = "John";
    String surname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        MultipleAttributes myObj = new MultipleAttributes();
        System.out.println("Name: " + myObj.name + " " + myObj.surname);
        System.out.println("Age: " + myObj.age);
    }
}
