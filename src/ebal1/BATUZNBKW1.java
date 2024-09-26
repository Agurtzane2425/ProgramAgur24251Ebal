package ebal1;

import java.util.Scanner;

public class BATUZNBKW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sartu zenbaki bat: ");
        int zenbakia = scanner.nextInt();
        scanner.close();
        int batura = 0;
        int i = 0;
        
        for (i = 0; i <= zenbakia; i++) {
            batura += i;
        }
        
        System.out.println("Zenbakien batura: " + batura);
        
        
    }
}
