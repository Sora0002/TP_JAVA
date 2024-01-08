package Observer;

public class Main {
    public static void main(String[] args) {
        Sujet sj = new Vehicule();
        new VueVehicule(sj);
        sj.setEtat(4);
        sj.setEtat(5);
    }
}
