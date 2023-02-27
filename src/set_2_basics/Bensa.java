package set_2_basics;

import java.util.Scanner;

public class Bensa {
	public static void main(String[] args) {
		try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Anna tankattu m��r�: ");
            double litra = scanneri.nextDouble();
            System.out.print("Anna ajetut kilometrit: ");
            double km = scanneri.nextDouble();
            System.out.print("Anna litrahinta: ");
            double hinta = scanneri.nextDouble();
            double result = litra / km * hinta;
            java.text.DecimalFormat desi = new java.text.DecimalFormat("0.00");
            System.out.println("Ajo per kilometri maksaa " + desi.format(result));
        }
	}
}