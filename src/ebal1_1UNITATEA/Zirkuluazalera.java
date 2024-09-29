package ebal1_1UNITATEA;

import java.util.Scanner;
//1.27 Ariketa
public class Zirkuluazalera {

	public static void main(String[] args) {
		double r;
		double pi = 3.1416;
		double azalera;
		
		System.out.print("Idatzi zenbakiaren erradioa: ");
		Scanner teklatua = new Scanner(System.in);
		r = teklatua.nextDouble();
		azalera = pi * r * r;
		System.out.print("Zirkuluaren azalera: " + azalera + " da");
		teklatua.close();
		
	//Math.PI
	//	Math.pow(r, 2)
	}

}
