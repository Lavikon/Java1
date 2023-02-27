package set_7_strings;

import java.util.Scanner;

public class Lumi {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String a = "alku";
            int i = 0;
            int l = 0;
            while (!(a.equalsIgnoreCase("LOPPU"))) {
                System.out.print("Anna nimi: ");
                a = scan.nextLine();
                if (a.equalsIgnoreCase("lumi")) {
                    l++;
                }
                if (a.equalsIgnoreCase("loppu")) {
                    break;
                } else {
                    i++;
                }
            }
            System.out.println("Nimiä oli " + i + " kappaletta.");
            System.out.println("Nimi Lumi esiintyi " + l + " kertaa.");
        }
    }
}