package set_6_loops;

import java.util.Scanner;

public class Luottolaskuri {
    public static void main(String[] args) {
        try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Anna luotollisen ostoksen hinta: ");
            double a = scanneri.nextDouble();
            System.out.print("Anna kuukausierien lukumäärä: ");
            int b = scanneri.nextInt();
            double c = a/b;
            double d = a;
            b++;
            java.text.DecimalFormat desi = new java.text.DecimalFormat("0.00");
            for (int i = 1; i < b; i++) {
                d -= c;
                System.out.println(i + ". erä " + desi.format(c) + 
                " euroa, luottoa jäljellä " + desi.format(d) + " euroa");
            }
        }
    }
}