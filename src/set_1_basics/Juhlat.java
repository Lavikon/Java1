package set_1_basics;

import java.util.Scanner;

public class Juhlat {
	public static void main(String[] args) {
		try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Anna juhliin tulevien aikuisten m��r�: ");
            int num = scanneri.nextInt();
            int result = num / 7 + 1;
            System.out.println("Pulloja tarvitaan " + result + " kappaletta");
            result = result * 7 - num;
            System.out.println("Viimeisest� pullosta j�� " + result + " lasia");
        }
	}
}