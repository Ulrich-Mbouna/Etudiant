/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

/**
 *
 * @author fany
 */
public class Filiere {
    
    //attributs 
    private int id;
    private String code;
    private String libele; 
    private static int count;
    //methode
    public Filiere(String code,String libele) {
        this.id = ++count;
        this.code = code;
        this.libele = libele;
    }
    //acceseur
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
                
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getLibele() {
        return libele;
    }
    public void setLibele (String libele)  {
        this.libele = libele;
    }
    
    
    
    public String toString() {
        return "\tFiliere : " + this.libele;
    }
}
