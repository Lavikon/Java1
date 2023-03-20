package set_16_files;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Anna tiedoston nimi: ");
		File file = new File(scan.nextLine());
		int r = 0; // row
		int w = 0; // word
		int c = 0; // char
		try {
			Scanner scanf = new Scanner(file);
			while (scanf.hasNextLine()) {
				String txt = scanf.nextLine();
				c += txt.length();
				String[] sanat = txt.split(" ");
				for (String sana : sanat) {
					if (!sana.isBlank()) {
						w++;
					}		
				}
				String[] rivit = txt.split("\r\n");
				r += rivit.length;
			}
			scan.close();
			scanf.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			// e.printStackTrace();
		}
		System.out.println("Tiedostossa on: \r\n"
				+ r + " riviä \r\n"
				+ w + " sanaa \r\n"
				+ c + " merkkiä");
	}
}

/* 
import java.nio.file.Files; // luokka tiedostojen käsittelyyn
import java.nio.file.Path;
import java.nio.file.Paths; // luokka tiedostojen polkujen määrittelemiseksi
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException; // poikkeusluokka virhetilanteita varten
import java.nio.charset.StandardCharsets; // merkistöluokka, jossa yleisimmät merkistöt

public class WordCount {
    Path tiedostonPolku = Paths.get("tekstitiedosto.txt"); {
    try {
        // readAllLines palauttaa kaikki rivit List<String>-listana. Tiedoston polun
        // lisäksi metodille kannattaa määritellä tiedoston merkistökoodaus (UTF-8):
        List<String> rivit = Files.readAllLines(tiedostonPolku, StandardCharsets.UTF_8);
        System.out.println("Tiedostosta luettiin rivit:");
        for (String rivi : rivit) {
            System.out.println(rivi);
        }
    } catch ( IOException e) {
        System.out.println(e);
    }
}  */