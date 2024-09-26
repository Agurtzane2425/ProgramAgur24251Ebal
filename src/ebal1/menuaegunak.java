package ebal1;
import java.util.Scanner;

public class menuaegunak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("AL, AA , AZ, OG, OL, LA, IG");
        // Eskatu bi karaktere
        System.out.print("Sartu hauetako bi karaktere: ");
       String esternocleidomastoideo = scanner.nextLine().toUpperCase();

        // Eguna aukeratu karaktereak kontuan hartuta
        switch (esternocleidomastoideo) {
            case "AL":
                System.out.println("Astelehena");
                break;
            case "AA":
                System.out.println("Asteartea");
                break;
            case "AZ":
                System.out.println("Asteazkena");
                break;
            case "0G":
                System.out.println("Osteguna");
                break;
            case "OL":
                System.out.println("Ostirala");
                break;
            case "LA":
                System.out.println("Larunbata");
                break;
            case "IG":
                System.out.println("Igandea");
                break;
            default:
                System.out.println("Errorea: Karaktereak ez dira onargarriak.");
        }

        scanner.close();
    }
}
