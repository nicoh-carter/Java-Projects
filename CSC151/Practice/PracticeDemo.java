import java.util.Scanner;

public class PracticeDemo
{
   public static void main(String[] args)
   {
      /*Scanner keyboard = new Scanner(System.in);
      
      double accumulator = 0;
      double x, y;
      double division = 0;
      
      for (x = 1,y = 30; x <= 30; ++x , --y)
      {
         division = x/y;
         accumulator+=division;
         System.out.println(accumulator);
      }
      
      System.out.println("Enter a number: ");
      double userNumber = keyboard.nextDouble();
      double product = 10;
      while (userNumber < 100)
      {
         userNumber = product * userNumber;
         System.out.println(userNumber);
      }
      
      System.out.println("");
      double sum = 0;
      String answer;
      
      do
      {
         System.out.println("Enter two numbers: ");
         double firstNumber = keyboard.nextDouble();
         double secondNumber = keyboard.nextDouble();
         keyboard.nextLine();
         sum = firstNumber + secondNumber;
         System.out.println("The sum is " + sum + ".");
         System.out.println("Do you wish to do it again? (\'Y\' for yes, \'N\' for no)");
         answer = keyboard.nextLine();
         while(!(answer.equals("Y")) && !(answer.equals("y")) && !(answer.equals("N")) && !(answer.equals("n")))
         {
            System.out.println("Please try again!");
            System.out.println("Enter your answer: ");
            answer = keyboard.nextLine();
         }
      } while (answer.equals("Y") || answer.equals("y"));
      
      for(int loop = 0; loop <= 1000; loop+=10)
      {
         System.out.println(loop);
      }
      
      
      double accumulator1 = 0;
      keyboard.nextLine();
      
      
      
      System.out.println("\nEnter a number: ");
      double value = keyboard.nextDouble();
      
      for(int loop = 1; loop <= 10; loop++)
      {
         accumulator1 = accumulator1 + value; 
      }
      
      System.out.println(accumulator1);*/ 
      
      /*int loop;
      for (int rows = 0; rows <10; rows++)
      {
         for(int columns = 0; columns < 15; columns++)
         {
            System.out.print("#");
         }
         System.out.println();
      }*/
      
      /*int num1, num2;
      String input;
      char again;
      
      
      Scanner keyboard = new Scanner(System.in);
      do
      {
         System.out.print("Enter a number: ");
         num1 = keyboard.nextInt();
         System.out.print("Enter another number: ");
         num2 = keyboard.nextInt();
         System.out.println("Their sum is " + (num1 + num2)+ ".");
         System.out.println("Do you want to do this again? (Enter \'Y\' to do it again)");
         keyboard.nextLine();
         input = keyboard.nextLine();
         again = input.charAt(0);
      } while(again == 'y' || again == 'Y');*/
      
      /*int count = 1, total = 0;
      while (count <= 100)
      {
         total+=count;
         count++;
      }
      System.out.print("The total from 1-100 is ");
      System.out.println(total + ".");*/
      
      /*for(int rows = 0; rows < 7; rows++)
      {
         for (int columns = 0; columns < (rows + 1) ; columns++)
         {
            System.out.print("*");
         }
         System.out.println();
      }*/
      
      for (int rows = 0; rows < 6; rows++)
      {
         for (int columns = 0; columns < rows; columns++)
         {
            System.out.print(" ");
         }
         System.out.println("#");
      }  
      
                        
      
      
      
      
             
      
            
         
            
                  
      
      
      
      
      
      
      
      
      
      
      
      
      
   
   }
}                    