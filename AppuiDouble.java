/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;

/**
 *
 * @author pop
 */
public class AppuiDouble extends Appui{
    
    private Color couleur;
    
    //Constructeur
    public AppuiDouble(int idNoeud, int idTriangle, int sommetDebut, double position) {
        super(idNoeud, idTriangle, sommetDebut, position);
        this.couleur=Color.yellow;
    }
    
    //Affichage
     @Override
    public String toString() {
        return "AppuiDouble ; " + super.idNoeud +" ; "+ super.idTriangle +" ; "+ super.sommetDebut +" ; "+ super.position;
    }
    
}
