package ebal1_2UNITATEA;
import java.util.Scanner;
public class Handi3znbk {
//2.15 Ariketa
	public static void main(String[] args) {
		int zenbaki1, zenbaki2, zenbaki3;
		
		System.out.print("Sartu lehenengo zenbakia: ");
		Scanner teklatua = new Scanner(System.in);
		zenbaki1 = teklatua.nextInt();
		
		System.out.print("Sartu bigarren zenbakia: ");
		zenbaki2 = teklatua.nextInt();
		
		System.out.print("Sartu hirugarren zenbakia: ");
		zenbaki3 = teklatua.nextInt();
		teklatua.close();
		
		if (zenbaki1 > zenbaki2 && zenbaki1 > zenbaki3) {
			System.out.println(zenbaki1 + " zenbaki handiena da");
		}
		else if (zenbaki2 > zenbaki1 && zenbaki2 > zenbaki3) {
			System.out.println(zenbaki2 + " zenbaki handiena da");
		}
		else {
			System.out.println(zenbaki3 + " zenbaki handiena da");
		}
	}

}
