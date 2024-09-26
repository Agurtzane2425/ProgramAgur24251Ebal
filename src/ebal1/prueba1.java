package ebal1;

import java.util.Scanner;

public class prueba1 {

	public static void main(String[] args) {
System.out.println("Sartu letra bat: ");
Scanner scanner = new Scanner(System.in);
int letra = scanner.next().charAt(0);
System.out.printf("Sartutako letra hau da: %c", letra);
scanner.close();
	}

}
