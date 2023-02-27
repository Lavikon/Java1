package set_2_basics;

import java.util.Scanner;

public class Kimppakyyti {
	public static void main(String[] args) {
		try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Anna ajetut kilometrit: ");
            double km = scanneri.nextDouble();
            System.out.print("Anna kulutus per 100 km: ");
            double kulutus = scanneri.nextDouble();
            System.out.print("Anna polttoaineen litrahinta: ");
            double hinta = scanneri.nextDouble();
            System.out.print("Anna kimppakyytil�isten lukum��r�: ");
            double henk = scanneri.nextDouble();
            double result = km / 100 * kulutus * hinta / henk;
            java.text.DecimalFormat desi = new java.text.DecimalFormat("0.00");
            System.out.println("Bensakustannus per henkil� on " + desi.format(result) + " euroa");
        }
	}
}