/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataanalyzer;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author cae
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
   
    

