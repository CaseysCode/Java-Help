/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polygon;

import java.util.Scanner;

/**
 *
 * @author cae
 */
public class PolygonTester 
{
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println ("Polygon Types: ");
	System.out.println  (" 1 - TRIANGLE" );
	System.out.println  (" 2 - QUADRILATERAL" );
	System.out.println  (" 3 - ISOCELES TRIANGLE" );
	System.out.println  (" 4 - RECTANGLE" );
	System.out.println  (" 5 - SQUARE") ;
	System.out.println  ("Enter 1 - 5 for polygon type: ");
        int PolygonChoice = input.nextInt();
       
        
        String PolygonString;
        switch (PolygonChoice) {
            case 1:  PolygonString = "Triangle";
                     break;
            case 2:  PolygonString = "Quadrilateral";
                     break;
            case 3:  PolygonString = "Isoceles Triangle";
                     break;
            case 4:  PolygonString = "Rectangle";
                     break;
            case 5:  PolygonString = "Square";
                     break;
            default: PolygonString = "Invalid choice";
                     break;
        }
        
        double triangleDimension1;
        
        if (PolygonString.equals ("Triangle"))
        {
            System.out.println("Enter triangle side 1 length: ");
            triangleDimension1 = input.nextDouble();
            System.out.println("Enter triangle side 2 length: ");
            double triangleDimension2 = input.nextDouble();
            System.out.println("Enter triangle side 3 length: ");
            double triangleDimension3 = input.nextDouble();
            System.out.println("Enter triangle height: ");
            double triangleHeight = input.nextDouble();
            
        }
        
    }
}
