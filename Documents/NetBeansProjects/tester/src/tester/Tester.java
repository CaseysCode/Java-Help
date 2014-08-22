/*
 * Author: Casey Lee
 * Program Name: EvenAndOdd
 * Date: 11/3/12
 * Description: This program calculates: The sum of all even numbers between 2 and 100, The sum of all squares between 1 and 100, all powers of 2 from 2^0 to 2^20, The sum of all odd numbers between a and b, where a and b are inputs, and the sum of all odd digits of an input. 
 */
package tester;

//import java utility: Scanner
import java.util.Scanner; 

public class Tester 
{
     public static void main(String[] args)
    {   //declare variables 
        double sum = 0; double sumsq =0; 
        int nextPowerTwo = 1; int exponent = 0;  
        int a, b, odd, z, n; 
        
        //for loop to get even numbers 
        for (double i=0; i<=100; i = i + 2) 
        {  //calculation for additon of even numbers
             sum += i; 
          
        } System.out.println("The sum of all even numbers between 2 and 100 = "+sum); // output sum
        for (double i = 0; i <=100; i++) // for loop to get numbers between 1 and 100
        {      // calculation to get the sum of squares 
               sum = 0;
               sumsq = sumsq + Math.pow(i, 2);
               sum += sumsq;
               
        } System.out.println("The sum of all the squares between 1 and 100 = "+sum); //output sum
        
        while (exponent <= 20) //while loop with condition to stop calculation at 2^20
        {
           System.out.println("Powers from 2^0 to 2^20 = "+nextPowerTwo);  //output sum
           nextPowerTwo = nextPowerTwo * 2; //calculation to get powers of 2
           exponent++; //add one to expontent to get the next power of two 
        }
            //declare scanner object
            Scanner in = new Scanner(System.in);
            //prompt for value of a
            System.out.print("Enter a value for a: ");
            //input from keyboard for a
            a = in.nextInt(); 
            //prompt for value for b
            System.out.print("Enter a value for b: ");
            //input from keyboard for b
            b = in.nextInt();
            //set sum to 0
            sum = 0; 
            // for loop to get values between 'a' and 'b' and start count for x
            for(int x=a; x<=b; x++) 
            {   // if statement to get odd values only
                if(x%2 > 0)
            {   // calculation to get sum of odd values between the inputs
                sum += x;
            }
            }
            
          System.out.println("The sum of the odd numbers between a and b is: "+sum); // output sum
          
          System.out.print("Enter a number: "); //prompt for input 
          //input from keyboard for number
          n = in.nextInt(); 
          //set odd to 0
          odd = 0;
          //while loop with condition to test if n is not equal to zero
          while (n != 0)
          {   // calculation to get digits
              z=n%10;
              // if statement to isolate odd digits
              if(z % 2 > 0)
              { 
                odd=odd+z;  //calculation tp adding the odd digits
              }
              n = n/10; // calculation to getting rid of the digits
          }
          System.out.println("The sum of the odd digits of the number is: "+odd); //output sum of odd digits
            
    }
   
}




