package set_3_if;

import java.util.Scanner;

public class Katsastus {
	public static void main(String[] args) {
		try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Onko 1=katsastus, 2=j�lkitarkastus: ");
            int a = scanneri.nextInt();
            if (a == 2) {
            	System.out.println("Hinta on 30");
            }
            if (a == 1) {
            	System.out.print("Mitataanko p��st�t 0=ei, 1=kyll�: ");
            	int b = scanneri.nextInt();
            	if (b == 0) {
            		System.out.println("Hinta on 50");
            	}
            	if (b == 1) {
            		System.out.print("Onko auto 0=bensa, 1=diesel: ");
            		int c = scanneri.nextInt();
            		if (c == 1) {
            			System.out.println("Hinta on 81");
            		} else {
            			System.out.println("Hinta on 72");
            		}
            	}
            }
        }
	}
}