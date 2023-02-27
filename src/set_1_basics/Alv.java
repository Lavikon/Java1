package set_1_basics;

import java.util.Scanner;

public class Alv {
	public static void main(String[] args) {
		try (Scanner scanneri = new Scanner(System.in)) {
            double num = 0;
            double result = 0;
            java.text.DecimalFormat desi = new java.text.DecimalFormat("0.00");
            System.out.print("Anna 1. tuotteen hinta: ");
            num = scanneri.nextDouble();
            result = num / 1.14 * 0.14;
            System.out.println("Tuotteen 1 ALV on " + desi.format(result) + " euroa.");
            System.out.print("Anna 2. tuotteen hinta: ");
            num = scanneri.nextDouble();
            result = num / 1.14 * 0.14;
            System.out.println("Tuotteen 2 ALV on " + desi.format(result) + " euroa.");
            System.out.print("Anna 3. tuotteen hinta: ");
            num = scanneri.nextDouble();
            result = num / 1.14 * 0.14;
            System.out.println("Tuotteen 4 ALV on " + desi.format(result) + " euroa.");
        }
	}
}
