package set_2_basics;
    
import java.util.Scanner;

public class Paivasakko {
	public static void main(String[] args) {
		try (Scanner scanneri = new Scanner(System.in)) {
            System.out.print("Anna nettotulot: ");
            int num = scanneri.nextInt();
            int result = (num - 255) / 60;
            System.out.println("Nettotuloilla " + num + " p�iv�sakko on " + result + " euroa");
        }
	}
}