package koe;

import java.util.Scanner;

public class Puhelinnumerot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Anna puhelinnumero: ");
        String a = scan.nextLine();
        if (a.contains("050") || a.contains("040")) {
            int i = a.length();
            String b = "+358" + a.substring(1, i);
            System.out.println("Numero korjattuna on: " + b);
        } else {
            System.out.println("Numerossa ei löytynyt korjattavaa.");
        }
        scan.close();
    }
}
/* Anna puhelinnumero:
Ja tämän jälkeen antaa korjattu numero, joko:
Numero korjattuna on: +358405209879
tai tulostaa:
Numerossa ei löytynyt korjattavaa. */