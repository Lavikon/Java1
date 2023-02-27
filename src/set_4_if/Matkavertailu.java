package set_4_if;

import java.util.Scanner;

public class Matkavertailu {
    public static void main(String[] args) {
		try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Montako matkaa teet kuukaudessa: ");
            double a = scanneri.nextDouble();
            System.out.print("Anna yksittäisen lipun hinta: ");
            double b = scanneri.nextDouble();
            System.out.print("Anna kuukausilipun hinta: ");
            double c = scanneri.nextDouble();
            double d = a*b;
            double e = 0;
            java.text.DecimalFormat desi = new java.text.DecimalFormat("0.00");
            if (c < d) {
                e = d-c;
                System.out.print("Kuukausilippu on " + desi.format(e) + "euroa halvempi kuin yksittäinen");
            } else {
                e = c-d;
                System.out.print("Yksittäinen on " + desi.format(e) + "euroa halvempi kuin kuukausilippu");
            }
        }
    }
}