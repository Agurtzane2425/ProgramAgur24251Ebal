package ebal1;

import java.util.Scanner;

public class BATUZNBK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zenbakia;
        do {
            System.out.print("Sartu zenbaki bat: ");
            zenbakia = scanner.nextInt();

            if (zenbakia < 0) {
                //Etxeko adarra atalean txertatuko du iruzkina.
            	System.out.println("Zenbaki negatiboa sartu duzu. Mesedez, sartu zenbaki positibo bat.");
            }
        } while (zenbakia < 0);
        scanner.close();
        int batura = 0;
        int i = 0;
        
        for (i = 0; i <= zenbakia; i++) {
            batura += i;
        }
        //EtxekoAdarra
        System.out.println("Zenbakien batura: " + batura);        
    }
}
