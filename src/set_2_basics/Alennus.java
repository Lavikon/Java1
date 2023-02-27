package set_2_basics;

import java.util.Scanner;

public class Alennus {
	public static void main(String[] args) {
		try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Anna alentamaton hinta: ");
            double hinta = scanneri.nextDouble();
            System.out.print("Anna alennusprosentti: ");
            double ale = scanneri.nextDouble();
            double result = hinta - hinta * ale / 100;
            java.text.DecimalFormat desi = new java.text.DecimalFormat("0.00");
            System.out.println("Alennettu hinta on " + desi.format(result));
        }
	}
}
