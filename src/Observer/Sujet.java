package Observer;

import java.util.ArrayList;

public abstract class  Sujet {
    protected ArrayList<Observateur> observateurs = new ArrayList<Observateur>();
    public void ajouter(Observateur ob){
            observateurs.add(ob);
        }
    public void retirer(Observateur ob){
        observateurs.remove(ob);
    }
    public abstract void notifyAllob();


    public abstract int getEtat();

    public abstract void setEtat(int i);
}
class Vehicule extends Sujet{
    private int etat;
    public int getEtat(){
        return etat;
    }
    public void setEtat(int etat){
        this.etat = etat;
        notifyAllob();
    }
    public void notifyAllob(){
        for (Observateur observer : observateurs){
            observer.update();
        }
    }
}
