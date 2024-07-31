import java.util.Scanner;

public class CalculateAreaAndVolumeOfCircle {
    /*
yarıçap : r,
pi : 3.14
 */
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        double area, volume;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        r = input.nextInt();
        area = pi * 2 * r;
        System.out.println("The area of the circle is " + area);

        volume = pi * Math.pow(r, 2);
        System.out.println("The volume of the circle is " + volume);

    }
}
