public class Karte {
    // Bestandteile einer Klasse
    // 1) Attribute / Eigenschaften

    // Prinzip der Kapselung:
    // - alle Attribute müssen "private" sein !!!!!!!
    // - Methoden können (sollen) "public" sein
    private int wert;
    private String farbe;
    private String format = "standard";

    public Karte(int wert, String farbe) {
        this(wert, farbe, "standard");
    }

    public Karte(int wert, String farbe, String format) {
        this.wert = wert;
        this.farbe = farbe;
        this.format = format;
    }

    public int getWert() {
        return this.wert;
    }

    public String getFarbe() {
        return this.farbe;
    }

    public void setFormat(String format) {
        if (!format.equals("standard") &&
                !format.equals("european") &&
                !format.equals("american"))
            return;
        this.format = format;
    }

    // 2) Methoden / Operationen
    public void ziehen() {
        System.out.println("ziehen -> erhalte: " + this.farbe + this.wert);
    }

    public void ausspielen() {
        System.out.println("spiele: " + this.farbe + this.wert);
    }
}
