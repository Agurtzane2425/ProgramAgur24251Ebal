package ebal1_1UNITATEA;

import java.util.Scanner;
//1.26 Ariketa
public class Zirkuluzera {

	public static void main(String[] args) {
		double r;
		double pi = 3.1416;
		double luzera;
		
		System.out.print("Zirkunferentziaren erradioa idatzi: ");
		Scanner teklatua = new Scanner(System.in);
		r = teklatua.nextDouble();
		luzera = 2 * pi * r;
		System.out.print("Zirkuluaren luzera: " + luzera + " da");
		teklatua.close();
	}

}
