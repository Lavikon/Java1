package set_5_loops;

import java.util.Scanner;
import java.util.Random;

public class Arvauspeli {
    static Random satunnaisgeneraattori = new Random();
    public static void main(String[] args) {
        int satunnaisluku = satunnaisgeneraattori.nextInt(100);
        try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Arvaa ajattelemani luku väliltä 0-99: ");
            int a = scanneri.nextInt();
            while (a != satunnaisluku) {
                if (satunnaisluku < a) {
                    System.out.println("Oikea luku on pienempi kuin " + a + "!");
                } else {
                    System.out.println("Oikea luku on suurempi kuin " + a + "!");
                }
                System.out.print("Arvaa uudelleen: ");
                a = scanneri.nextInt();
            }
            System.out.println("Oikein!");
        }
    }
}