package set_13_objects;

public class VahenevaLaskuri {
    private int arvo;   // oliomuuttuja joka muistaa laskurin arvon

    public VahenevaLaskuri(int arvoAlussa) {
        this.arvo = arvoAlussa;
    }

    public void tulostaArvo() {
        System.out.println("arvo: " + this.arvo);
    }

    public void vahene() {
        if (this.arvo == 0) {
        	this.arvo = 0;
        } else {
        	this.arvo--;
        }				
    }
    // ja tänne muut metodit
    public void nollaa() {
    	this.arvo = 0;
    }
}