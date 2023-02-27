package set_6_loops;

import java.util.Scanner;

public class Arvaus {
    public static void main(String[] args) {
        int satunnaisluku = 78;
        try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Arvaa lukua väliltä 1-100: ");
            int a = scanneri.nextInt();
            int i = 1;
            while (a != satunnaisluku) {
                if (satunnaisluku < a) {
                    System.out.print("Arvaa pienempää: ");
                } else if (satunnaisluku > a) {
                    System.out.print("Arvaa suurempaa: ");
                }
                a = scanneri.nextInt();
                i++;
            }
            System.out.println("Arvasit oikein. Arvauksia oli " + i);
        }
    }
}