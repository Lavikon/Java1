package set_5_loops;

import java.util.Scanner;

public class Alkuluku {
    public static void main(String[] args) {
        try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Syötä jokin positiivinen kokonaisluku:");
            int a = scanneri.nextInt();
            boolean b = true;
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println("Luku " + a + " on alkuluku.");
            } else {
                System.out.println("Luku " + a + " ei ole alkuluku.");
            }
        }
    }
}