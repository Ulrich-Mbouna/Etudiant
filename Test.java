/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import ma.projet.classes.Etudiant;
import ma.projet.classes.Filiere;

/**
 *
 * @author fany
 */
public class Test {
    public static void main(String[] args) {
        Filiere tabFi[] = new Filiere[3];
        tabFi[0] = new Filiere("MATHS 301", "Topologie Generale");
        tabFi[1] = new Filiere("MATHS 305", "Algèbre");
        tabFi[2] = new Filiere("MATHS 303", "Mesure");
        
        
        System.out.println(" La liste des Filières de notre écoles : " );
           for(Filiere f : tabFi)
               System.out.println(f);
           
        Etudiant[] tabEt = new Etudiant[5];
        tabEt[0] = new Etudiant("Mbouna","Ulrich", new Date("1997/05/23"),tabFi[0]);
        tabEt[1] = new Etudiant("Fopa","Jordan", new Date("1998/06/27"),tabFi[1]);
        tabEt[2] = new Etudiant("Tano","Fany", new Date("1995/01/29"),tabFi[2]);
        tabEt[3] = new Etudiant("Omgba","Michel", new Date("1997/09/07"),tabFi[0]);
        tabEt[4] = new Etudiant("ALma","Paul", new Date("1996/03/01"),tabFi[2]);
        
        System.out.println(" Listes des Etudiants par filières : ");
        for(Filiere f : tabFi){
            System.out.println(f);
            for(Etudiant e : tabEt) {
                if(e.getFiliere().getId()==f.getId()){
                    System.out.println("\t\t" + e);
                }
            }       
    }
}
}