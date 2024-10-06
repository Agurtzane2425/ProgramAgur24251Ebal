package ebal1_2UNITATEA;

import java.util.Scanner;

public class ERROMAZNBK {
	// unitate, hamarreko eta ehunekoak pasatu erromatarrera
	public static String erromatarUnitaterapasatu(int zenbakia, String bat, String bost, String hamar) {
		switch (zenbakia) {
		case 1:
			return bat;
		case 2:
			return bat + bat;
		case 3:
			return bat + bat + bat;
		case 4:
			return bat + bost;
		case 5:
			return bost;
		case 6:
			return bost + bat;
		case 7:
			return bost + bat + bat;
		case 8:
			return bost + bat + bat + bat;
		case 9:
			return bat + hamar;
		default:
			return ""; // En caso de que sea 0
		}
	}
	// Zenbakia itzultzeko oinarrizko funtzioa
	public static String itzuliErromatarrera(int zenbakia) {
		if (zenbakia == 0) {
			return "No existe el 0 en los números romanos.";
		}
		if (zenbakia < 0 || zenbakia > 999) {
			return "Este programa solo acepta números entre 0 y 999.";
		}

		// zenbakia ehuneko hamarreko eta unitatean banatu.
		int ehuneko = zenbakia / 100;
		int hamarreko = (zenbakia % 100) / 10;
		int unitate = zenbakia % 10;

		// Unitate hamarreko eta ehunekoak erromatarrena pasatu.
		String erroma = "";

		// Ehuneko
		erroma += erromatarUnitaterapasatu(ehuneko, "C", "D", ""); // C = 100, D = 500 (no necesitamos "M")

		// Hamarreko
		erroma += erromatarUnitaterapasatu(hamarreko, "X", "L", "C"); // X = 10, L = 50, C = 100

		// Unitate
		erroma += erromatarUnitaterapasatu(unitate, "I", "V", "X"); // I = 1, V = 5, X = 10

		return erroma;
	}
	// Programaren hasiera
	public static void main(String[] args) {
		Scanner teklatua = new Scanner(System.in);
		// Bezeroari eskatu zenbakia sar dezan
		System.out.print("Sartu zenbaki bat 0 eta 999 bitartekoa: ");
		int zenbakia = teklatua.nextInt();

		// Zenbakia itzuli zenbait metodo erabiliz eta pantailatik inprimatu emaitza
		String emaitza = itzuliErromatarrera(zenbakia);
		System.out.println("Zenbaki hau " + zenbakia + " erromatar erara: " + emaitza);
		teklatua.close();
	}

}
