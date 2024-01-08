package Tp_Collections.gestionEleves;

import java.util.ArrayList;
import java.lang.*;
import java.util.Comparator;

public class Eleve implements Comparable<Eleve> {
    private String nom;
    private ArrayList<Integer> notes;
    private double moyenne;

    public Eleve(String nom) {
        this.nom = nom;
        moyenne = 0.0;
        notes = new ArrayList<Integer>();
    }

    private void calcMoy() {
        if (!notes.isEmpty()) {
            moyenne = 0.0;  // Reset moyenne to zero
            for (int note : notes) {
                moyenne += note;
            }
            moyenne /= notes.size();
        }
    }

    public double getMoyenne(){
        calcMoy();  // Ensure calcMoy is called before calculating moyenne
        return moyenne;
    }


    public void ajouterNote(int note) {
        notes.add(note);
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Integer> getNotes() {
        return notes;
    }

    public String toString() {
        return ("Nom: " + nom + "\nNotes: " + notes.toString() + "\nMoyenne: " + getMoyenne());
    }

    @Override
    public int compareTo(Eleve o) {
        return Double.compare(this.moyenne, o.getMoyenne());
    }
}

