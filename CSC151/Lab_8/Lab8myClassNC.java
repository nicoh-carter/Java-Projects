/*Name: Nicoh Carter
ID: 00408527
Major: CSC
Lab Date & Time: 3/29/2017 1 pm
*/

import java.util.Scanner;

public class Lab8myClassNC
{
   //declaring instance fields
   private int minutes;
   private double cost;
   private String packageLetter;
   
   //importing scanner
   Scanner keyboard = new Scanner(System.in);
   
   //no argument constructor
   public Lab8myClassNC()
   {
      minutes = 0;
      cost = 0.0;
      packageLetter = null;
   }
   
   //constructor with args
   public Lab8myClassNC (String serviceLetter, int time)
   {
      packageLetter = serviceLetter;
      minutes = time; 
   }
   
   //mutator methods
   public void setPackageLetter(String letter)
   {
      packageLetter = letter;
   }
                    
   public void setMinutes(int talkTime)
   {
      minutes = talkTime;
   }
   
   //accessor methods
   public int getMinutes()
   {  
      return minutes;
   }
   
   public String getPackageLetter()
   {
      return packageLetter;
   }
   
   //calculated method   
   public double calcTotalCost()
   {
      switch(packageLetter)
         {    
            case "A":
            case "a":
               {
                  if (minutes > 450)
                     {
                        cost = 39.99 + (.45 * (minutes - 450));
                     }   
                  else 
                     {
                        cost = 39.99;
                     }   
               }
            break;         
            case "B":
            case "b":
               {
                  if (minutes > 900)
                     {
                        cost = 59.99 + (.40 * (minutes - 900));
                     }
                  else
                     {
                        cost = 59.99;
                     }
               }
            break;   
            case "C":
            case "c":
               {
                  cost = 69.99;
               }
            break; 
            default:
               {
                  System.out.println("You entered the wrong letter. System is exiting....");
                  System.exit(0);
               }
            break;
         }                                       
      return cost;
   }
         
}   