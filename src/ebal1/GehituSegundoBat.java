package ebal1;

import java.util.Scanner;

public class GehituSegundoBat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ordua irakurri
        System.out.print("Sartu ordua (0-23): ");
        int ordu = scanner.nextInt();

        // Minutuak irakurri
        System.out.print("Sartu minutuak (0-59): ");
        int minutu = scanner.nextInt();

        // Segundoak irakurri
        System.out.print("Sartu segundoak (0-59): ");
        int segundo = scanner.nextInt();

        // Segundo bat gehitu
        segundo++;

        // Balidazioa: 60 segundo gainditzen bada, minutu bat gehitu eta segundoak "0" jarri
        if (segundo >= 60) {
            segundo = 0;
            minutu++;
        }

        // Balidazioa: 60 minutu gainditzen bada, ordu bat gehitu eta minutuak "0" jarri
        if (minutu >= 60) {
            minutu = 0;
            ordu++;
        }

        // Balidazioa: 24 ordu gainditzen bada, orduak "0" bihurtu
        if (ordu >= 24) {
            ordu = 0;
        }

        // Emaitza inprimatu
        System.out.println("Hurrengo segundoan: " + ordu + " ordu " + minutu + " minutu " + segundo + " segundo");

        scanner.close();
    }
}
