package set_1_basics;

import java.util.Scanner;

public class Puoluetuki {
	
  public static void main(String[] args) {
    try (Scanner lukija = new Scanner(System.in)) {
        System.out.print("Anna kansanedustajien lukum��r�: ");
        int lkm = lukija.nextInt();
        int tuki = lkm * 148175;
        System.out.println("Puoluetuen m��r� on " + tuki + " euroa");
    }
  }
}