public class Main {
    public static void main(String[] args) {

        Karte k1 = new Karte(8, "grün");
        Karte k2 = new Karte(9, "blau");
        Aussetzkarte a1 = new Aussetzkarte("gelb");

        k2.ausspielen();
        a1.ausspielen();
        a1.aussetzen();
    }
}
