package demo;

import java.time.LocalDate;

// PITÄÄ TEHDÄ OHJELM, JOKA KERTOO KUINKA MONTA

// PÄIVÄÄ APRILLLIPÄIVÄÄN ON

public class AprilliPaiva {

    public static void main(String[] args) {

        LocalDate paivaTanaan = LocalDate.now();

        int vuosi = paivaTanaan.getYear();

        LocalDate aprillipaiva = LocalDate.of(vuosi, 4, 1);

        int paivaLaskuri = 0;

        while (true) {

            paivaTanaan = paivaTanaan.plusDays(1);

            paivaLaskuri++;

            if (paivaTanaan.equals(aprillipaiva) == true) {

                System.out.println("Aprillipäivään on " +

                        paivaLaskuri + " päivää.");

                break;

            }

        }

    }

}