//Nicoh Carter

import java.util.Scanner;

public class Stack_ArrayNC
{
  //declaring arrays
  private int[] stack_Array = new int[20];
  private int[] st_temp_Array = new int[20];
  
  //declaring variables used in class file
  int arrayEle, stack_top, st_temp_top = 0;
  int size = 19;
  
  //declaring scanner for user input
  Scanner keyboard = new Scanner(System.in);
  
  //inputting values into array
  public void storeStackNC()
  {
      System.out.println("Enter 10 elements to be placed into the stack: ");
      
      for(int i = 0; i < 10; i++)
      {
         arrayEle = keyboard.nextInt();
         stack_Array[i] = arrayEle;
         stack_top++;
      }
   }
   
   //printing array in reverse order
   public void printStackArrayReverse()
   {
      for(int i = stack_top - 1; i >= 0; i--)
      {
         stack_top--;
         
         st_temp_Array[st_temp_top] = stack_Array[stack_top];
         
         System.out.print(st_temp_Array[st_temp_top] + " ");
         
         st_temp_top++;
      }
      
      for(int i = st_temp_top - 1; i >= 0; i--)
      {
         st_temp_top--;
                  
         stack_Array[stack_top] = st_temp_Array[st_temp_top];
         
         stack_top++;
      }
         
   }
   
   //printing array in original order
   public void printStackArrayOriginal()
   {
      for(int i = stack_top - 1; i >= 0; i--)
      {
         stack_top--;
         
         st_temp_Array[st_temp_top] = stack_Array[stack_top];
         
         st_temp_top++;
      }
      for(int i = st_temp_top - 1; i >= 0; i--)
      {
      
         st_temp_top--;
         
         stack_Array[stack_top] = st_temp_Array[st_temp_top];
         
         System.out.print(st_temp_Array[st_temp_top] + " ");
         
         stack_top++;
         
      }
   }
   
   public void addToStack(int integer)
   {
      if(stack_top<20)
      {
         stack_Array[stack_top] = integer;
         stack_top++;
         size++;
         System.out.println("The element "+ integer + " has been added.");
      }
      else
         System.out.println("The stack is full.");
   }
   
   public void removeFromTopStack()
   {
      stack_top--;
      System.out.println("\nAn element has been removed from stack.");
   }
   
   //work in progress
   public void removeFromAnywhereStack(int x)
   {
      for(int i = stack_top-1; i >= 0; i--)
      {
 
          if(stack_Array[i] != x)
            {
            st_temp_Array[st_temp_top] = stack_Array[i];
               st_temp_top++;
              
            }
                  
         stack_top--;
      }
      
      for(int i = st_temp_top-1; i >= 0; i--)
      {
         st_temp_top--;
         
         stack_Array[stack_top] = st_temp_Array[st_temp_top];
         
         stack_top++;    
        
      }
         
   }
   
   //finding multiple of six
   public void findMultiplesSixStack()
   {
       for(int i = stack_top - 1; i >= 0; i--)
         {
            stack_top--;
            
            st_temp_Array[st_temp_top] = stack_Array[stack_top];
            
            st_temp_top++;
         }
         
         for(int i = st_temp_top - 1; i >= 0; i--)
         {
            st_temp_top--;
            
            if(st_temp_Array[st_temp_top] % 6 == 0)
               System.out.println("\n\nThe number " + st_temp_Array[st_temp_top] + " is a multiple of 6.\n");
            
            stack_Array[stack_top] = st_temp_Array[st_temp_top];
            
            stack_top++;
         }
   }
   
   //prints stack in order
   public void printStack()
   {
       for(int i = stack_top-1; i >= 0; i--)
         {
            stack_top--;
            
            st_temp_Array[st_temp_top] = stack_Array[stack_top];
            
            st_temp_top++;
         }
                 
         for(int i = st_temp_top-1; i >= 0; i--)
         {
            st_temp_top--;
            
            stack_Array[stack_top] = st_temp_Array[st_temp_top];
          
            System.out.print(stack_Array[stack_top] + " ");
            
            stack_top++;
         }
         System.out.println("");
   }
   
   public void printFromTopStack()
   {
      for(int i = stack_top-1; i >= 0; i--)
      {
         stack_top--;
         
         st_temp_Array[st_temp_top] = stack_Array[stack_top];
         
         st_temp_top++;
      }
      
      System.out.println("\nPrinting stack in reverse order...");
      
      for(int i = st_temp_top - 1; i >= 0; i--)
      {
         st_temp_top--;
         
         System.out.print(st_temp_Array[stack_top] + " ");
         
         stack_Array[stack_top] = st_temp_Array[st_temp_top];
         
         stack_top++;
      }
   } 
   
   public double calculateAverageStack()
   {
      double sum = 0;
      
      for(int i = stack_top-1; i >= 0; i--)
      {
         stack_top--;
         
         st_temp_Array[st_temp_top] = stack_Array[stack_top];
         
         sum+=(double)st_temp_Array[st_temp_top];
         
         st_temp_top++;
      }
      
      for(int i = st_temp_top - 1; i >= 0; i--)
      {
         st_temp_top--;
         
         stack_Array[stack_top] = st_temp_Array[st_temp_top];
         
         stack_top++;
      }
      
      return sum;
   }

   public void incrementTwelve()
   {
      for(int i = stack_top - 1; i >= 0; i--)
      {
         stack_top--;
         
         st_temp_Array[st_temp_top] = stack_Array[stack_top] + 12;
         
         st_temp_top++;
      }
      
      System.out.println("\nAdding twelve to all elements in the stack.");
      
      for(int i = st_temp_top - 1; i >= 0; i--)
      {
         st_temp_top--;
         
         System.out.print(st_temp_Array[st_temp_top] + " ");
         
         stack_Array[stack_top] = st_temp_Array[st_temp_top];
         
         stack_top++;
      }
   }
   
   public boolean isStackFull()
   {
      if(stack_top >= 20)
         return true;
      else
         return false;
   }
   
   public boolean isStackEmpty()
   {
      if(stack_top == 0)
         return true;
      else 
         return false;
   }
   
   public void fillStack()
   {
      
      for(int i = stack_top; i < size; i++)
      {
         stack_Array[stack_top] = stack_top+14;
         
         stack_top++;
      }
      
      System.out.println("\nFilling Stack...");
   }
   
   public void modulusStack()
   {
      for(int i = stack_top - 1; i >= 0; i--)
      {
         stack_top--;
         
         st_temp_Array[st_temp_top] = stack_Array[stack_top] % 9;
         
         st_temp_top++;
      }
      for(int i = st_temp_top - 1; i >= 0; i--)
      {
      
         st_temp_top--;
         
         stack_Array[stack_top] = st_temp_Array[st_temp_top];
         
         //System.out.print(st_temp_Array[st_temp_top] + " ");
         
         stack_top++;
         
      }
   }      
   
}