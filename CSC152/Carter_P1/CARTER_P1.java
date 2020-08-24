//Nicoh Carter

//importing objects
import java.util.Scanner;
import java.io.*;
import java.util.Random;

//class
public class CARTER_P1
{
   //main method
   public static void main(String[] args) throws IOException
   {
      //file reader
      File personFile = new File("personList.txt");
      Scanner input = new Scanner(personFile);
      
      //random generator
      Random ran = new Random();
      
      //counting people
      int noPerson = 0;
      
      //header
      System.out.println("I, Nicoh Carter, did not receive any assistance from anyone other than Dr. Boonthum-Denecke Fall 2017.\n");
      System.out.println("Nicoh Elijah Carter's Company\n");
      System.out.println("Name\t\t   Age Initial-Money\tAction Final Money\n");
      System.out.println();
      
      //creating list
      do
      {
         //counting people
         noPerson++;
         
         //reading first and last name
         String fn = input.next();
         String ln = input.next();
         
         //reading age
         int age = input.nextInt();
         
         //reading choice (work or shop)
         String choice = input.next();
         
         //reading how much from work or shop
         double v1 = input.nextDouble();
         
         //randomly setting initial money
         int initialMoney = ran.nextInt(101);
         
         //creating person object
         Person aPerson_NEC = new Person(fn, ln, age, initialMoney);
         
         //starting list up to initial money
         System.out.print(aPerson_NEC.getFirstName() + " " + aPerson_NEC.getLastName() + "\t" + aPerson_NEC.getAge() + "\t" + aPerson_NEC.getMoney() + "\t");
         
         //creating work,shop, or no action methods to use in list then printing final money
         if(choice.equals("W"))
         {
            aPerson_NEC.work(v1);
            System.out.print("WORK + " + v1 + "\t\t" + aPerson_NEC.getMoney() + "\n");
         }     
         else if(choice.equals("S"))
         {
            aPerson_NEC.shop(v1);
            if(aPerson_NEC.getNegMoneyChecker() == 1)
               System.out.print("SHOP - " + v1 + "\t" + aPerson_NEC.getMoney() + "///not enough money" + "\n");
            else
               System.out.print("SHOP - " + v1 + "\t" + aPerson_NEC.getMoney() + "\n");
         }   
         else       
         {
            System.out.print("NO ACTION" + "\t" + aPerson_NEC.getMoney() + "\n");
         }   
        
         
      } while(input.hasNext());   

      //footer
      System.out.println("\nThere are " + noPerson + " persons on the list.\n");
      System.out.println("End - Nicoh Elijah Carter's Company");
      System.out.println("9/15/2017 7:50pm\n");
      System.out.println("Carter_P1.java and Person.java, created by Nicoh Carter 00408527"); 
              
   }    
} 

//Nicoh Carter     
         