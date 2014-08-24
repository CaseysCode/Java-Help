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
public abstract class Triangle implements PolygonInterface 
{
    double area; 
    double b = 1; double h = 2;
    double areaCalcVariable = 0.5;
    
    void area(double triangleDimension1, double triangleHeight) 
    {
         
        area = areaCalcVariable * (triangleDimension1 * triangleHeight);
    }
    void perimeter(int newPerimeter)
    {
        
    }
}
