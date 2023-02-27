package set_6_loops;

import java.util.Scanner;

public class Kassakone {
    public static void main(String[] args) {
        try (Scanner scanneri = new Scanner(System.in)) {
            Double a = 1.0;
            Double b = 0.0;
            while (a != 0) {
                System.out.print("Anna ostoksen hinta (0 lopettaa): ");
                a = scanneri.nextDouble();
                b += a;
            }
            Double c = b*24/124;
            Double d = b-c;
            java.text.DecimalFormat desi = new java.text.DecimalFormat("0.00");
            System.out.println("Ostosten verollinen hinta on " + desi.format(b));
            System.out.println("ALV:n osuus on " + desi.format(c));
            System.out.println("Veroton hinta on " + desi.format(d));
        }
    }
}