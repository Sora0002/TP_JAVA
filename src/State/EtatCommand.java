package State;

public abstract class  EtatCommand {
    protected Command c;
    public EtatCommand(Command c){
        this.c = c;
    }
    public abstract void handle();
    public abstract void ajouter();
    public abstract void effacer();
}
 class EtatEncour extends EtatCommand{

     public EtatEncour(Command command) {
         super(command);
     }

     @Override
     public void handle() {
         System.out.println("Switch to valid \n");
         c.setEtat(new EtatValider(c));
     }

     @Override
     public void ajouter() {
         System.out.println("added \n");
     }

     @Override
     public void effacer() {
         System.out.println("effacer \n");
     }
     @Override
     public String toString() {
         return "Encour";
     }
 }

 class EtatValider extends EtatCommand{

     public EtatValider(Command c) {
         super(c);
     }

     @Override
     public void handle() {
         System.out.println("Switch to livree \n");
         c.setEtat(new EtatLivre(c));
     }

     @Override
     public void ajouter() {
         System.out.println("can't \n");

     }

     @Override
     public void effacer() {
         System.out.println("can't \n");

     }
     @Override
     public String toString() {
         return "valider";
     }
 }

 class EtatLivre extends EtatCommand{
     public EtatLivre(Command c) {
         super(c);
     }

     @Override
     public void handle() {
         System.out.println("Can't switch \n");
     }

     @Override
     public void ajouter() {
         System.out.println("can't \n");

     }

     @Override
     public void effacer() {
         System.out.println("can't \n");

     }

     @Override
     public String toString() {
         return "livree";
     }
 }