package demo;

import java.util.Scanner;

public class TuumatMillimetreiksi {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna mitta tuumina: ");

        double tuumat = lukija.nextDouble();

        // TEHDÄÄN MUUNNOSLASKU

        double millimetrit = (10 * 2.54) * tuumat;

        System.out.print("Mitta millimetreinä on: ");

        System.out.println(millimetrit + " millimetriä.");

        lukija.close();
    }

}