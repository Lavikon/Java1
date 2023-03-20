package set_15_exceptions;

import java.util.Scanner;

public class Summaaja {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
            int sum = 0;
            while (true) {
            	System.out.println("Syötä seuraava luku (0 lopettaa): ");
            	try {
            		int i = scan.nextInt();
            		if (i != 0) {
            			sum += i;
            		} else {
            			System.out.println("Lukujen summa on " + sum + ".");
                        break;
            		}
            	} catch (Exception e) {
            		System.out.println("Virheellinen syöte!");
            		scan.nextLine();
            	}
            }
        }
	}
}