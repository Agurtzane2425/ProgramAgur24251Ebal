package ebal1_2UNITATEA;
import java.util.Scanner;
public class BatuznbkwFor {
	//2.26 Ariketa
	public static void main(String[] args) {
		int zenbakia;
		
		System.out.print("Idatzi zenbaki bat: ");
		
		Scanner teklatua = new Scanner(System.in);
		zenbakia = teklatua.nextInt();
		teklatua.close();
		// Arazoa izango da ezin duela for kanpoan impriatu azken emaitza for barnean definitu duelako gehiketa aldagaia.
		for (int gehiketa = 0; zenbakia >= 0; zenbakia--) {
			System.out.println(gehiketa);
			gehiketa = gehiketa + zenbakia;
		}
	}

}
