package set_13_objects;

public class Agentti {

    private String etunimi;
    private String sukunimi;

    public Agentti(String etunimi, String sukunimi) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
    }

    // @Override //not sure if this is needed
    public String toString() {
        return "My name is " + sukunimi + ", " + etunimi + " " + sukunimi;
    }
}