package ebal1_2UNITATEA;
import java.util.Scanner;

public class BATUZBK_F {
    // 2.26 Ariketa
    public static void main(String[] args) {
        int zenbakia;
        
        System.out.print("Idatzi zenbaki bat: ");
        
        Scanner teklatua = new Scanner(System.in);
        zenbakia = teklatua.nextInt();
        teklatua.close();
        
        int gehiketa = 0; // Inicializamos la variable de suma
        
        // Bucle for que resta desde el n�mero ingresado hasta 0
        for (int i = zenbakia; i >= 0; i--) {
            gehiketa = gehiketa + i;
            System.out.println("Gehiketa: " + gehiketa);
        }
        
        // Mostrar el resultado final
        System.out.println("Zenbakien batura 0-tik " + zenbakia + "-ra: " + gehiketa);
    }
}
