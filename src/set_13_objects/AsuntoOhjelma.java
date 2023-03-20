package set_13_objects;

import java.util.Scanner;

public class AsuntoOhjelma {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Anna asunnon tyyppi: ");
		String tyyppi = scan.nextLine();
		System.out.print("Anna osoite: ");
		String osoite = scan.nextLine();
		System.out.print("Anna pinta-ala: ");
		double pintaAla = scan.nextDouble();
		System.out.print("Anna hinta: ");
		double hinta = scan.nextDouble();
		scan.nextLine();
		System.out.print("Anna kuvaus: ");
		String kuvaus = scan.nextLine();
		Asunto asunto = new Asunto(tyyppi, osoite, pintaAla, hinta, kuvaus);
		System.out.println("\r\n" + asunto.toString());
		scan.close();
	}
}