package set_7_strings;

import java.util.Scanner;

public class Tuotteet {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Anna tuotenumero: ");
            int a = scan.nextInt();
            scan.nextLine();
            System.out.print("Anna tuotteen nimi: ");
            String b = scan.nextLine();
            System.out.print("Anna  tuotteen hinta: ");
            String c = scan.nextLine();
            System.out.print("Anna  tuotteen kuvaus: ");
            String d = scan.nextLine();
            String e = b.replaceAll("\\s", "");
            String f = d.replaceAll("\\s", "");
            String g = c.replaceAll("\\s", "");
            System.out.println("Numero: " + a);
            System.out.println("Nimi: " + e);
            System.out.println("Hinta: " + g);
            if (!(f.equals(""))) {
                System.out.println("Kuvaus: " + f);
            }
        }
    }
}