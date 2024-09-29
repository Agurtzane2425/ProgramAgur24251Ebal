package ebal1_1UNITATEA;

import java.util.Scanner;
//1.15 Ariketa
public class Agertukatea {

	public static void main(String[] args) {
		String a;
		
		System.out.println("Idatzi textu bat: ");
		Scanner teklatua = new Scanner(System.in);
		a = teklatua.nextLine();
		System.out.println("Zure textua: " + a + " da");
		teklatua.close();
	}

}
