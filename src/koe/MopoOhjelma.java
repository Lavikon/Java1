package koe;

import java.util.Scanner;

public class MopoOhjelma {
	public static void main(String[] args) {
		try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Kuinka monta vuotta vanha henkilö on:");
            double a = scanneri.nextDouble();
            if (a < 17) {
            	System.out.println("Ikä ei vielä riitä mopokorttiin.");
            } else {
                System.out.println("Henkilö voi saada mopokortin.");

            }
        }
	}
}