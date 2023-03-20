package demo;

import java.util.Scanner;

// OLETETAAN VAIN YKSINKERTAISESTI, ETTÄ OSOITTEESSA ON

// @ MERKKI, MUITA VAATIMUKSIA EI OLE

public class OnkoTamaSahkopostiOsoite {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna sähköpostiosoite: ");

        String email = lukija.nextLine();

        boolean sisaltaaAtMerkin = false;

        // TÄSSÄ TEHTÄVÄSSÄ ON HYÖDYLLISTÄ MUUTTUJAN ROOLIEN KÄYTTÖ

        // JUURI TÄHÄN SOPII LIPPU-ROOLINEN MUTTUJA

        // MUUT ROOLIT ESIM: KASVATTAJA

        // ALOITETAAN SÄHKÖPOSTIOSOITTEEN TARKISTUS

        for (int i = 0; i < email.length(); i++) {

            String yksiMerkki = email.substring(i, i + 1);

            if (yksiMerkki.equals("@")) {

                sisaltaaAtMerkin = true;

            }

        }

        if (sisaltaaAtMerkin == true) {

            System.out.println("Sähköpostiosoite sisälsi @ merkin.");

        } else {

            System.out.println("Sähköpostiosoite ei sisältänyt @ merkkiä.");

        }

        lukija.close();
    }
}