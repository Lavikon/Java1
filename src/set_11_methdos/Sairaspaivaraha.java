package set_11_methdos;

import java.util.Scanner;

public class Sairaspaivaraha {
    
    public static double laskeRaha(double arvo) {
        double vero = 0.0;
        if (arvo < 1399) {
            vero = 0.0;
        } else if (arvo < 36420) {
            vero = (arvo * 0.7) / 300;
        } else if (arvo < 56033) {
            arvo -= 36419;
            vero = (arvo * 0.4)/300 + 84.98;
        } else {
            arvo -= 56032;
            vero = (arvo * 0.25)/300 + 111.13;
        }
        return vero;
    }
    public static void out(double a, double b) {
        java.text.DecimalFormat desi = new java.text.DecimalFormat("0.00");
        System.out.println("Vuosituloilla " + desi.format(a) + " sairaspäiväraha on " + desi.format(b) + " euroa/päivä.");
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Anna vuositulosi: ");
            double a = scan.nextDouble();
            double b = Sairaspaivaraha.laskeRaha(a);
            Sairaspaivaraha.out(a, b);
        }
    }
}