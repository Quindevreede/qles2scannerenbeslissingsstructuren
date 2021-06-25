package nl.novi.quin;
import java.util.Scanner;

public class KortingQ {
    public static void main(String[] args) {
        Scanner amountInput = new Scanner(System.in);

        System.out.println("Input your PURCHASE AMOUNT :");
        double finalPrice = amountInput.nextInt();

        String discount;

        if (finalPrice >= 100.01) {
            discount = " 20 % ";
            finalPrice = finalPrice - (finalPrice * 0.20);
        } else if (finalPrice >= 50.01) {
            discount = " 10 % ";
            finalPrice = finalPrice - (finalPrice * 0.10);
        } else {
            discount = "0";
        }

        System.out.println("The costumer receives " + discount + " discount. The final price is : " + finalPrice);
    }
}