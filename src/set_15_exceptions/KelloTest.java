package set_15_exceptions;

public class KelloTest {
    public static void main(String[] args) {

        Kello kello = new Kello(22, 12);
        System.out.println(kello);
        
        //kello.setTunnit(60);
        
        kello.lisaaMinuutit(40);
        System.out.println(kello);

        kello.lisaaMinuutit(29);
        System.out.println(kello);

        kello.lisaaMinuutit(45);
        System.out.println(kello);
    }
}