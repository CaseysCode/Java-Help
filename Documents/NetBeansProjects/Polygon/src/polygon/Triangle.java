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
public class Triangle implements PolygonInterface 
{
    private double TriSide1, TriSide2, TriSide3, triangleHeight; 
    public Triangle (double TriSide1, double TriSide2, double TriSide3, double triangleHeight)
    {
        this.TriSide1 = TriSide1; 
        this.TriSide2 = TriSide2; 
        this.TriSide3 = TriSide3; 
        this.triangleHeight = triangleHeight; 
    }
    
    public double triangleArea(Triangle dimensions)
    {
        double triArea = 0.5 * (TriSide1 * triangleHeight);
        System.out.println("The triangle's area is: "+ triArea);
        return triArea; 
        
    } 
    public double trianglePerimeter(Triangle dimensions)
    {
        double triPerimeter = (TriSide1 + TriSide2 +TriSide3);
        System.out.println("The triangle's perimeter is: "+triPerimeter);
        return triPerimeter;
    }
    
    public double area(double triArea){
        return triArea;
    }
    public double perimeter(double triPerimeter){
        return triPerimeter;
    }

}
