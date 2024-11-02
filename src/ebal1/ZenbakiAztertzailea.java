package ebal1;

import java.util.Scanner;

public class ZenbakiAztertzailea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int znbk_1, emaitza, aukera;
        boolean lehena;
        
        do {
            // Menua erakutsi
            System.out.println("1. Handiena");
            System.out.println("2. Batuketa");
            System.out.println("3. Lehen kopurua");
            System.out.println("0. Irten");
            System.out.print("Aukeratu eragiketa: ");
            aukera = scanner.nextInt();
            
            switch (aukera) {
                case 1:
                    emaitza = 0;
                    do {
                        System.out.print("Sartu zenbaki bat 0 baino handiagoa: ");
                        znbk_1 = scanner.nextInt();
                        if (znbk_1 > emaitza) {
                            emaitza = znbk_1;
                        }
                    } while (znbk_1 > 0);
                    System.out.println("Sartutako zenbaki handiena: " + emaitza + " da");
                    break;
                    
                case 2:
                    // Batuketa
                    emaitza = 0;
                    do {
                        System.out.print("Sartu zenbaki bat 0 baino handiagoa: ");
                        znbk_1 = scanner.nextInt();
                        if (znbk_1 > 0) {
                            emaitza += znbk_1;
                        }
                    } while (znbk_1 > 0);
                    System.out.println("Sartutako zenbakien batura: " + emaitza + " da");
                    break;
                    
                case 3:
                    // Lehen kopurua
                    emaitza = 0;
                    do {
                        lehena = true;
                        System.out.print("Sartu zenbaki bat 2 edo 2 baino handiagoa: ");
                        znbk_1 = scanner.nextInt();
                        
                        if (znbk_1 >= 2) {
                            for (int i = 2; i <= znbk_1 - 1; i++) {
                                if (znbk_1 % i == 0) {
                                    lehena = false;
                                    break;
                                }
                            }
                            System.out.println("Lehen da? " + lehena);
                            if (lehena) {
                                emaitza++;
                            }
                            System.out.println("Orain arteko lehen zenbakien kopurua: " + emaitza);
                        } else {
                            System.out.println("1 zenbakia 2 baino txikiagoa da.");
                        }
                    } while (znbk_1 > 0);
                    System.out.println("Sartutako zenbakien artean " + emaitza + " zenbaki lehen daude");
                    break;
                    
                case 0:
                    System.out.println("Agur. Bukatu da.");
                    break;
                    
                default:
                    System.out.println("Aukera okerra");
                    break;
            }
            
        } while (aukera != 0);
        
        scanner.close();
    }
}
