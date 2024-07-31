import java.util.Scanner;

public class CalculateKDV {
    /*
    -> kdv hesabı için;
    ürün maliyeti
    kdv oranı
    kdv bulup gerçek ödenen fiyatı yansıtmak gerekir
     */
    public static void main(String[] args) {
        double amount , amountWithTax;
        double taxRate = 0.18;
        Scanner input = new Scanner(System.in);

        System.out.println("Ürün tutarını girin:");
        amount = input.nextDouble();
        amountWithTax = amount + (taxRate * amount);
        System.out.println("Ürünün KDVli Tutarı: " + amountWithTax);
    }

}

