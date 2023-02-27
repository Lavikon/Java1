package set_1_basics;

import java.util.Scanner;

public class Bitcoin {
    public static void main(String[] args) {
      try (Scanner scanneri = new Scanner(System.in)) {
        System.out.print("Anna Bitcoineihin investoidun rahan m��r�: ");
          double num = scanneri.nextDouble();
          double result = num * 14.06;
          System.out.println("Bitcoin tuotti vuodessa " + result + " euroa");
    }
    }
}
