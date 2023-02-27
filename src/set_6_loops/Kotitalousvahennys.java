package set_6_loops;

import java.util.Scanner;

public class Kotitalousvahennys {
    public static void main(String[] args) {
        try (Scanner scanneri = new Scanner(System.in)) {
            Double a = 1.0;
            Double b = 0.0;
            while (a != 0) {
                System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
                a = scanneri.nextDouble();
                b += a;
            }
            Double d = b*0.4 - 100;
            if (d<0) {
                d = 0.0;
            } else if (d > 2250) {
                d = 2250.0;
            }
            java.text.DecimalFormat desi = new java.text.DecimalFormat("0.00");
            System.out.println("Kotitalousvähennyksen määrä on " + desi.format(d) + " euroa");
        }
    }
}
