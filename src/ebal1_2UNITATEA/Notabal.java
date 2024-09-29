package ebal1_2UNITATEA;

import java.util.Scanner;
public class Notabal {
//2.12
	public static void main(String[] args) {
		double nota;
		
		Scanner teklatua = new Scanner(System.in);

		System.out.print("Sartu nota bat: ");
		nota = teklatua.nextDouble();
		teklatua.close();
		
		if (nota >= 0 && nota <= 10) {
			System.out.println(nota + " nota zuzena da");
	}
		else {
		System.out.println(nota + " nota ez da zuzena");
	}

	}

}
