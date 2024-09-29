package ebal1_1UNITATEA;

import java.util.Scanner;
//1.14 Ariketa
public class Agertukarakterea {

	public static void main(String[] args) {
		char a;
		System.out.print("Idatzi karaktere bat: ");
		Scanner teklatua = new Scanner(System.in);
		a = teklatua.next().charAt(0);
		System.out.println("Zure karakterea " + a + " da");
		teklatua.close();
	}

}
