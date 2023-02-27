package set_11_methdos;

import java.util.Arrays;
import java.util.Scanner;

public class Lampotilat {

    public static int kysyLampotilat(int[] lampotilat, final int MAX) {
        try (Scanner scan = new Scanner(System.in)) {
            int a = 0;
            for (int i = 0; i < MAX; i++) {
                System.out.println("Anna lämpötila: ");
                int value = scan.nextInt();
                if (value != -999) {
                    lampotilat[i] = value;
                } else {
                    break;
                }
                a++;
            }
            return a;
        }
    }

    public static void naytaLampotilat(int[] lampotilat, int lkm) {
        Arrays.sort(lampotilat, 0, lkm);
        int i = 0;
        System.out.print("Annoit lämpötilat: ");
        for (int t : lampotilat) {
            if (i<lkm) {
                System.out.print(t + " ");
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[100];
        int a = Lampotilat.kysyLampotilat(array, 100);
        Lampotilat.naytaLampotilat(array, a);
    }
}