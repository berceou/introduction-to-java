public class Override {
    int x = 10;

    public static void main(String[] args) {
        Override myObj = new Override();
        myObj.x = 25; // x is now 25
        System.out.println(myObj.x);
    }
}
//! The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).
