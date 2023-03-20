package set_13_objects;

import java.time.LocalDate;

public class Remontti {
	
	private int vuosi;
	private String kuvaus;
	
	int vuosi0 = LocalDate.now().getYear();
	
	public int getVuosi() {
		return vuosi;
	}

	public boolean setVuosi(int vuosi) {
		if (vuosi > vuosi0) {
			return false;
		} else {
			this.vuosi = vuosi;
			return true;
		}
	}

	public String getKuvaus() {
		return kuvaus;
	}

	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}

	public Remontti() {
		super();
	}

	@Override
	public String toString() {
		return "Vuonna " + vuosi + " tehtiin remontti " + kuvaus;
	}
}