package set_13_objects;

import java.util.Scanner;

public class RemonttiOhjelma {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Remontti remontti = new Remontti();
		System.out.print("Anna vuosi: ");
		int vuosi = scan.nextInt();
		if (!remontti.setVuosi(vuosi)) {
			System.out.println("Vuosi ei voi olla tulevaisuudessa");
		} else {
			scan.nextLine();
			System.out.print("Anna kuvaus: ");
			String kuvaus = scan.nextLine();
			remontti.setKuvaus(kuvaus);
			System.out.println(remontti.toString());
		}
		scan.close();
	}
}