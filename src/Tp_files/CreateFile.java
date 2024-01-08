package Tp_files;

import java.io.*;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Nom du fichier a creer: ");
            String nomf = sc.nextLine();
            DataOutputStream fileoutput = new DataOutputStream(new FileOutputStream(nomf));
            int a = 1;
            while(true){
                System.out.println("Nom " + a + ": ");
                String nom = sc.nextLine();
                if(nom == null || nom.trim().isEmpty())
                    break;
                System.out.println("Prenom: ");
                String prenom = sc.nextLine();
                System.out.println("Annee: ");
                int annee = sc.nextInt();
                sc.nextLine();
                char[] chnom = new char[20];
                char[] chprenom = new char[20];
                for (int i = 0; i < 20; i++) {
                    chprenom[i] = ' ';
                    chnom[i] = ' ';
                }
                for (int i = 0; i < nom.length() && i < 20; i++) {
                    chnom[i] = nom.charAt(i);
                }
                for (int i = 0; i < prenom.length() && i < 20; i++)
                    chprenom[i] = prenom.charAt(i);
                for (int i = 0; i < 20; i++) {
                    fileoutput.writeChar(chnom[i]);
                }
                for (int i = 0; i < 20; i++) {
                    fileoutput.writeChar(chprenom[i]);
                }
                fileoutput.writeInt(annee);
                a++;
            }
            System.out.println("**** Fin création fichier ****");
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
