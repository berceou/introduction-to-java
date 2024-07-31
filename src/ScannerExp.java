import java.util.Scanner;

public class ScannerExp {
    // scanner classını dahil adiyoruz. kullanıcıdan veri alıcam.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        double b;
        double b2;
        String c;
        float f;
        byte e;
        short s;

        System.out.println("Enter a number: ");
        a = input.nextInt();
        System.out.println("a: " + a);

        System.out.println("Enter double like 25.7: ");
         b = input.nextDouble();
        System.out.println("b: " + b);

        System.out.println("Enter another double like 25,7: ");
        b2 = input.nextDouble();
        System.out.println("b2: " + b2);
        // if use comma, u can get an error about formatting

        System.out.println("Enter string: ");
         c = input.next();
        System.out.println("c: " + c);

        System.out.println("Enter float: ");
         f = input.nextFloat();
        System.out.println("f: " + f);

        System.out.println("Enter byte: ");
         e = input.nextByte();
        System.out.println("e: " + e);

        System.out.println("Enter short: ");
         s = input.nextShort();
        System.out.println("s: " + s);
        System.out.println("run program again");

    }
}
