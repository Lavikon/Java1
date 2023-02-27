package set_3_if;

import java.util.Scanner;

public class Palkka {
	public static void main(String[] args) {
		try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Anna palkka: ");
            double a = scanneri.nextDouble();
            System.out.print("Anna veroprosentti: ");
            double b = scanneri.nextDouble();
            System.out.print("Anna ik�: ");
            double c = scanneri.nextDouble();
            double d = 0.0675;
            if (c >= 53 && c <= 62) {
            	d = 0.0825;
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
            System.out.println("Ty�el�kevakuutusmaksun osuus " + desi.format(result));
            result = a * 0.015;
            result1 = result1 - result;
            System.out.println("Ty�tt�myysvakuutuksen osuus " + desi.format(result));
            System.out.println("K�teen j�� " + desi.format(result1));
        }
	}
}
