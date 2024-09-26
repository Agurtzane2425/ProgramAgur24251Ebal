package ebal1;
import java.util.Scanner;

public class Bisurtea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Urtea eskatu
        System.out.print("Sartu urtea: ");
        int urtea = scanner.nextInt();

        // Bisurtea den ala ez egiaztatu
        if (urtea % 4 == 0) {
            if (urtea % 100 == 0) {
                if (urtea % 400 == 0) {
                    System.out.println(urtea + " bisurtea da.");
                } else {
                    System.out.println(urtea + " ez da bisurtea.");
                }
            } else {
                System.out.println(urtea + " bisurtea da.");
            }
        } else {
            System.out.println(urtea + " ez da bisurtea.");
        }

        // Scanner itxi
        scanner.close();
    }
}
