package ebal1_2UNITATEA;
import java.util.Scanner;
//2.8 Ariketa
public class Segundo {

	public static void main(String[] args) {
		int ordua, minutua, segundoa;
		
		System.out.print("Idatzi ezazu ordua: ");
		Scanner teklatua = new Scanner(System.in);
		ordua = teklatua.nextInt();
		
		System.out.print("Idatzi ezazu minutua: ");
		minutua = teklatua.nextInt();
		
		System.out.print("Idatzi ezazu segundoa: ");
		segundoa = teklatua.nextInt();
		teklatua.close();
		
		if (segundoa != 59) {
			System.out.println("Ordua: " + ordua);
		}
		else if (ordua!=00 && minutua == 59 && segundoa == 59) {
			System.out.println("Ordua: " + (ordua + 1));
		}
		else if (ordua == 00 && minutua == 59 && segundoa == 59) {
			System.out.println("Ordua: 1");
		}
		else if (ordua == 23 && minutua == 59 && segundoa == 59) {
			System.out.println("Ordua: 00");
		}
		else if (ordua>23) {
			System.out.println("Ordua ez da zuzena");
		}
		
		if (segundoa != 59) {
			System.out.println("Minutua: " + minutua);
		}
		if (minutua !=59 && segundoa == 59) {
			System.out.println("Minutua: " + (minutua+1));
		}
		else if (minutua == 59 && segundoa == 59) {
			System.out.println("Minutua: 00");
		}
		else if (minutua>59) {
			System.out.print("Minutua ez da zuzena");
		}
		if (segundoa == 59) {
			System.out.println("Segundua: 00" );
		}
		else if (segundoa !=59) {
			System.out.println("Segundua: " + (segundoa + 1) );
		}
		else if (segundoa>59) {
			System.out.print("Segundoa ez da zuzena");
		}
}
}