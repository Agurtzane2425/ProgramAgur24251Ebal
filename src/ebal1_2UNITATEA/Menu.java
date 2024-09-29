package ebal1_2UNITATEA;

import java.util.Scanner;
public class Menu {
//2.11 Ariketa 
	public static void main(String[] args) {
		int zenbaki1, zenbaki2, aukera;
		
		Scanner teklatua = new Scanner(System.in);
		
		System.out.print("Sartu zenbaki bat: ");
		zenbaki1 = teklatua.nextInt();

		System.out.print("Sartu bigarren zenbaki bat: ");
		zenbaki2 = teklatua.nextInt();
		
		System.out.println("1. Batu");
		System.out.println("2. Kendu");
		System.out.println("3. Biderkatu");
		System.out.println("4. Zatitu");
		System.out.println("5. Ondarra (%)");
		System.out.println("0. Irten");
		
		System.out.print("Aukera bat aukeratu: ");
		aukera = teklatua.nextInt();
		
		teklatua.close();
		
		switch (aukera) {
			case 1:
				System.out.println("Bi zenbakien batuketa " + (zenbaki1 + zenbaki2) + " da");
				break;
			case 2:
				System.out.println(zenbaki1 + " ken " + zenbaki2 +  " = " + (zenbaki1 - zenbaki2) + " da");
				break;
			case 3:
				System.out.println(zenbaki1 + " bider " + zenbaki2 + " = " + (zenbaki1 * zenbaki2) + " da");
				break;
			case 4:
				if (zenbaki2 !=0 ) {
				System.out.println(zenbaki1 + " zati " + zenbaki2 + " = " + (zenbaki1 / zenbaki2) + " da");
				}
				else {
					System.out.println("Ezin da 0 zatitu");
				}
				break;
			case 5:
				if (zenbaki2 != 0) {
				System.out.println( zenbaki1 + " zenbakia eta " + zenbaki2 + " zenbakia zatitzearen ondoriozko hondarra " 
				+ (zenbaki1 % zenbaki2) + " da");
				}
				else {
				System.out.println("Ezin da hondarra kalkulatu");
				}
				break;
			case 0:
				System.out.println("Agur!");
				break;
			default:
				System.out.println("Aukera ezezaguna");
		}
	}

}
