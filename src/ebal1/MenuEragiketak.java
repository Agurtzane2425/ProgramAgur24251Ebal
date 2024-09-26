package ebal1;
import java.util.Scanner;

public class MenuEragiketak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aukera;

        do {
            // Bi zenbakiak eskatu
            System.out.print("Sartu lehen zenbakia: ");
            double zenbaki1 = scanner.nextDouble();

            System.out.print("Sartu bigarren zenbakia: ");
            double zenbaki2 = scanner.nextDouble();

            // Menua erakutsi
            System.out.println("Aukeratu eragiketa:");
            System.out.println("1. Batu");
            System.out.println("2. Kendu");
            System.out.println("3. Biderkatu");
            System.out.println("4. Zatitu");
            System.out.println("5. Ondarra");
            System.out.println("0. Irten");
            System.out.print("Aukera: ");
            aukera = scanner.nextInt();

            // Aukeraren arabera eragiketa egin
            switch (aukera) {
                case 1:
                    System.out.println("Emaitza (Batuketa): " + (zenbaki1 + zenbaki2));
                    break;
                case 2:
                    System.out.println("Emaitza (Kenketa): " + (zenbaki1 - zenbaki2));
                    break;
                case 3:
                    System.out.println("Emaitza (Biderketa): " + (zenbaki1 * zenbaki2));
                    break;
                case 4:
                    if (zenbaki2 != 0) {
                        System.out.println("Emaitza (Zatiketa): " + (zenbaki1 / zenbaki2));
                    } else {
                        System.out.println("Errorea: Zatiketa ezin da egin zero zatitzailearekin.");
                    }
                    break;
                case 5:
                    if (zenbaki2 != 0) {
                        System.out.println("Emaitza (Ondarra): " + (zenbaki1 % zenbaki2));
                    } else {
                        System.out.println("Errorea: Ondarra ezin da kalkulatu zero zatitzailearekin.");
                    }
                    break;
                case 0:
                    System.out.println("Programa amaitzen...");
                    break;
                default:
                    System.out.println("Aukera ez da baliogarria. Saiatu berriro.");
                    break;
            }
        } while (aukera != 0);

        scanner.close();
    }
}
