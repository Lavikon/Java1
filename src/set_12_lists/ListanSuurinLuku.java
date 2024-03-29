package set_12_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ohjelmaan on toteutettu valmiina pohja, joka lukee käyttäjältä lukuja
 * listalle. Syötteiden lukeminen päätetään kun käyttäjä syöttää luvun -1.
 * 
 * Lisää ohjelmaan toiminnallisuus, joka lukujen lukemisen jälkeen etsii
 * listalta listan suurimman luvun ja tulostaa sen arvon. Ohjelman pitäisi
 * toimia seuraavasti.
 * 
 * Tämän tehtävän on laatinut Helsingin yliopiston Agile Education Research
 * -tutkimusryhmä. Tehtävä on lisensoitu on lisensoitu Creative Commons BY-NC-SA
 * 4.0 -lisenssillä ja se on julkaistu kurssilla https://ohjelmointi-19.mooc.fi.
 */
public class ListanSuurinLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> luvut = new ArrayList<Integer>();

        System.out.println("Syötä kokonaislukuja listalle (-1 lopettaa):");
        int max = 0;

        while (true) {
            int syote = lukija.nextInt();

            if (syote == -1) {
                break;
            } else {
                luvut.add(syote);
                if (syote>max) {
                    max = syote;
                }
            }
        }
        lukija.close();

        System.out.println(); // Tyhjä rivi tulosteeseen

        System.out.println("Listan suurin luku: " + max);
    }
}