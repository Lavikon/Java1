package set_10_methdos;

import java.util.Scanner;

public class Lahjavero {

    public static double laskeVero(double arvo) {
        double vero = 0.0;
        if (arvo < 5000) {
            vero = 0.0;
        } else if (arvo < 25000) {
            arvo -= 5000;
            vero = arvo * 0.08 + 100;
        } else if (arvo < 55000) {
            arvo -= 25000;
            vero = arvo * 0.1 + 1700;
        } else if (arvo < 200000) {
            arvo -= 55000;
            vero = arvo * 0.12 + 4700;
        } else if (arvo < 1000000) {
            arvo -= 200000;
            vero = arvo * 0.15 + 22100;
        } else {
            arvo -= 5000;
            vero = arvo * 0.17 + 142100;
        }
        return vero;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Anna lahjan suuruus: ");
            double a = scan.nextDouble();
            double b = Lahjavero.laskeVero(a);

            java.text.DecimalFormat desi = new java.text.DecimalFormat("0.00");
            System.out.println("Lahjavero on " + desi.format(b) + "euroa");
        }
    }
}