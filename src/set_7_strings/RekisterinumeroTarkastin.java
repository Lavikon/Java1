package set_7_strings;

import java.util.Scanner;

public class RekisterinumeroTarkastin {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String a = "";
            while (!(a.equals("q"))) {
                System.out.println("Syötä rekisterinumero (q-kirjain lopettaa): ");
                a = scan.nextLine();
                if (a.equals("q")) {
                    break;
                } else {
                    boolean b1 = false;
                    if (a.contains("-")) {
                        int i = a.indexOf("-");
                        int l = a.length();
                        if (i> 1 && i < 4 && l < 8) {
                            String b = a.substring(0, i);
                            if (b.matches("[a-zA-ZäöåÖÄÅ]+")) {
                                i++;
                                String c = a.substring(i, l);
                                if (c.matches("[0-9]+")) {
                                    int d = Integer.parseInt(c);
                                    if (d < 1000 && d > 0) {
                                        b1 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (b1) {
                        System.out.println(a + " on kelvollinen rekisterinumero.");
                    } else {
                        System.out.println(a + " ei ole kelvollinen rekisterinumero.");
                    }
                }
            }
        }
    }
}