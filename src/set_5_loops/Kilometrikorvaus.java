package set_5_loops;

import java.util.Scanner;

public class Kilometrikorvaus {
    public static void main(String[] args) {
        try (Scanner scanneri = new Scanner(System.in)) {
            int i = 1;
            int a = 0;
            while (i != 0) {
                System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
                i = scanneri.nextInt();
                a += i;
            }
            System.out.println("Yhteensä " + a + " kilometriä");
            Double d = a*0.43;
            java.text.DecimalFormat desi = new java.text.DecimalFormat("0.00");
            System.out.println("Korvaus on " + desi.format(d) + " euroa");
        }
    }
}