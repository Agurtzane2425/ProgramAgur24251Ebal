package ebal1;

import java.util.Scanner;

public class aurkeztuznbkw {

	public static void main(String[] args) {
		System.out.println("Sartu zenbaki bat seguida egiteko:");
		Scanner scanner = new Scanner(System.in);
		int zenbakia = scanner.nextInt();
		int i = 1;
		while (i <= zenbakia ) {
			System.out.println(i);
			i++;
		}
		scanner.close();
	}

}
