package ebal1;

import java.util.ArrayList;
import java.util.List;

public class ZenbakiLehenak {

    public static List<Integer> aurkituLehenak(int n) {
        List<Integer> lehenak = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            if (lehenDa(i)) {
                lehenak.add(i);
            }
        }
        
        return lehenak;
    }

    public static boolean lehenDa(int zenbakia) {
        if (zenbakia < 2) return false;
        for (int i = 2; i <= Math.sqrt(zenbakia); i++) {
            if (zenbakia % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int muga = 50;
        List<Integer> lehenak = aurkituLehenak(muga);
        System.out.println("Lehen zenbakiak " + muga + " arte: " + lehenak);
    }
}