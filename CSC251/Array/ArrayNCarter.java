//Nicoh Carter

import java.util.Scanner;

public class ArrayNCarter
{
   //declaring variables
   private int[] array = new int[20];
   private boolean searchCase,searchCase1, searchCase2,atLeast2Var,fullVar = false;
   private int count, total, largest, smallest = 0;
   private int retraction = 0;
   private double average = 0;
   
   //declaring scanner for user input
   Scanner keyboard = new Scanner(System.in);
   
   //storing integer values in array using a "for" loop
   public void storeNC()
   {
      System.out.println("Enter 10 integers: ");
      for(int i = 0; i < 10; i++)
      {  
         array[i] = keyboard.nextInt();
         count++;
         retraction++;
      }
   }
   
   //printing elements in array using a "for loop"
   public void printNC()
   {
      System.out.println("\nThe elements stored in the array are: ");
      for(int i = 0; i < 10; i++)
      {
         System.out.println(array[i]);
      }
   }
   
   //printing even elements in array using a "for loop"
   public void printEvenNC()
   {
      System.out.println("\nThe even numbers stored in the array that you inputted are: ");
      for(int i = 0; i < 10; i++)
      {
         if( (array[i] % 2) == 0)
            System.out.println(array[i]);
      }
      
   }
   
   //printing odd elements in array using a "for loop"
   public void printOddNC()
   {
      System.out.println("\nThe odd numbers stored in the array that you inputted are: ");
      for(int i = 0; i < 10; i++)
      {
         if( (array[i] % 2) == 1)
            System.out.println(array[i]);
      }
   }
   
   //searching array for specific value named by user
   public boolean searchArrayNC (int ele)
   {
      do
      {
         if(ele == array[count])
            searchCase = true;
         count--;
      } while(count > 0 && searchCase == false);
     //returning count back to original index 
     count = retraction;
                  
     return searchCase;
   }
   
   //searching array for 2 elements
   public boolean atLeast2(int ele1, int ele2)
   {
      do
      {
         if(ele1 == array[count])
            {
               searchCase1 = true;
            }
         else if(ele2 == array[count])
           {
               searchCase2 = true;
           }
         
         count--;
                  
         //if both cases are true, then there are at least 2 variables
         if(searchCase1 == true && searchCase2 == true)
               atLeast2Var = true;
               
      } while (count > 0 && atLeast2Var == false);
      
      //returning count back to original index
      count = retraction;
      
      return atLeast2Var;
   }
   
   //checking if array is full
   public boolean isFull()
   {
      if(count == 20)
         fullVar = true;
      
      return fullVar;
   }   
      
   //adding element to array
   public void addElement(int ele)
   {
       if(isFull() == false)
       {
         array[count] = ele;
         count++;
         retraction++;
       }
       
   } 
   
   //finding average of array
   public double findAverage()
   {
      for(int i = 0; i <= count; i++)
      {
         total += array[i];
      }
      average = (double)total / count;
      
      return average;
   }
   
   //finding largest element in array
   public int findLargest()
   {
      largest = array[0];
      
      for(int i = 0; i < count; i++)
      {
         if(array[i] > largest)
            largest = array[i];
      }
      
      return largest;
   }
   
   //finding smallest element in array
   public int findSmallest()
   {
      smallest = array[0];
      
      for(int i = count; i < count; i++)
      {
         if (array[i] < smallest)
            smallest = array[i];
      }
      
      return smallest;
   }
   
   public void makeFull()
   {
      while(isFull() == false)
      {
         System.out.println("Enter an element till the array is full: "); 
         array[count] = keyboard.nextInt();
         count++;
         retraction++;
      }
   }  
      
         
   
}