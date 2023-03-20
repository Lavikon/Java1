package set_15_exceptions;

import java.util.Scanner;

public class KysyUudestaan {
    public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Syötä kokonaisluku: ");
			int i = 0;
			while (true) {
				try {
					i = scan.nextInt();
					break;
				} catch (Exception e) {
					scan.nextLine();
					System.out.println("Virheellinen luku!");
					System.out.println();
					System.out.print("Syötä kokonaisluku: ");
				}
			}
			System.out.println("Syötit luvun "+ i + ".");
		}
	}
}