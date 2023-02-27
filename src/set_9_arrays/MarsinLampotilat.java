package set_9_arrays;

import java.util.Scanner;

public class MarsinLampotilat {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] array = new int[10];
            int sum = 0;
            
            for (int i = 0; i < array.length; i++) {
                System.out.println("Syötä mittaus " + (i + 1) + "/10: ");
                int value = scan.nextInt();
                if (value >= -140 && value <= 20) {
                    array[i] = value;
                    sum += value;
                } else {
                    System.out.println("Anna lämpötila väliltä -140 - +20!");
                    i--;
                }
            }
            
            int min = array[0];
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
                if (array[i] > max) {
                    max = array[i];
                }
            }
            double avg = (double)sum / array.length;
            
            System.out.println("Mittausten keskiarvo: " + avg);
            System.out.println("Pienin mittaustulos: " + min);
            System.out.println("Suurin mittaustulos: " + max);
        }
    }
}