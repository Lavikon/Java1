package set_9_arrays;

import java.util.Scanner;

public class SanojenVaihtaminen {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Kirjoita lause: ");
            String lause = scan.nextLine();
            System.out.println("Mitkä sanat vaihdetaan keskenään? ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            String[] sanat = lause.split("\\s+");
            System.out.println();
            for (String sana : sanat) {
                if (sana == sanat[a]) {
                    System.out.print(sanat[b] + " ");
                } else if (sana == sanat[b]) {
                    System.out.print(sanat[a] + " ");
                } else {
                System.out.print(sana + " ");   
                }
            }
        }
    }
}