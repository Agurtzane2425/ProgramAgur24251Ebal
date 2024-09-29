package ebal1_1UNITATEA;

import java.util.Scanner;
//1.30 Ariketa
public class Osohamartarra {

	public static void main(String[] args) {
		double a;
		System.out.print("Zenbaki oso bat idatzi: ");
		Scanner teklatua = new Scanner(System.in);
		a = teklatua.nextDouble();
		
		System.out.println("Zati osoa: " + (int) a);
		System.out.println("Zati hamartarra: " + (a - (int) a) );
	
		teklatua.close();
	}

}
