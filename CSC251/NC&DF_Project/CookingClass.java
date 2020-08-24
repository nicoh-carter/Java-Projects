// Name: Nicoh Carter
// ID: 00408527
// Major: Computer Science
// CSC 251-02
// Date: November 8, 2018

//Team Program; Partner: D'Nae Ferguson

import java.io.*;
import java.util.Scanner;

public class CookingClass
{
   //initializing queue
   private int[] arrayQ = new int[5];
   private int rear, count, front = 0;
   
   //initializaing stacks
   private String[] arrayStack1 = new String[50];
   private String[] tempArrayStack1 = new String[50];
   private String[] arrayStack2 = new String[50];
   private String[] tempArrayStack2 = new String[50];
   private String[] arrayStack3 = new String[50];
   private String[] tempArrayStack3 = new String[50];
   
   int topStack1,topStack2, topStack3 = 0;
   int tempTopStack1, tempTopStack2, tempTopStack3 = 0;
   
   boolean flag1, flag2, flag3 = false;
   
   
   //this method stores 5 different orders into a queue
   public void storeQ(int[] orders)
   {
      for(int i = 0; i < 5; i++)
      {
         arrayQ[i] = orders[i];
         rear++;
         count++;
      }
   }
   
   //this method stores the lines of the cake recipes in the 1st cake
   public void storeStack1() throws IOException
   {
      File file = new File("Cheesecake.txt");
      Scanner scan = new Scanner(file);
      
      while(scan.hasNext() && flag1 == false)
      {
         arrayStack1[topStack1] = scan.nextLine();
         topStack1++;
         
      }
      
      flag1 = true;
      
      for(int i = topStack1 - 1; i >= 0;i-- )
      {
         topStack1--;
         tempArrayStack1[tempTopStack1] = arrayStack1[topStack1];
         tempTopStack1++;
      }
      
      for(int i = tempTopStack1 - 1; i >= 0; i--)
      {
         System.out.println(tempArrayStack1[i]);
         tempTopStack1--;
         arrayStack1[topStack1] = tempArrayStack1[tempTopStack1];
         topStack1++;
      }
         
   }
   
   //2nd cake
   public void storeStack2() throws IOException
   {
      File file = new File("ChocolateCake.txt");
      Scanner scan = new Scanner(file);
      
      while(scan.hasNext() && flag2 == false)
      {
         arrayStack2[topStack2] = scan.nextLine();
         topStack2++;
         
      }
      
      flag2 = true;
      
      for(int i = topStack2 - 1; i >= 0;i-- )
      {
         topStack2--;
         tempArrayStack2[tempTopStack2] = arrayStack2[topStack2];
         tempTopStack2++;
      }
      
      for(int i = tempTopStack2 - 1; i >= 0; i--)
      {
         tempTopStack2--;
         System.out.println(tempArrayStack1[i]);
         arrayStack2[topStack2] = tempArrayStack2[tempTopStack2];
         topStack2++;
      }
   }
   
   //3rd cake
   public void storeStack3() throws IOException
   {
      File file = new File("RedVelvetCake.txt");
      Scanner scan = new Scanner(file);
      
      
      while(scan.hasNext() && flag3 == false)
      {
         arrayStack3[topStack3] = scan.nextLine();
         topStack3++;
         
      }
      
      flag3 = true;
      
      for(int i = topStack3 - 1; i >= 0;i-- )
      {
         topStack3--;
         tempArrayStack3[tempTopStack3] = arrayStack3[topStack3];
         tempTopStack3++;
      }
      
      for(int i = tempTopStack3 - 1; i >= 0; i--)
      {
         tempTopStack3--;
         System.out.println(tempArrayStack3[i]);
         arrayStack3[topStack3] = tempArrayStack3[tempTopStack3];
         topStack3++;
      }
   }
   
}
         