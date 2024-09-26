package ebal1;
import java.util.Scanner;

public class Gauzak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gauzaren kodea eskatu
        System.out.print("Sartu gauzaren kodea: ");
        String kodea = scanner.nextLine();

        // Kopurua eskatu
        System.out.print("Sartu kopurua: ");
        int kopurua = scanner.nextInt();

        // Alearen prezioa eskatu
        System.out.print("Sartu alearen prezioa: ");
        double prezioa = scanner.nextDouble();

        // Beherapena kalkulatu
        double beherapena = 0;

        if (kopurua > 100) {
            beherapena = 0.40; // %40
        } else if (kopurua > 25 && kopurua <= 100) {
            beherapena = 0.20; // %20
        } else if (kopurua > 10 && kopurua <= 25) {
            beherapena = 0.10; // %10
        } else {
            beherapena = 0.00; // %0
        }

        // Prezio totala kalkulatu
        double prezioTotala = kopurua * prezioa;
        double beherapenZehaztua = prezioTotala * beherapena;
        double azkenPrezioa = prezioTotala - beherapenZehaztua;

        // Emaitza inprimatu
        System.out.println("Kodea: " + kodea);
        System.out.println("Beherapena: " + (beherapena * 100) + "%");
        System.out.println("Prezio totala beherapenarekin: " + azkenPrezioa + " €");

        scanner.close();
    }
}
