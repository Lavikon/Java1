package set_12_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Toteuta ohjelma, joka lukee käyttäjältä lukuja listalle. Syötteiden lukeminen
 * päätetään kun käyttäjä syöttää luvun -1.
 * 
 * Kun lukujen lukeminen lopetetaan, laske listalla olevien lukujen keskiarvo ja
 * tulosta se.
 * 
 * Tämän tehtävän on laatinut Helsingin yliopiston Agile Education Research
 * -tutkimusryhmä. Tehtävä on lisensoitu on lisensoitu Creative Commons BY-NC-SA
 * 4.0 -lisenssillä ja se on julkaistu kurssilla https://ohjelmointi-19.mooc.fi.
 */
public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> luvut = new ArrayList<Integer>();

        System.out.println("Syötä kokonaislukuja listalle (-1 lopettaa):");
        int sum = 0;
        int i = 0;

        while (true) {
            int syote = lukija.nextInt();

            if (syote == -1) {
                break;
            } else {
                luvut.add(syote);
                sum += syote;
                i++;
            }
        }
        lukija.close();

        System.out.println(); // Tyhjä rivi tulosteeseen

        double a = sum / i;
        System.out.println("Keskiarvo: " + a); // Keskiarvoa ei tule pyöristää!
    }
}
