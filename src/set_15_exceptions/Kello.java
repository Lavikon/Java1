package set_15_exceptions;

public class Kello {
    private int tunnit;
    private int minuutit;

    public Kello(int tunnit, int minuutit) {
        if (tunnit >= 0 && tunnit <= 23 && minuutit >= 0 && minuutit <= 59) {
            this.tunnit = tunnit;
            this.minuutit = minuutit;
        } else {
            throw new IllegalArgumentException("Virheellinen kellonaika");
        }
    }

    public int getTunnit() {
        return tunnit;
    }

    public void setTunnit(int tunnit) {
        if (tunnit >= 0 && tunnit <= 23) {
            this.tunnit = tunnit;
        } else {
            throw new IllegalArgumentException("Virheellinen kellonaika");
        }
    }

    public int getMinuutit() {
        return minuutit;
    }

    public void setMinuutit(int minuutit) {
        if (minuutit >= 0 && minuutit <= 59) {
            this.minuutit = minuutit;
        } else {
            throw new IllegalArgumentException("Virheellinen kellonaika");
        }
    }

    public void lisaaMinuutit(int mins) {
        if ((this.minuutit + mins) >= 60) {
            tunnit++;
            if (this.tunnit == 24) {
                this.tunnit = 0;
            }
            this.minuutit = (this.minuutit - 60) + mins;
        } else {
            this.minuutit += mins;
        }
    }

    @Override
    public String toString() {
        String out = "";
        if (minuutit < 10) {
            out = tunnit + ":0" + String.valueOf(minuutit);
        } else {
            out = String.valueOf(tunnit) + ":" + String.valueOf(minuutit);
        }
        return out;
    }
}