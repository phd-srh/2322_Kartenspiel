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

    public Karte(int neuWert) {
        this(neuWert, "schwarz");
    }

    public Karte(int neuWert, String neuFarbe) {
        this(neuWert, neuFarbe, "standard");
    }

    public Karte(int neuWert, String neuFarbe, String neuFormat) {
        wert = neuWert;
        farbe = neuFarbe;
        format = neuFormat;
    }

    // 2) Methoden / Operationen
    public void ziehen() {
        System.out.println("ziehen -> erhalte: " + farbe + wert);
    }

    public void ausspielen() {
        System.out.println("spiele: " + farbe + wert);
    }
}
