/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polygon;

import java.util.Scanner;

/**
 * Polygon Tester allows user to input type of Polygon and outputs their area and perimeter
 * @author cae
 */
public class PolygonTester  
{
    public static void main(String[] args) 
    {
        /**
         * @param 
         */
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
        
        
        if (PolygonString.equals ("Triangle"))
        {
            System.out.println("Enter triangle side 1 length: ");
            double triangleDimension1 = input.nextDouble();
            System.out.println("Enter triangle side 2 length: ");
            double triangleDimension2 = input.nextDouble();
            System.out.println("Enter triangle side 3 length: ");
            double triangleDimension3 = input.nextDouble();
            System.out.println("Enter triangle height: ");
            double triangleHeight = input.nextDouble();   
            
            Triangle Dimensions = new Triangle(triangleDimension1, triangleDimension2, triangleDimension3, triangleHeight );
            System.out.println("Area of the triangle is: "+Dimensions.area());
            System.out.println("Area of the triangle is: "+Dimensions.perimeter());
            
            
            //Triangle Dimensions = new Triangle(triangleDimension1, triangleDimension2, triangleDimension3, triangleHeight );
            
           // Dimensions.triangleArea(Dimensions);
            
           // Dimensions.trianglePerimeter(Dimensions);
 
        }
        else if (PolygonString.equals ("Quadrilateral"))
        {
            System.out.println("Enter quadrilateral side 1 length: ");
            double quadDimension1 = input.nextDouble();
            System.out.println("Enter quadrilateral side 2 length: ");
            double quadDimension2 = input.nextDouble();
            System.out.println("Enter quadrilateral side 3 length: ");
            double quadDimension3 = input.nextDouble();
            System.out.println("Enter quadrilateral side 4 length: ");
            double quadDimension4 = input.nextDouble();
            System.out.println("Enter quadrilateral diagonal length:");
            double diagLength = input.nextDouble();
            
            Quadrilateral Dimensions = new Quadrilateral(quadDimension1, quadDimension2, quadDimension3, quadDimension4, diagLength );
            System.out.println("Area of the triangle is: "+Dimensions.area());
            System.out.println("Area of the triangle is: "+Dimensions.perimeter());
        }
    }
    
}
