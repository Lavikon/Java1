package set_7_strings;

import java.util.Scanner;

public class Lento {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Anna lennon numero: ");
            String a = scan.nextLine();
            String c = a.substring(2, 3);
            if (a.contains("AY")) {
                int b = Integer.parseInt(c);
                if (b == 1) {
                    System.out.println("Kaukolento");
                } else if (b > 1 && b < 7) {
                    System.out.println("Kotimaan lento");
                } else if (b == 7) {
                    System.out.println("Venäjän lento");
                }
            } else {
                System.out.println("Ei ole Finnairin lento");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}