package ebal1_2UNITATEA;
import java.util.Scanner;

public class Menuagenuak {
//2.18 Ariketa
	public static void main(String[] args) {
		String karaktereak;
	
		Scanner teklatua = new Scanner (System.in);
		
		System.out.println("AS. Astelehena");
		System.out.println("AA. Asteartea");
		System.out.println("AZ. Azteazkena");
		System.out.println("OG. Osteguna");
		System.out.println("OL. Ostirala");
		System.out.println("LA. Larunbata");
		System.out.println("IG. Igandea");
		
		System.out.println("Idatzi bi karaktere: ");
		karaktereak = teklatua.nextLine();
		
		
		teklatua.close();
		
		switch (karaktereak) {
		case "AS":
			System.out.println("Astelehena");
			break;
		case "AA":
			System.out.println("Asteartea");
			break;
		case "AZ":
			System.out.println("Azteazkena");
			break;
		case "OG":
			System.out.println("Osteguna");
			break;
		case "OL":
			System.out.println("Ostirala");
			break;
		case "LA":
			System.out.println("Larunbata");
			break;
		case "IG":
			System.out.println("Igandea");
			break;
		}
	}

}
