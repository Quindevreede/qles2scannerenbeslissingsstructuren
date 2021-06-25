package nl.novi.quin;
import java.util.Scanner;

public class LeeftijdsControleQ {
    public static void main(String[] args) {
        Scanner userAgeInput = new Scanner(System.in);

        System.out.println("Verify your DATE OF BIRTH:");
        int dateOfBirth = userAgeInput.nextInt();

        if (dateOfBirth < 1983) {
            System.out.println("You're TOO OLD");
        } else if (dateOfBirth == 1983) {
            System.out.println("You're just THE RIGHT AGE!!!");
        } else {
            System.out.println("You're TOO YOUNG");
        }
    }
}
