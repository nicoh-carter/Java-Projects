/*
Author: Nicoh Carter 
Instructor: Dr. Jean Muhammad
Description: This is the final exam class file.
Date: April 26, 2017
*/

import java.util.Random;

public class LuckyNumNicohC
{
   /****PART 1****/
   
   private String name;
   private int guess, randomNum;
   
   public LuckyNumNicohC()
   {
      name = null;
      guess = 0;
   }
   
   public LuckyNumNicohC(String identity, int hypothesis)
   {
      name = identity;
      guess = hypothesis; 
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getGuess()
   {
      return guess;
   }
   
   public void setName(String identity)
   {
      name = identity; 
   }
   
   public void setGuess(int hypothesis)
   {
      guess = hypothesis;
   }
   
   public void calculateRandomNum()
   {
      Random numbers = new Random();
      
      randomNum = numbers.nextInt(401)+100;
      
      if (!(randomNum % 2 == 0))
         randomNum+=5;
      else
         randomNum+=6;
   }
   
   public boolean winLose()
   {
      boolean variable;
      
      if (guess == randomNum)
         variable = true;
      else   
         variable = false;
      
      return variable;
   }
   
   public int needHint()
   {
      int myHint;
      if (guess > randomNum)
         myHint = 1;
      else 
         myHint = 0;
      
      return myHint;   
   }
   
}                     
                   
                            