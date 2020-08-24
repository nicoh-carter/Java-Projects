/*Name: Nicoh Carter
ID: 00408527
Major: CSC
Lab Date & Time: 3/29/2017 1 pm
*/

import java.util.Scanner;

public class Lab8DriverNC
{
   public static void main(String[] args)
   {
      
      //*****PART I*****
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the package type that you chose: ");
      String packageType = keyboard.nextLine();
      
      keyboard.nextLine();
      
      System.out.println("Enter the amount of minutes used: ");
      int minute = keyboard.nextInt();
      
      //Package A           
      Lab8myClassNC packageA = new Lab8myClassNC( packageType, minute);
      
      System.out.println("Your total cost is " + packageA.calcTotalCost() + " for package " +
      packageA.getPackageLetter() + "\n" + "if you used " + packageA.getMinutes() + " minutes.");       
      
      double packageAcost = packageA.calcTotalCost();
      keyboard.nextLine();
      keyboard.nextLine();
      
      //Package B
      System.out.println("Enter a different package type: ");
      packageType = keyboard.nextLine();
      
      Lab8myClassNC packageB = new Lab8myClassNC( packageType, minute);

      System.out.println("Your total cost is " + packageB.calcTotalCost() + " for package " +
      packageB.getPackageLetter() + "\n" + "if you used " + packageB.getMinutes() + " minutes.");
      
      double packageBcost = packageB.calcTotalCost();
      keyboard.nextLine();
      
      //Package C
      System.out.println("Enter a different package type from the other 2 already entered: ");
      packageType = keyboard.nextLine();
      
      Lab8myClassNC packageC = new Lab8myClassNC( packageType, minute);
      
      System.out.println("Your total cost is " + packageC.calcTotalCost() + " for package " +
      packageC.getPackageLetter() + "\n" + "if you used " + packageC.getMinutes() + " minutes.");
      
      double packageCcost = packageC.calcTotalCost();       
     
      //*****PART II***** 
      if ((packageAcost < packageBcost) && (packageAcost < packageCcost))
         System.out.println("\nPackage A is the cheapest package.");
      else if ((packageBcost < packageAcost) && (packageBcost < packageCcost))
         System.out.println("\nPackage B is the cheapest package.");
      else if ((packageCcost < packageAcost) && (packageCcost < packageBcost))
         System.out.println("\nPackage C is the cheapest package.");   
         
      keyboard.nextLine();    
      
      //*****PART III*****
      System.out.println("Enter the number of books that you purchased this month: ");
      int bookNumbers = keyboard.nextInt();
      
      if (bookNumbers >= 4)
         System.out.println("You earned 60 points.\n");
      else if (bookNumbers == 3)
         System.out.println("You earned 30 points.\n");
      else if (bookNumbers == 2)
         System.out.println("You earned 15 points.\n");
      else if (bookNumbers == 1)
         System.out.println("You earned 5 points.\n");
      else if (bookNumbers == 0)
         System.out.println("You earned 0 points. :(\n");
      else 
         {
            System.out.println("You entered a negative number....System is exiting...");
            System.exit(0);
         }  
      
      keyboard.nextLine();   
            
      //*****PART IV*****
      System.out.println("Enter a number within the range of 1 - 10.");
      int range = keyboard.nextInt();
      
      if (range == 10)
         System.out.println("The roman numeral is 'X'.");
      else if (range == 9)
         System.out.println("The roman numeral is 'IX'.");
      else if (range == 8)
         System.out.println("The roman numeral is 'VIII'.");
      else if (range == 7)
         System.out.println("The roman numeral is 'VII'.");
      else if (range == 6)
         System.out.println("The roman numeral is 'VI'.");
      else if (range == 5)
         System.out.println("The roman numeral is 'V'.");
      else if (range == 4)
         System.out.println("The roman numeral is 'IV'.");
      else if (range == 3)
         System.out.println("The roman numeral is 'III'.");
      else if (range == 2)
         System.out.println("The roman numeral is 'II'.");
      else if (range == 1)
         System.out.println("The roman numeral is 'I'.");
      else 
         {
            System.out.println("That is not within the range of 1 - 10...System is exiting...");
            System.exit(0); 
         }                                                      
      
      
   }   
      





   
}   