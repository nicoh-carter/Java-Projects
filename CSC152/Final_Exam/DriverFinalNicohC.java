/*
Program Name: DriverFinalNicohC
Author: Nicoh Carter
Instructor: Dr. Jean Muhammad
Description: Final Exam
Date: April 26, 2017
*/

import java.util.Scanner;
import java.io.*;

public class DriverFinalNicohC
{
   public static void main(String[] args) throws IOException
   {
      /****PART II****/
      
      Scanner keyboard = new Scanner(System.in);
      
      //Game of Choice
      boolean win;
      String name;
      int myGuess;
      int hintNum;
      
      System.out.println("WELCOME TO NICOH'S GAME OF CHANCE!");
      System.out.println("Enter your name and lucky number to see if you win!");
      System.out.println("The prize is 500 dollars!");
      
      System.out.println("Enter your name now: ");
      name = keyboard.nextLine();
      
      keyboard.nextLine(); // buffer
      
      System.out.println("Enter a lucky number between 100 and 500: ");
      myGuess = keyboard.nextInt();
      
      LuckyNumNicohC NCObj1 = new LuckyNumNicohC(name, myGuess);
      NCObj1.calculateRandomNum();
      
      LuckyNumNicohC NCObj2 = new LuckyNumNicohC();
      NCObj2.setName(name);
      NCObj2.setGuess(myGuess);
      NCObj2.calculateRandomNum();
      
      //Loop Game of Choice
     
      do
      {
         win = NCObj1.winLose();
         hintNum = NCObj1.needHint();
         
         if (win == true)
            System.out.println("You have won 500 dollars!");
         else if (hintNum == 1)
            {
               System.out.println("You did not win. Do you want to guess again?\n" + 
               "If so, enter another number; if not enter -1. This time guess lower.");
               myGuess = keyboard.nextInt();
            }
         else
            {
               System.out.println("You did not win. Do you want to guess again?\n" +
               "If so, enter another number; if not enter -1. This time guess higher.");
               myGuess = keyboard.nextInt();
            }
            
         if(myGuess != -1)
            NCObj1.setGuess(myGuess);
         
                     
      }while((win != true) && (myGuess != -1));
      
      //***End Loop Game of Choice***
      
      
      /****PART III****/
      
      //validation loop                     
      System.out.println("\nEnter a number between 20 and 60: ");
      int userGuess = keyboard.nextInt();
      
      while(userGuess <= 20 || userGuess >= 60)
         {
            System.out.println("Please try again! Your number is not in between 20 and 60!");
            System.out.println("Enter a number between 20 and 60: ");
            userGuess = keyboard.nextInt();
         }
         
      //number loop
      for (int numLoop = 100; numLoop >= 0; numLoop--)
      {
         if (numLoop % 3 == 0)
            System.out.println(numLoop);
      }
      
      keyboard.nextLine(); //buffer
      
      //Write to a file
      PrintWriter outputFile = new PrintWriter("stringListNC.txt");
      
      System.out.println("Enter 3 names: ");
      String string1 = keyboard.nextLine();
      String string2 = keyboard.nextLine();
      String string3 = keyboard.nextLine();
            
      System.out.println(string1 + ", " + string2 + ", " + string3);
      
      outputFile.println(string1 + ", " + string2 + ", " + string3);
      
      char letter1 = string1.charAt(0);
      char letter2 = string2.charAt(0);
      char letter3 = string3.charAt(0);
      
      if (letter1 == letter2 && letter1 == letter3)
         {
            System.out.println("All strings begin with the same character!");
            outputFile.println("All strings begin with the same character!");
         }
      else
         {
            System.out.println("All strings do not begin with the same character!");
            outputFile.println("All strings do not begin with the same character!");
         }
      
      outputFile.close();   
      
   }
}            
                  
      
                 
      
      
      