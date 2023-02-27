package set_11_methdos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Veriryhma {

    public static int kysyLuovutus(List<String> veri) {
        try (Scanner scan = new Scanner(System.in)) {
            int a = 0;
            while (true) {
                System.out.print("Anna veriryhmä (- lopettaa): ");
                String s = scan.nextLine();
                if ("".equals(s) || "-".equals(s)) {
                    break;
                } else {
                veri.add(s);
                a++;
                }
            }
            return a;
        }
        
    }

    public static void nayta(List<String> veri) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Minkä veriryhmän luovutusten määrän haluat tietää: ");
            String x = scan.nextLine();
            int i = 0;
            for (String s : veri) {
                if (s.equals(x))
                    i++;
            }
            System.out.println("Veriryhmän " + x + " luovutuksia oli " + i);
        }
    }

    public static void main(String[] args) {
        List<String> veri = new ArrayList<String>();
        int a = Veriryhma.kysyLuovutus(veri);
        System.out.println("Luovutuksia oli yhteensä " + a);
        Veriryhma.nayta(veri);
    }
}