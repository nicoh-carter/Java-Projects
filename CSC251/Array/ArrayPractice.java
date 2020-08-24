//Nicoh Carter


import java.util.Scanner;

public class ArrayPractice
{
   public static void main(String[] args)
   {
      
      Scanner keyboard = new Scanner(System.in);
   
      int[] arrayInt = new int[10];
      int elements;
      
      System.out.println("Enter 10 integers: ");
      
      for(int elementsPlaceholder = 0; elementsPlaceholder < 10; elementsPlaceholder++)
         {
            arrayInt[elementsPlaceholder] = keyboard.nextInt();
         }
      for(int elementsPlaceholder = 0; elementsPlaceholder < 10; elementsPlaceholder++)
         {
            System.out.println(arrayInt[elementsPlaceholder]);
         }
    }
}
