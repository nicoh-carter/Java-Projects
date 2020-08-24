//Nicoh Carter

import java.util.Scanner;

public class ArrayDriver
{

   public static void main(String args[])
   {
      ArrayNCarter arrayClass = new ArrayNCarter();
      
      Scanner keyboard = new Scanner(System.in);
      
      arrayClass.storeNC();
      arrayClass.printNC();
      arrayClass.printEvenNC();
      arrayClass.printOddNC();
      System.out.println("\nIs the number 5 in your array? " + arrayClass.searchArrayNC(5));
      System.out.println("Enter two different integers to search for in the array: ");
      int firstVar = keyboard.nextInt();
      int secondVar = keyboard.nextInt();
      System.out.println("Are both integers in the array? " + arrayClass.atLeast2(firstVar, secondVar));
      System.out.println("Is the array full? " + arrayClass.isFull());
      System.out.println("Enter an integer to put into the array: ");
      int eleAdd = keyboard.nextInt();
      arrayClass.addElement(eleAdd);
      System.out.println("The average of the array is: " + arrayClass.findAverage());
      System.out.println("The largest number in the array is: " + arrayClass.findLargest()); 
      System.out.println("The smallest number in the array is: " + arrayClass.findSmallest());
      arrayClass.makeFull();
   }
}