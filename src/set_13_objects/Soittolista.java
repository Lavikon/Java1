package set_13_objects;

import java.util.ArrayList;

public class Soittolista {
	
	private ArrayList<Kappale> kappaleet = new ArrayList<Kappale>();
	public Soittolista() {
		super();
	}
	public void lisaaKappale(Kappale kappale) {
		kappaleet.add(kappale);
	}
	public Kappale getKappale(int indeksi) {
		return kappaleet.get(indeksi);
	}
	public int haeKokonaispituus() {
		int s = 0;
		for (Kappale i : kappaleet) {
			s += i.getKesto();
		}
		return s;
	}
	@Override
	public String toString() {
		String lista = "";
		for (int i = 0; i < kappaleet.size(); i++) {
			String rivi = (i + 1) + ": " + kappaleet.get(i);
			lista += rivi + "\r\n";
		}
		return lista;
	}
}