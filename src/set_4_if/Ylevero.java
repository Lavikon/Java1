package set_4_if;

import java.util.Scanner;

public class Ylevero {
	public static void main(String[] args) {
		try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Anna vuositulosi ja ikäsi: ");
            double a = scanneri.nextDouble();
            double b = scanneri.nextDouble();
            double c = a*0.0068;
            double d = 0;
            if (c >= 140) {
            	d = 140;
            } else if (c < 70 || b < 18) {
            	d = 0;
            } else {
            	d = c;
            }
            java.text.DecimalFormat desi = new java.text.DecimalFormat("0.00");
            System.out.println("Ylevero on " + desi.format(d));
        }
	}
}