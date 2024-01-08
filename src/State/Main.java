package State;

public class Main {
    public static void main(String[] args) {
        Command c = new Command();
        System.out.println("Current stat: " + c.getEtat());
        c.ajouter();
        c.ClickSubmit();
        System.out.println("Current stat: " + c.getEtat());
        c.ajouter();
        c.ClickSubmit();
        System.out.println("Current stat: " + c.getEtat());
        c.ajouter();

    }
}
