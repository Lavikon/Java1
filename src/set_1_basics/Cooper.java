package set_1_basics;

import java.util.Scanner;

public class Cooper {
  public static void main(String[] args) {
    try (Scanner scanneri = new Scanner(System.in)) {
        System.out.print("Anna juostu matka: ");
        int num = scanneri.nextInt();
        int result = num / 400;
        System.out.println("Kokonaisia 400 metrin kierroksia oli " + result);
    }
  }
}