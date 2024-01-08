package Observer;

public interface Observateur {
    public void update();
}

class VueVehicule implements Observateur{
    private Sujet sj;
    public VueVehicule(Sujet sj){
        this.sj = sj;
        this.sj.ajouter(this);
    }
    public void update(){
        System.out.println("VueVehicule know informed by Sujet that state = " + sj.getEtat());
    }
}
