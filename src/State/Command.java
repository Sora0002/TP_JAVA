package State;

public class Command {
    protected EtatCommand etat;

    public Command(){
        etat = new EtatEncour(this);
    }

    public EtatCommand getEtat() {
        return etat;
    }

    public void setEtat(EtatCommand etat) {
        this.etat = etat;
    }
    public void ClickSubmit(){
        etat.handle();
    }
    public void ajouter(){
        etat.ajouter();
    }
    public void effacer(){
        etat.effacer();
    }

}
