package set_4_if;

import java.util.Scanner;

public class Palkka {
	public static void main(String[] args) {
		try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Anna palkka: ");
            double a = scanneri.nextDouble();
            System.out.print("Anna veroprosentti: ");
            double b = scanneri.nextDouble();
            System.out.print("Anna ikä: ");
            double c = scanneri.nextDouble();
            double d = 0.0555;
            if (c >= 53) {
            	d = 0.0705;
            }
            double result = 0;
            double result1 = a;
            java.text.DecimalFormat desi = new java.text.DecimalFormat("0.00");
            System.out.println("Bruttopalkka " + (int) a);
            result = a * b / 100;
            result1 = result1 - result;
            System.out.println("Veron osuus " + desi.format(result));
            result = a * d;
            result1 = result1 - result;
            System.out.println("Työeläkevakuutusmaksun osuus " + desi.format(result));
            result = a * 0.0115;
            result1 = result1 - result;
            System.out.println("Työttömyysvakuutuksen osuus " + desi.format(result));
            System.out.println("Käteen jää " + desi.format(result1));
        }
	}
}