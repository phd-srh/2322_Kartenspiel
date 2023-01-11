public class Main {
    public static void main(String[] args) {

        Karte k1 = new Karte(8, "grün");
        Karte k2 = new Karte(9, "blau");

        Karte[] kartendeck = { k1, k2 };

        kartendeck[0].ausspielen();
        kartendeck[1].ziehen();
    }
}
