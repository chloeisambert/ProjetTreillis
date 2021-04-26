/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pop
 */
public class AppuiDouble extends Appui{
    
    //Constructeur
    public AppuiDouble(int idNoeud, int idTriangle, int sommetDebut, double position) {
        super(idNoeud, idTriangle, sommetDebut, position);
    }
    
    //Affichage
     @Override
    public String toString() {
        return "AppuiDouble ; " + super.idNoeud +" ; "+ super.idTriangle +" ; "+ super.sommetDebut +" ; "+ super.position;
    }
    
}
