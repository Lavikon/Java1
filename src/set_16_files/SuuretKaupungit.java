package set_16_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SuuretKaupungit {
	public static void main(String[] args) {

		ArrayList<String> kaupungit = new ArrayList<String>();
		File tiedosto = new File("kaupungit.csv");
		try {
			Scanner fread = new Scanner(tiedosto);
			while (fread.hasNextLine()) {
				String txt = fread.nextLine();
				String[] osat = txt.split(",");
				for (int i = 0; i <= osat.length; i++) {
					try {
						if (Integer.valueOf(osat[i + 1]) >= 10000) {
							kaupungit.add(osat[i]);
						}
					} catch (Exception e) {
						i++;
					}
						
				}
			}
			fread.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			// e.printStackTrace();
		}
		Collections.sort(kaupungit);
		for (String kaupunki : kaupungit) {
			System.out.println(kaupunki);
		}
	}
}

/*     
import java.io.IOException; // poikkeusluokka virhetilanteita varten
import java.nio.charset.StandardCharsets; // merkistöluokka, jossa yleisimmät merkistöt
import java.nio.file.Files; // luokka tiedostojen käsittelyyn
import java.nio.file.Path;
import java.nio.file.Paths; // luokka tiedostojen polkujen määrittelemiseksi

Path tiedostonPolku = Paths.get("kaupungit.csv");
    {
        try {
            // readAllLines palauttaa kaikki rivit List<String>-listana. Tiedoston polun
            // lisäksi metodille kannattaa määritellä tiedoston merkistökoodaus (UTF-8):
            List<String> rivit = Files.readAllLines(tiedostonPolku, StandardCharsets.UTF_8);
            for (String rivi : rivit) {
                String[] osat = rivi.split(",");
                //kaupungit.add(new asetus.add(osa[0], osa[1]))
            }
            System.out.println("Tiedostosta luettiin rivit:");
            for (String rivi : rivit) {
                System.out.println(rivi);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    } */