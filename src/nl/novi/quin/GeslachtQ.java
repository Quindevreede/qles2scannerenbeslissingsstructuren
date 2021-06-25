package nl.novi.quin;
import java.util.Scanner;

public class GeslachtQ {
    public static void main(String[] args) {

        Scanner favouriteIndyMovie = new Scanner(System.in);

        System.out.println("Name your favourite INDIANA JONES and the... movie:");
        String indyTitleInput = favouriteIndyMovie.nextLine();

        if (indyTitleInput.equalsIgnoreCase("Raiders of the Last Ark")) {
            System.out.println("Don't look, Marion! Keep your eyes SHUT!");
        } else if (indyTitleInput.equalsIgnoreCase("Temple of Doom")) {
            System.out.println("Prepare to meet Kali... in Hell!");
        } else if (indyTitleInput.equalsIgnoreCase("Last Crusade")) {
            System.out.println("It belongs in a museum!");
        } else {
            System.out.println("INTO THE REFRIGERATOR!");
        }
    }
}
