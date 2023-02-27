package set_4_if;

import java.util.Scanner;

public class Pizza {
	public static void main(String[] args) {
		try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Anna pizzojen hinnat (3): ");
            double a = scanneri.nextDouble();
            double b = scanneri.nextDouble();
            double c = scanneri.nextDouble();
            double d = 0;
            if ( a < b && a < c) {
            	d = b + c;
            } else if (b < c) {
            	d = a + c;
            } else {
            	d = a + b;
            }
            java.text.DecimalFormat desi = new java.text.DecimalFormat("0.00");
            System.out.println("Maksettavaa: " + desi.format(d));
            double e = d / 3;
            System.out.println("Yksittäisen hinta: " + desi.format(e));
        }
	}
}