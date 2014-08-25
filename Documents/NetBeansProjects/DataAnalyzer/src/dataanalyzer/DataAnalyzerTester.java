/**
 * Class name: DataAnalyzerTester
 * Author: Casey Lee
 * Description: Prompts user to input a file name and contains a while loop to 
 * catch if it is a correct file name and continue to prompt for file name until 
 * a correct one is entered. Stores the input file name as an object
 */

package dataanalyzer;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Casey Lee
 */
public class DataAnalyzerTester 
{
   
     public static void main(String[] args) 
         {
             boolean correctFileName = false;
             Scanner simpleTextFile = null;
             FileReader infile;
             
             Scanner input = new Scanner(System.in);
             System.out.println("Please enter the file name: ");
             String fileName = input.nextLine();
             
             while (!correctFileName)
             {
                 try
                 {
                     infile = new FileReader(fileName);
                     simpleTextFile = new Scanner(infile);
                     correctFileName = true;
                 }
                 catch (IOException e)
                 {
                     System.out.println("Not a correct file name. Please input a valid file name.");
                     fileName = input.nextLine();
                 }
             }
             
          DataAnalyzer file = new DataAnalyzer (simpleTextFile);
          file.FileReaderCalculator(file);
          
         }
}
   
    

