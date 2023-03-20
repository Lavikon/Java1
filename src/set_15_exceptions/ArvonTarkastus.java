package set_15_exceptions;

import java.util.Scanner;

public class ArvonTarkastus {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Syötä luku väliltä 0-23: ");
            int luku = scan.nextInt();
            if (luku < 0 || luku > 23) {
            	throw new IllegalArgumentException();
            } else {
            	System.out.println("Luku " + luku + " on sallittu.");
            } 
        }
	}
}