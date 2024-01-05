package Tp_Collections.gestionEleves;

public class TestMain {
    public static void main(String[] args) {
        GroupeEleves ge = new GroupeEleves();
        Eleve E = new Eleve("Bouferdou Azze-el arab");
        E.ajouterNote(14);
        E.ajouterNote(10);
        E.ajouterNote(14);
        E.ajouterNote(14);
        Eleve E2 = new Eleve("Nai Sora");
        E2.ajouterNote(14);
        E2.ajouterNote(14);
        E2.ajouterNote(14);
        E2.ajouterNote(14);
        ge.ajouterEleve(E);
        ge.ajouterEleve(E2);
        ge.lister();

        int comparisonResult = E.compareTo(E2);
        System.out.println("+++++++++++++++++++++++++++++++\n");
        if (comparisonResult < 0) {
            System.out.println(E.getNom() + " is smaller than " + E2.getNom());
        } else if (comparisonResult > 0) {
            System.out.println(E + " is greater than " + E2);
        } else {
            System.out.println(E + " is equal to " + 2);
        }

    }
}
