/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pop
 */
public class TypeBarre {
    private int idBarre;
    private double cout;
    private double lmin;
    private double lmax;
    private double maxTension;
    private double maxCompression;
    
    
    //Constructeur

    public TypeBarre(int idBarre, double cout, double lmin, double lmax, double maxTension, double maxCompression) {
        this.idBarre = idBarre;
        this.cout = cout;
        this.lmin = lmin;
        this.lmax = lmax;
        this.maxTension = maxTension;
        this.maxCompression = maxCompression;
    }
    
    //getter et setter

    public int getIdBarre() {
        return idBarre;
    }

    public void setIdBarre(int idBarre) {
        this.idBarre = idBarre;
    }

    public double getCout() {
        return cout;
    }

    public void setCout(double cout) {
        this.cout = cout;
    }

    public double getLmin() {
        return lmin;
    }

    public void setLmin(double lmin) {
        this.lmin = lmin;
    }

    public double getLmax() {
        return lmax;
    }

    public void setLmax(double lmax) {
        this.lmax = lmax;
    }

    public double getMaxTension() {
        return maxTension;
    }

    public void setMaxTension(double maxTension) {
        this.maxTension = maxTension;
    }

    public double getMaxCompression() {
        return maxCompression;
    }

    public void setMaxCompression(double maxCompression) {
        this.maxCompression = maxCompression;
    }
    
    
    
    //Affichage

    @Override
    public String toString() {
        return "TypeBarre ; " + idBarre + " ; " + cout + " ; " + lmin + " ; " + lmax + " ; " + maxTension + " ; " + maxCompression;
    }
    
            
}
