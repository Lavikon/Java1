package set_10_methdos;

import java.util.Scanner;

public class Tunnus {

    public static String teeTunnus(String etu, String suku) {
        String a = etu.substring(0,3);
        String b = suku.substring(0,3);
        String c = b.toLowerCase() + a.toLowerCase();
        return c;
    }
    
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Anna sukunimi: ");
            String a = scan.nextLine();
            System.out.print("Anna etunimi: ");
            String b = scan.nextLine();
            String c = Tunnus.teeTunnus(b, a);
            System.out.println("Tunnus on " + c);
        }
    }
}