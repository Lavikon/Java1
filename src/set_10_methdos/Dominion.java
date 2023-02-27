package set_10_methdos;

import java.util.Scanner;

public class Dominion {
    
    public static int laskePisteet(int kirous, int tila, int pitaja, int laani) {
    int yhteispisteet = kirous * -1 + tila * 2 + pitaja*3 + laani*6;
    return yhteispisteet;
 }
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Anna kirouskorttien määrä: ");
            int a = scan.nextInt();
            System.out.print("Anna tilakorttien määrä: ");
            int b = scan.nextInt();
            System.out.print("Anna pitäjäkorttien määrä: ");
            int c = scan.nextInt();
            System.out.print("Anna läänikorttien määrä: ");
            int d = scan.nextInt();

            int pisteet = Dominion.laskePisteet(a, b, c, d);
            
            System.out.println("Pisteiden yhteismäärä on " + pisteet);
        }
    }
}