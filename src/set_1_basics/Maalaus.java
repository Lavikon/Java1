package set_1_basics;

import java.util.Scanner;

public class Maalaus {
	public static void main(String[] args) {
	    try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Anna huoneen leveys, pituus ja korkeus: ");
            double leveys = scanneri.nextDouble();
            double pituus = scanneri.nextDouble();
            double korkeus = scanneri.nextDouble();
            System.out.print("Paljonko litralla saadaan maalattua neli�it�: ");
            double litralla = scanneri.nextDouble();
            double result = (leveys + leveys + pituus + pituus) * korkeus / litralla;
            java.text.DecimalFormat desi = new java.text.DecimalFormat("0.00");
            System.out.println("Maalin tarve on " + desi.format(result) + " litraa");
        }
	  }
}