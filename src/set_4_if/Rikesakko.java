package set_4_if;

import java.util.Scanner;

public class Rikesakko {
    public static void main(String[] args) {
		try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Anna nopeusrajoitus: ");
            double a = scanneri.nextDouble();
            System.out.print("Anna nopeutesi: ");
            double b = scanneri.nextDouble();
            double c = b-a;
            if (a > b) {
            	System.out.println("Ei sakkoja");
            } else if (c > 20) {
            	System.out.println("Menee päiväsakoille");
            } else if (c > 15) {
            	System.out.println("Rikesakko on 200");
            } else if (a < 65) {
            	System.out.println("Rikesakko on 170");
            } else {
            	System.out.println("Rikesakko on 140");
            }
        }
	}
}