package set_5_loops;

import java.util.Scanner;

public class Opintopisteet {
    public static void main(String[] args) {
        try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Anna lukukausien määrä:");
            int a = scanneri.nextInt();
            int b = 0;
            int c = 0;
            int d = a*30;
            a++;
            for (int i = 1; i < a; i++) {
                System.out.print("Anna " + i + ". lukukauden opintopisteesi: ");
                b = scanneri.nextInt();
                c += b;
            }
            System.out.println();
            System.out.println("Sinulla pitäisi olla tähän mennessä " + d + " opintopistettä.");
            System.out.println("Sinulla on " + c + " opintopistettä.");
            if (c < d) {
                System.out.println("Olet jäljessä tavoitteesta.");
            } else if (c == d) {
                System.out.println("Olet tavoitteessa.");
            } else {
                System.out.println("Olet edellä tavoitteesta.");
            }
            int e = 210 - c;
            System.out.println("Tutkinnosta puuttuu vielä " + e + " opintopistettä.");
        }
    }
}