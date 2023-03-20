package set_13_objects;

import java.text.DecimalFormat;

public class Asunto {
	
	DecimalFormat desi = new DecimalFormat("0.00");

	private String tyyppi;
	private String osoite;
	private double pintaAla;
	private double hinta;
	private String kuvaus;
	
	public String getTyyppi() {
		return tyyppi;
	}
	
	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}
	
	public String getOsoite() {
		return osoite;
	}
	
	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}
	
	public double getPintaAla() {
		return pintaAla;
	}
	
	public void setPintaAla(double pintaAla) {
		this.pintaAla = pintaAla;
	}
	
	public double getHinta() {
		return hinta;
	}
	
	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	
	public String getKuvaus() {
		return kuvaus;
	}
	
	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}
	
	public Asunto(String tyyppi, String osoite, double pintaAla, double hinta, String kuvaus) {
		super();
		this.tyyppi = tyyppi;
		this.osoite = osoite;
		this.pintaAla = pintaAla;
		this.hinta = hinta;
		this.kuvaus = kuvaus;
	}
	
	public Asunto() {
		super();
	}

	@Override
	public String toString() {
		return "Tyyppi: " + tyyppi + "\r\n" 
				+ "Osoite: " + osoite + "\r\n"
				+ "Pinta-ala: " + desi.format(pintaAla) + "\r\n"
				+ "Hinta: " + desi.format(hinta) + " euroa \r\n"
				+ "Kuvaus: " + kuvaus;
	}	
}