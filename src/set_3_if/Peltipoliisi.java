package set_3_if;

import java.util.Scanner;

public class Peltipoliisi {
	public static void main(String[] args) {
		try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Anna nopeutesi: ");
            double a = scanneri.nextDouble();
            double c = 0;
            java.text.DecimalFormat desi = new java.text.DecimalFormat("0.00");
            if (a > 100) {
            	System.out.println("P�iv�sakko");
            	System.out.print("Anna nettokuukausitulosi: ");
            	double b = scanneri.nextDouble();
            	c = (b-255)/60;
            	if (c < 6) {
            		c = 6;
            	}
            	System.out.println("P�iv�sakon m��r� on " + desi.format(c) + " euroa");
            } else if (a > 80) {
            	System.out.println("Rikesakko");
            } else {
            	System.out.println("Ei sakkoja");
            }
        }
	}
}