/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

import java.util.*;
import java.lang.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author fany
 */
public class Etudiant {
     //Attributs
    private int  id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private Filiere filiere;
    
    private static int count;
    
    //methodes
    public Etudiant(String nom,String prenom,Date dateNaissance,Filiere filiere) {
        
        this.id = ++count ;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.filiere = filiere;
}
    //getters
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public Date getDATE(){
        return dateNaissance;
    }
    public Filiere getFiliere ()  {
        return filiere;
    }
    
   
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
         return " Je suis l'Etudiant " + this.nom +
                              " ma date de naissance est : " + sdf.format(this.dateNaissance) ;
    }
    
   
}
