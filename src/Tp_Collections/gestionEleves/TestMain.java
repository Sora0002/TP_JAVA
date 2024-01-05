package Tp_Collections.gestionEleves;

public class TestMain {
    public static void main(String[] args) {
        Eleve E = new Eleve("Bouferdou");
        E.ajouterNote(14);
        E.ajouterNote(10);
        E.ajouterNote(14);
        E.ajouterNote(14);
        System.out.println("Eleve1:\n " + E);
    }
}
