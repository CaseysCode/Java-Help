/**
* Class Name: Greeter Tester
* Author: Casey Lee
* Class Description: contains a Greeter object of String type
* and contains a swapNames method which accepts greeter objects and outputs
* the new and old names and swaps them
*/

package greeter;

/**
 *
 * @author Casey Lee
 */
public class Greeter
{
   //property of each greeter object 
   private String name;
   
   
   //greeter constructor
   public Greeter ( String name)
   {  
      this.name = name;
       
   }
   //method to accept greeter objects and print name accordingly
   void swapNames(Greeter other)
   {
       
       System.out.println("Hi, my name is: " +name);
       
       //if sctructure to handle swapping of names, prints name and appropriate message accordingly
       if(name.equals ("Joe Johnston "))
       {
           System.out.println("Hi, my new name is: Bill Billson ");
       }
       else if(name.equals ("Bill Billson "))
       {
           System.out.println("Hi, my new name is: Joe Johnston ");
       }
       
   }
}
    
    

