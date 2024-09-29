package ebal1_1UNITATEA;

import java.util.Scanner;
//1.19 Ariketa
public class IrakurriKarakterea {

	public static void main(String[] args) {
		char a;
		
		System.out.print("Idatzi karaktere bat: ");
		Scanner teklatua = new Scanner(System.in);
		a = teklatua.next().charAt(0);
		System.out.printf("Aldagaiaren balioa %c da", a);
		teklatua.close();
	}

}
