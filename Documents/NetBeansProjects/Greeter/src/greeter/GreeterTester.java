/**
* Class Name: Greeter Tester
* Author: Casey Lee
* Class Description: creates and initializes two greeter objects with different string names, 
* class and passes greeter objects to swapNames method in greeter class which swaps the names and outputs old 
* names and new names
*/

package greeter;

public class GreeterTester 
{
    
    
    public static void main(String[] args) 
    {
     
     //greeter objects
     Greeter Joe = new Greeter( "Joe Johnston " );
     Greeter Bill = new Greeter( "Bill Billson " );
      
     //call method swapNames by passing greeter objects 
      Joe.swapNames(Joe);
      Bill.swapNames(Bill);
        
    }
}
