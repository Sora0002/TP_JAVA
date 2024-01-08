package Tp_Collections.gestionEleves;

import java.util.*;

public class GroupeEleves {
    private ArrayList<Eleve> listeEleves;
    public int nombre(){
        return listeEleves.size();
    }
    public ArrayList<Eleve> getListeEleves(){
        return listeEleves;
    }
    public void ajouterEleve(Eleve eleve){
        if (listeEleves == null)
            listeEleves = new ArrayList<Eleve>();
        listeEleves.add(eleve);
    }
    public Eleve chercher(String nom){
        Iterator<Eleve> iterator = listeEleves.iterator();
        while (iterator.hasNext()){
            Eleve eleve = iterator.next();
            if (eleve != null && eleve.getNom().equals(nom)){
                return eleve;
            }
        }
        return null;
    }
    public void lister(){
        Iterator<Eleve> iterator = listeEleves.iterator();
        while(iterator.hasNext()){
            Eleve eleve = iterator.next();
            System.out.println(eleve + "\n");
        }
    }
    public Eleve meilleurEleve(){
        if (listeEleves != null && !listeEleves.isEmpty())
            return Collections.max(listeEleves);
        return null;
    }
    public void trierEleves(){
        if (listeEleves != null && !listeEleves.isEmpty())
              Collections.sort(listeEleves);
    }
}
