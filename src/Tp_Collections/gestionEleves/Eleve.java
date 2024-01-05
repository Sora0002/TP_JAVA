package Tp_Collections.gestionEleves;

import java.util.ArrayList;

public class Eleve {
    private String nom;
    private ArrayList<Integer> notes;
    private double moyenne;

    public Eleve(String nom){
        this.nom = nom;
        moyenne = 0.0;
        notes = new ArrayList<Integer>();
    }
    private void calcMoy(){
        if (!notes.isEmpty()){
            int i = 0;
            while (i < notes.size()){
                moyenne += notes.get(i);
                System.out.println(moyenne + "\n");
                i++;
            }
            moyenne /= notes.size();
        }
    }
    public double getMoyenne(){
        calcMoy();
        return (moyenne);

    }
    public void ajouterNote(int note){
        notes.add(note);
    }
    public String getNom(){
        return nom;
    }
    public  ArrayList<Integer> getNotes(){
        return notes;
    }

    public String toString(){
        return ("Nom: " + nom +  "\nNotes: " + notes.toString() + "\nMoyenne: " + getMoyenne());
    }
}
