package set_3_if;

import java.util.Scanner;

public class Ylinopeus {
	public static void main(String[] args) {
		try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Kerro nopeus: ");
            double km = scanneri.nextDouble();
            if (km > 120) {
            	System.out.println("Ylinopeussakko!");
            }
        }
	}
}
