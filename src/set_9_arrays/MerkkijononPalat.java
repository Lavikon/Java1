package set_9_arrays;

import java.util.Scanner;

public class MerkkijononPalat {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Kirjoita lause: ");
            String lause = scan.nextLine();
            String[] sanat = lause.split("\\s+");
            System.out.println();
            for (String sana : sanat) {
                System.out.println(sana);
            }
        }
    }
}