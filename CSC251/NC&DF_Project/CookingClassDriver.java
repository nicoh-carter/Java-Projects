// Name: Nicoh Carter
// ID: 00408527
// Major: Computer Science
// CSC 251-02
// Date: November 8, 2018

//Nicoh Carter and D'Nae Ferguson
/*This program utilizes a stack and a queue in a cooking class scenario. Each user inputs a number to select the cake they would like to bake.
An input of 1 indicates a cheesecake recipe, an input of 2 indicates a cholocate cake recipe and an input of 3 indicates a red velvet cake recipe.
Our queue implementation was used as users were selecting their cake, the stack was implemented by parsing recipe files and then printing them out in 
original order.*/


import java.io.*;
import java.util.Scanner;

public class CookingClassDriver
{
   public static void main(String[] args) throws IOException
   {
      CookingClass recipe = new CookingClass();
      
      Scanner keyboard = new Scanner(System.in);
      
      //User inputs their cake selection
      System.out.println("Enter a number from 1 - 3 that corresponds to a cake recipe .");
      System.out.println("1 = cheesecake");
      System.out.println("2 = chocolate cake");
      System.out.println("3 = red velvet cake");
      
      int counter = 0;
      int rear = 0;
      int ordersQueue[] = new int[5];
      
      //user input has to be between 1 and 3
      while(counter < 5)
      {
         ordersQueue[counter] = keyboard.nextInt();
         if(ordersQueue[counter] > 3 || ordersQueue[counter] < 1)
         {
            System.out.println("Please enter a number between 1 and 3.");
             
            ordersQueue[counter] = keyboard.nextInt();
         }
        
         //based on user input, a certain flavor of cake is chosen
         else 
         {
            if(ordersQueue[counter] == 1)
               recipe.storeStack1();
            else if(ordersQueue[counter] == 2)
               recipe.storeStack2();
            else if(ordersQueue[counter] == 3)
               recipe.storeStack3();
            counter++;
            rear++;
         }
      }
      
      recipe.storeQ(ordersQueue);
      
   }
}