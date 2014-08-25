/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polygon;

/**
 *
 * @author cae
 */
public  class Quadrilateral implements PolygonInterface 
{
    private double quadSide1, quadSide2, quadSide3, quadSide4, diagLength; 
    public Quadrilateral (double quadSide1, double quadSide2, double quadSide3, double quadSide4, double quadLength)
    {
        this.quadSide1 = quadSide1; 
        this.quadSide2 = quadSide2; 
        this.quadSide3 = quadSide3; 
        this.quadSide4 = quadSide4; 
        this.diagLength = diagLength; 
    }
    
    
    
    public double area(){
        double quadArea = (quadSide1 + quadSide2 + quadSide3 + quadSide4 +diagLength);
        return quadArea;
    }
    public double perimeter(){
        double triPerimeter = (quadSide1 + quadSide2 + quadSide3 + quadSide4 +diagLength);
        return triPerimeter;
    }
}
