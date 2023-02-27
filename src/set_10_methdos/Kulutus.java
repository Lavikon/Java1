package set_10_methdos;

import java.util.Scanner;

public class Kulutus {

    public static int kysyKilometrit() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Anna ajetut kilometrit: ");
            int a = scan.nextInt();
            return a;
        }
    }
    public static double kysyTankkaus() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Anna tankattu määrä: ");
            double a = scan.nextDouble();
        return a;
        }
    }    
    public static double laskeKulutus(int kilometrit, double tankattu) {
        double a = tankattu / kilometrit * 100;
        return a;
    }
    public static void naytaKulutus(double kulutus) {
        java.text.DecimalFormat desi = new java.text.DecimalFormat("0.00");
        System.out.println("Kulutus/100km on " + desi.format(kulutus) + " litraa");
    }
    public static void main(String[] args) {
        int a = Kulutus.kysyKilometrit();
        double b = Kulutus.kysyTankkaus();
        double c = Kulutus.laskeKulutus(a, b);
        Kulutus.naytaKulutus(c);
    }
}