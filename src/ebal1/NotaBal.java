package ebal1;
import java.util.Scanner;

public class NotaBal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nota eskatu
        System.out.print("Sartu nota: ");
        double nota = scanner.nextDouble();

        // Nota balidatu
        if (nota >= 0 && nota <= 10) {
            System.out.println("Nota zuzena da.");
        } else {
            System.out.println("Errorea: Nota ez da zuzena.");
        }

        // Scanner itxi
        scanner.close();
    }
}
