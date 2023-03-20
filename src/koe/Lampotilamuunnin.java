package koe;

import java.util.Scanner;

public class Lampotilamuunnin {
    public static double muunnaFahrenheitiksi(double tc) {
        double tf = (tc * 9 / 5) + 32;
        return tf;
    }

    public static void main(String[] args) {
        java.text.DecimalFormat desi = new java.text.DecimalFormat("0.0");
        Scanner scan = new Scanner(System.in);
        System.out.print("Anna lämpötila celsiuksena: ");
        double a = scan.nextDouble();
        double b = Lampotilamuunnin.muunnaFahrenheitiksi(a);
        System.out.println("Lämpötila Fahrenheitteina on: " + desi.format(b));
        scan.close();
    }
}

/*
 * Tee ohjelma Lampotilamuunnin, jossa on staattinen metodi
 * muunnaFahrenheitiksi,
 * joka muuntaa lämpötilan Celsiuksesta Yhdysvalloissa käytettäväksi
 * Fahrenheitiksi.
 * Celsius muutetaan Fahrenheitiksi kertomalla lämpötila murtoluvulla 9/5 ja
 * lisäämällä siihen 32.
 * 
 * Metodin tulee saada parametrinaan double-tyyppinen arvo, joka on celsiuksia.
 * Metodin nimen täytyy olla muunnaFahrenheitiksi. Metodi palauttaa double
 * tyyppisen luvun,
 * joka on kyseinen lämpötila Fahrenheitteina. Metodia kutsutaan pääohjelmasta.
 * Lopuksi ohjelma tulostaa muunnoksen tuloksen näytölle. Muotoile tulostettava
 * lämpötila yhden desimaalin tarkkuudelle.
 * 
 * Anna lämpötila celsiuksena: 21,5
 * 
 * Lämpötila Fahrenheitteina on: 70,7
 */