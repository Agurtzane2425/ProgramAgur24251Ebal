package ebal1_2UNITATEA;

import java.util.Scanner;

public class Bakbik {

	public static void main(String[] args) {
				int a;
				
			System.out.print("Idatzi zenbaki bat: ");
			Scanner teklatua = new Scanner(System.in);
			a= teklatua.nextInt();
			teklatua.close();
				
				if ( a % 2 == 0) {
					System.out.println(a + " zenbakia bikoitia da");
					}
				else {
						System.out.println(a + " zenbakia bakoitia da");

		}

	}

}
