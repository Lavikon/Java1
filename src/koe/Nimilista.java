package koe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nimilista {
    public static void main(String[] args) {
        System.out.println("Ohjelmassa pidetään listaa kavereista.");
        List<String> lista = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\r\n(1) Lisää kaveri \r\n"
            + "(2) Poista kaveri\r\n"
            + "(3) Listaa kaverit\r\n"
            + "(4) Lopeta ohjelma\r\n"
            + "Anna toiminto (1, 2, 3 tai 4):");
            int a = scan.nextInt();
            scan.nextLine();
            if (a==1) {
                System.out.println("Anna kaverin nimi: ");
                String b = scan.nextLine();
                lista.add(b);
            } else if (a==2) {
                System.out.println("Anna poistettavan kaverin indeksi: ");
                int c = scan.nextInt();
                scan.nextLine();
                lista.remove(c);
            } else if (a==3) {
                int i = -1;
                for (String s : lista) {
                    i++;
                    System.out.println(i + " " + s);
                }
            } else if (a==4) {
                break;
            }
        }
        scan.close();
    }
}
/* 
Example output:
Ohjelmassa pidetään listaa kavereista.

(1) Lisää kaveri
(2) Poista kaveri
(3) Listaa kaverit
(4) Lopeta ohjelma
Anna toiminto (1, 2, 3 tai 4): 1
Anna kaverin nimi: Jukka

(1) Lisää kaveri
(2) Poista kaveri
(3) Listaa kaverit
(4) Lopeta ohjelma
Anna toiminto (1, 2, 3 tai 4): 1
Anna kaverin nimi: Asko

(1) Lisää kaveri
(2) Poista kaveri
(3) Listaa kaverit
(4) Lopeta ohjelma
Anna toiminto (1, 2, 3 tai 4): 1
Anna kaverin nimi: Pentti

(1) Lisää kaveri
(2) Poista kaveri
(3) Listaa kaverit
(4) Lopeta ohjelma
Anna toiminto (1, 2, 3 tai 4): 1
Anna kaverin nimi: Kari

(1) Lisää kaveri
(2) Poista kaveri
(3) Listaa kaverit
(4) Lopeta ohjelma
Anna toiminto (1, 2, 3 tai 4): 3
0 Jukka
1 Asko
2 Pentti
3 Kari

(1) Lisää kaveri
(2) Poista kaveri
(3) Listaa kaverit
(4) Lopeta ohjelma
Anna toiminto (1, 2, 3 tai 4): 2
Anna poistettavan kaverin indeksi: 2

(1) Lisää kaveri
(2) Poista kaveri
(3) Listaa kaverit
(4) Lopeta ohjelma
Anna toiminto (1, 2, 3 tai 4): 3
0 Jukka
1 Asko
2 Kari

(1) Lisää kaveri
(2) Poista kaveri
(3) Listaa kaverit
(4) Lopeta ohjelma
Anna toiminto (1, 2, 3 tai 4): 4
The verification of program output does not account for whitespace and is not case-sensitive (the least strict comparison level) */

/* Tee ohjelma Nimilista, joka pitää listaa kavereiden etunimistä. Ohjelmassa on tekstikäyttöliittymä, jossa pystyy lisäämään, poistamaan ja listaamaan kaverit.

Kaverilistaa ylläpidetään String-tyyppisiä olioita sisältävässä listassa, joka luodaan ennen silmukkaa komennolla List<String> kaverit = new ArrayList<String>();

List ja ArrayList luokat pitää asianmukaisesti importoida.

Komennot annetaan valitsemalla joko numero 1, 2, 3 tai 4. */