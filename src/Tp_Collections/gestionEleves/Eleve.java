package Tp_Collections.gestionEleves;

import java.util.ArrayList;
import java.lang.*;
import java.util.Comparator;

public class Eleve implements Comparable<Eleve> {
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

    @Override
    public int compareTo(Eleve o) {
        if (this.moyenne < o.getMoyenne()){
            return -1;
        }
        else if(this.moyenne > o.getMoyenne()){
            return 1;
        }
        return 0;
    }
}
