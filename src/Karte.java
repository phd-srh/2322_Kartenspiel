public class Karte {
    // Bestandteile einer Klasse
    // 1) Attribute / Eigenschaften

    public int wert;
    public String farbe;
    public String format = "standard";

    public Karte() {
        this(0);
        System.out.println("Neue Karte");
    }

    public Karte(int wert) {
        this(wert, "schwarz");
    }

    public Karte(int wert, String farbe) {
        this(wert, farbe, "standard");
    }

    public Karte(int wert, String farbe, String format) {
        this.wert = wert;
        this.farbe = farbe;
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
