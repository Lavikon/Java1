package set_1_basics;

import java.util.Scanner;

public class HeiEtunimi {
	
  public static void main(String[] args) {
    try (Scanner lukija = new Scanner(System.in)) {
      System.out.print("Sy�t� etunimi: ");
      String nimi = lukija.nextLine();
      System.out.println("Hei " + nimi + "!");
    }
  }
}
