public class Main {
    public static void main(String[] args) {

        Karte k1 = new Karte(8, "grün");
        Karte k2 = new Karte(9, "blau");

        Karte[] kartendeck = { k1, k2 };

//        k1.farbe = "rot";   // <- das soll nicht möglich sein!
        // aber
        System.out.println("k1 hat die Farbe: " + k1.getFarbe());
        kartendeck[0].ausspielen();
        kartendeck[1].ziehen();
    }
}
