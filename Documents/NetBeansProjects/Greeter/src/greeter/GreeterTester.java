/*
 What the program is supposed to do:  "Write a method void swapNames(Greeter other) of the Greeter class that swaps the names of this greeter and another. 
Create two objects in the GreeterTester class and use the swapNames method to swap their names. You need to print their old names and their new names."
 */
/*
What the program does: creates and initilizes two greeter strings with different names, 
uses a "greeter" constrctor to handle new name/old name and a swapNames void method that accepts strings and prints message and name accordingly
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
