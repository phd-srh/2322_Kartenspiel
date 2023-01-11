public class Karte {
    // Bestandteile einer Klasse
    // 1) Attribute / Eigenschaften

    public int wert;
    public String farbe;
    public String format = "standard";

    // 2) Methoden / Operationen
    public void ziehen() {
        System.out.println("ziehen");
    }

    public void ausspielen() {
        System.out.println("spiele: " + farbe + wert);
    }
}
