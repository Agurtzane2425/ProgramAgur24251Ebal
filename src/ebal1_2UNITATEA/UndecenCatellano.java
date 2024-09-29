package ebal1_2UNITATEA;

import java.util.Scanner;

public class UndecenCatellano {
//Ejercicio 16 de castellano pdf 
	public static void main(String[] args) {
		int numero;
		Scanner teklatua = new Scanner(System.in);
	
		
		System.out.print("Introduce una cantidad: ");
		numero = teklatua.nextInt();
		teklatua.close();
		
		if (numero % 100 != 0) {
			System.out.println("Centenas : " + numero / 100);
			numero = numero % 100;
		}
		if (numero % 10 != 0) {
			System.out.println("Decenas: " + numero / 10);
			numero = numero % 10;
		}
		if (numero != 0) {
			System.out.println("Unidades: " + numero );
		}
	}

}
