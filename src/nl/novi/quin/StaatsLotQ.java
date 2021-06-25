package nl.novi.quin;
import java.util.Scanner;

public class StaatsLotQ {
    public static void main(String[] args) {
        Scanner eindCijferInput = new Scanner(System.in);

        System.out.println("Wat zijn de 3 eindcijfers op uw lot?");
        int drieEindCijfers = eindCijferInput.nextInt();

        if (drieEindCijfers < 100) {
            System.out.println("Niet genoeg cijfers");
        } else if (drieEindCijfers > 999) {
            System.out.println("Te veel cijfers");
        } else if (drieEindCijfers == 666) {
            System.out.println("Uw heeft gewonnen!!!");
        } else {
            System.out.println("Zoek een baan!!!");
        }
    }
}