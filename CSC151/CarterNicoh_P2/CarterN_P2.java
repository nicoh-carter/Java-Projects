/*
Name: Nicoh Carter
ID: 00408527
Location: CSC Lab
Brief Description: Driver File 
*/

//importing Scanner
import java.util.Scanner;

public class CarterN_P2
{

   public static void main(String[] args)
   {  
      //creating scanner object
      Scanner keyboard = new Scanner(System.in);
      
      //declaring variables
      String identity;
      double assets;
      
      
      System.out.println("Enter your name: ");
      identity = keyboard.nextLine();
      keyboard.nextLine();
      System.out.println("How much money would you like to deposit, initially: ");
      assets = keyboard.nextDouble();
      keyboard.nextLine();
      System.out.println("Thank you for creating an account with us!");
      
      
      //creating an account as an object 
      BankAccountNC account_546 = new BankAccountNC(assets, identity);
      
      //verifying user
      account_546.verifyUser();
      //executing the bank menu
      account_546.executeMenu();
      account_546.executeMenu();
      account_546.executeMenu();
      account_546.executeMenu();
      account_546.executeMenu();
      account_546.executeMenu();
      account_546.executeMenu();
      
   }
}      