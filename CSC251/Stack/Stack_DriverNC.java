//Nicoh Carter

import java.util.Scanner;

public class Stack_DriverNC
{
   public static void main(String[] args)
   {
      Stack_ArrayNC stArray = new Stack_ArrayNC();
      
      Scanner keyboard = new Scanner(System.in);
      
      stArray.storeStackNC();
      System.out.println("\nPrinting Stack in reverse...");
      stArray.printStackArrayReverse();
      System.out.println("\nPrinting Stack in original order...");
      stArray.printStackArrayOriginal();
      System.out.println("\n");
      System.out.println("Enter an integer to add into the stack.");
      int addToStackVar = keyboard.nextInt();
      stArray.addToStack(addToStackVar);
      stArray.printStackArrayOriginal();
      stArray.removeFromTopStack();
      stArray.printStackArrayOriginal();
      stArray.findMultiplesSixStack();
      System.out.println("The element number 5 has been removed.");
      stArray.removeFromAnywhereStack(5);
      stArray.printStack();
      stArray.printFromTopStack();
      System.out.println("\n\nThe average of the stack is " + stArray.calculateAverageStack() + " .");
      stArray.incrementTwelve();
      System.out.println("\n\nIs the stack full? " + stArray.isStackFull());
      System.out.println("\nIs the stack empty? " + stArray.isStackEmpty());
      stArray.fillStack();
      stArray.printStack();
      stArray.modulusStack();
      System.out.println("\nTaking the modulus 9 of each element and storing it in the stack...");
      stArray.printStack();
      
   }
}