package set_2_basics;

import java.util.Scanner;

public class Matka {
	public static void main(String[] args) {
		try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Anna matka: ");
            int km = scanneri.nextInt();
            System.out.print("Anna nopeus: ");
            int kmh = scanneri.nextInt();
            double result = (double) km /kmh;
            java.text.DecimalFormat desi = new java.text.DecimalFormat("0.00");
            System.out.println("Aikaa menee " + desi.format(result) + " tuntia");
        }
	}
}