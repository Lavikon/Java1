package koe;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Syntymapaivat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter pvm = DateTimeFormatter.ofPattern("d.M.yyyy");
        System.out.println("Anna henkilön syntymäpäivä (esim. 30.10.1981): ");
        String a = scan.nextLine();
        LocalDate b = LocalDate.parse(a, pvm);
        LocalDate c = LocalDate.now();
        int b1 = b.getYear();
        int c1 = c.getYear();
        int d1 = c1-b1;
        b = b.plusYears(d1);
        long d = Duration.between(c.atStartOfDay(), b.atStartOfDay()).toDays();

        if (b == c) {
            System.out.println("Tänään on syntymäpäiväsi!");
        } else if (d<0) {
            System.out.println("Syntymäpäiviin on " + (365+d) + " päivää.");
        } else {
            System.out.println("Syntymäpäiviin on " + (d) + " päivää.");
        }
        scan.close();
    }
}
/*
 * Syntymäpäivät ohjelman pitää laskea annetusta päivämäärästä, että kuinka
 * monta päivää syntymäpäivään on. Jos esimerkiksi syntymäpäivä on 30.1.1977,
 * niin syntymäpäivämäärä on tulevaisuudessa olettaen että ohjelmaa käytetään
 * lokakuussa. Jos taas syntymäpäivämäärä on 1.8.1974 syntymäpäivämäärä on jo
 * mennyt olettaen, että ohjelmaa käytetään lokakuussa.
 * 
 * Matkan päivissä tiettyyn päivään saa komennolla:
 * 
 * long paiviaValissa = Duration.between(paivaNyt.atStartOfDay(),
 * synttariPaivamaara.atStartOfDay()).toDays();
 * 
 * Tee ohjelma, joka selvittää päivien määrän annettuun synttäripäivään asti.
 * Eli kuinka monen päivän päästä syntymäpäivät ovat.
 * 
 * Ohjelman pitää antaa tulostukset seuraavissa muodoissa:
 * 
 * System.out.println("Tänään on syntymäpäiväsi!"); tai
 * System.out.println("Syntymäpäiviin on xxx päivää.");
 */

/*
 * Example output:
 * Anna henkilön syntymäpäivä (esim. 30.10.1981):
 * 1.8.2004
 * Syntymäpäiviin on 139 päivää.
 * The
 */