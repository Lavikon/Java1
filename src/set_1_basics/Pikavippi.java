package set_1_basics;

import java.util.Scanner;

public class Pikavippi {
  public static void main(String[] args) {
    try (Scanner scanneri = new Scanner(System.in)) {
        System.out.print("Anna pikavipin m��r� euroissa: ");
        double vippi = scanneri.nextDouble();
        System.out.print("Moneksiko vuodeksi raha halutaan (1 tai 2): ");
        double aika = scanneri.nextDouble();
        System.out.print("Lainakorko kahdesta yleisest� (41% tai 37%): ");
        double korko = scanneri.nextDouble();
        double korot = aika * korko / 100;
        double result = vippi * korot;
        System.out.println("Lainatut rahat maksavat eli korko " + result);
    }
  }
}