/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pop
 */
public class Segment {
    private Point point1;
    private Point point2;
    //longueur à rajoutter?
    
    //Constructeur
    public Segment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    
    // Getter et setter
    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    //Affichage
    @Override
    public String toString() {
        return "Segment["  + point1 + "," + point2 + ']';
    }
  
    
    
    
    
    
}
