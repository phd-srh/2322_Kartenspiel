public class Aussetzkarte extends Karte {

    public Aussetzkarte(String farbe) {
        super(0, farbe);
    }

    public void aussetzen() {
        System.out.println("Nächster Spieler muss aussetzen!");
    }

    @Override
    public void ausspielen() {
        super.ausspielen();
        aussetzen();
    }
}
