/*
Name: Nicoh Carter
ID: 00408527
Location: The Dungeon
Brief Description: Class File
*/


//importing Scanner and decimal format object
import java.util.Scanner;
import java.text.DecimalFormat;


public class BankAccountNC
{
   //declaring attributes
   private double startBalance, interestRate, interest;
   private String name; 
   
   //putting the scanner and decimalformat object in the class
   Scanner keyboard = new Scanner(System.in);
   DecimalFormat money = new DecimalFormat("$#,###,##0.00");
   
   //setting the attributes to null
   public BankAccountNC(double balance, String n)
   {
      startBalance = balance;
      interestRate = 0.0;
      name = n;
      interest = 0.0;
   }
   
   //deposit method used in the executemenu method
   public void deposit(double amount)
   {
      startBalance += amount;
      
      if(startBalance >1000)
         System.out.println("Balance before interest: " + money.format(startBalance));
         this.addInterest();
         startBalance += interest;
         System.out.println("Amount of interest added: " + money.format(interest));
         System.out.println("NEW BALANCE: " + money.format(startBalance));
         
          
   }
   
   //withdraw method used in the executemenu method
   public void withdraw(double amount)
   {
      System.out.println("Balance before withdrawal: " + money.format(startBalance));
      startBalance -= amount;
      System.out.println("NEW BALANCE: " + money.format(startBalance));
   }
   
   //calculating interest rate for the addinterest method
   public double calculateRate()
   {
      if(startBalance >= 10000)
         interestRate = 0.08;
      else if(startBalance >= 1000 && startBalance < 10000)
         interestRate = 0.04;
      else
         interestRate = 0.02;
      return interestRate;   
   } 
   
   //calculating interest
   public void addInterest()
   {  
      this.calculateRate();
      interest = startBalance * interestRate;
   }
                 
   
   //method that will be used in the driver only
   public void executeMenu()
   {  
      //asking user which method they would like to access
      System.out.println("Bank Menu:\n\t[D]: Deposit\n\t[W]: Withdraw" +
      "\n\t[B]: Balance\nChoose an option: ");
      String answer = keyboard.nextLine();
      keyboard.nextLine();
      
      //delivering the user to the method they called
      switch(answer)
      {
         case "D":
         case "d":
            System.out.println("How much would you like to deposit: ");
            double cash = keyboard.nextDouble();
            this.deposit(cash);
            keyboard.nextLine();
            break;
         case "W":
         case "w":
            System.out.println("How much would you like to withdraw: ");
            cash = keyboard.nextDouble();
            this.withdraw(cash);
            keyboard.nextLine();
            break;
         case "B":
         case "b":
            System.out.println(name + ", your current balance is " + money.format(startBalance));         
            break;
         default:
            System.out.println("That is not the correct character! System is exiting.....");
            System.exit(0);
            break;
      }        
   
   }
   
   //Verifying if the user is who they say they are
   public void verifyUser()
   {
      System.out.println("Please enter the name associated with this bank account for verification: ");
     
      String aName = keyboard.nextLine();
      
      if (aName.equalsIgnoreCase(name))
         {
            System.out.println("Verification is complete. Welcome!");
         }   
      else 
         {
            System.out.println("Incorrect user.System is exiting...");
            System.exit(0);
         }   
      
    }         
   
      
}            