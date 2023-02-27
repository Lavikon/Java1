package set_11_methdos;

import java.util.Scanner;

public class Laakarikorvaus {
    
    public static int kysy() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Anna käynnin kesto: ");
            int a = scan.nextInt();
            return a;
        }
    }
    public static double laskeKorvaus(int kesto) {
        double a = 0.0;
        if (kesto < 10) {
            a = 8.00;
        } else if (kesto < 20) {
            a = 11.00;
        } else if (kesto < 30) {
            a = 13.50;
        } 
        return a;
    }
    public static void out(int kesto, double korvaus) {
        java.text.DecimalFormat desi = new java.text.DecimalFormat("0.00");
        System.out.println("Kestoltaan " + kesto + " minuutin yleislääkärikäynnistä kelakorvaus on " + desi.format(korvaus) + " euroa");
    }
    public static void main(String[] args) {
        int a = Laakarikorvaus.kysy();
        double b = Laakarikorvaus.laskeKorvaus(a);
        Laakarikorvaus.out(a, b);
    }
}