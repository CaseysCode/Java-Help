/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    
package dataanalyzer;

import java.util.Scanner;

/**
 *
 * @author cae
 */
public class DataAnalyzer 
{
      private Scanner simpleTextFile;

      public DataAnalyzer ( Scanner simpleTextFile)
      {  
      this.simpleTextFile = simpleTextFile;
      }
   
      void FileReaderCalculator(DataAnalyzer other ) //initially other was SimpleTextFile
      {
          int currentNum;
          int sum = 0;
          int numberCount=0;
          int min=Integer.MAX_VALUE;
          int max=Integer.MIN_VALUE;
          
          while (simpleTextFile.hasNextInt())
          {
              
              currentNum = simpleTextFile.nextInt();
              if(currentNum < min)
              {
              min= currentNum;
              }
              if(currentNum > max)
              {
              max = currentNum; 
              }
              sum+=currentNum;
              numberCount++;
          }
          System.out.println("The average of the numbers is: " + ((double) sum)/numberCount);
          System.out.println("The minimum number is: "+min);
          System.out.println("The maximum number is: "+max);
      }
}


    