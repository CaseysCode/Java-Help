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
    
    public double quadArea(Quadrilateral dimensions)
    {
        double quadArea = (quadSide1 * quadSide2);
        System.out.println("The quadrilateral's area is: "+ quadArea);
        return quadArea; 
        
    } 
    public double quadPerimeter(Quadrilateral dimensions)
    {
        double quadPerimeter = (quadSide1 + quadSide2 +quadSide3);
        System.out.println("The quadrilateral's perimeter is: "+quadPerimeter);
        return quadPerimeter;
    }
    
    public double area(double quadArea){
        return quadArea;
    }
    public double perimeter(double triPerimeter){
        return triPerimeter;
    }
}
