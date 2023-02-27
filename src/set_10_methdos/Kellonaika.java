package set_10_methdos;

import java.util.Scanner;

public class Kellonaika {

    public static String kysyKellonaika() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Anna kellonaika muodossa tt:mm: ");
            String a = scan.nextLine();
            return a;
        }
    }

    public static boolean tarkastaKellonaika(String kellonaika) {
        boolean a = false;
        if (kellonaika.matches("[0-2][0-9][:][0-5][0-9]")) {
            String b = kellonaika.substring(0, 2);
            int c = Integer.parseInt(b);
            if (c < 25) {
                a = true;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        String a = Kellonaika.kysyKellonaika();
        if (Kellonaika.tarkastaKellonaika(a)) {
            System.out.println("Kellonaika on oikein");
        } else {
            System.out.println("Kellonaika on väärin");
        }
    }
}