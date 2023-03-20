package set_13_objects;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KirjaOhjelma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat desi = new DecimalFormat("0.00");
        // ask for info
        System.out.print("Anna nimi: ");
        String nimi = scan.nextLine();
        System.out.print("Anna isbn: ");
        String isbn = scan.nextLine();
        System.out.print("Anna hinta: ");
        double hinta = scan.nextDouble();
        System.out.print("Anna julkaisuvuosi: ");
        int vuosi = scan.nextInt();
        // create books
        Kirja a = new Kirja(nimi, isbn, hinta, vuosi);
        Kirja b = new Kirja();
        // set values for empty book
        b.setNimi(nimi);
        b.setIsbn(isbn);
        b.setHinta(hinta);
        b.setVuosi(vuosi);
        // print
        System.out.println("\r\n" + a.toString() + "\r\n");
        System.out.println("Nimi: " + b.getNimi() + "\r\n"
            + "Isbn: " + b.getIsbn() + "\r\n"
            + "Hinta: " + desi.format(b.getHinta()) + "\r\n"
            + "Julkaisuvuosi: " + b.getVuosi());
        // close scannen
        scan.close();
    }
}