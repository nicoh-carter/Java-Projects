import java.util.Scanner;

public class QuadraticEquationDriver
{
   public static void main(String[] args)
   {
      double coefficient1, coefficient2, constant;
      char letter;
      
      String answer;
      
      Scanner keyboard = new Scanner(System.in);
      
      do
      {
         System.out.println("Enter in the first coefficient (except 0): ");
         coefficient1 = keyboard.nextDouble();
            while (coefficient1 == 0)
               {
                  System.out.println("Any number except 0...Please try again");
                  coefficient1 = keyboard.nextDouble();
               }   
         System.out.println("Enter in the second coefficient: ");
         coefficient2 = keyboard.nextDouble();
         System.out.println("Enter in the constant: ");
         constant = keyboard.nextDouble();
         keyboard.nextLine();
         
         System.out.println("Is your equation \"" + coefficient1 +
         "x^2 + " + coefficient2 + "x + " + constant + "\"?");
         System.out.println("Enter \'y\' or \'n\':");
         answer = keyboard.nextLine();
         letter = answer.charAt(0);
      }  while(letter == 'N' || letter == 'n'); 
      
      if(letter == 'Y' || letter == 'y')
         {
            QuadraticEquation obj1 = new QuadraticEquation (coefficient1, coefficient2, constant);
            obj1.calcFormula();
            System.out.println("The first root is " + obj1.getRoot1() + ".");
            System.out.println("The second root is " + obj1.getRoot2() + ".");
         }
      else
         System.out.println("You entered a wrong letter.");   
      
   }
}      
      
      
      
      
      