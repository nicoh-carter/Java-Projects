//Nicoh Carter


import java.util.*;

public class Carter_8527_P3    
{

    public static void main(String[] args) 
    {    
        Scanner keyboard = new Scanner(System.in);
        
        String continueLoop;
        
        do
        {
           System.out.println("Enter the preferred processing time: ");
           int processTime = keyboard.nextInt();
           System.out.println("Enter the number of queues (maximum amount of cashiers possible): ");
           int queue = keyboard.nextInt();
           System.out.println("Enter the number of customers: ");
           int customers = keyboard.nextInt();
           System.out.println("Enter the customer arrival rate: ");
           int arrivalRate = keyboard.nextInt();
           System.out.println("Enter the preferred average time, in minutes: ");
           int preferredAverageTime = keyboard.nextInt() * 60;
           keyboard.nextLine();
           
           
           Customer customer;
           Queue<Customer> customerQueue = new LinkedList<Customer>();
           int[] cashierTime = new int[queue];	
           int averageTime, totalTime, departs, start, cashiers;
           
           
                 // run the simulation for various number of cashiers 
                 for (cashiers = 0; cashiers < queue; cashiers++)
                 { 
                     // set each cashiers time to zero initially
                     for (int count = 0; count < cashiers; count++)
                         cashierTime[count] = 0;
                     // load customer queue 
                     for (int count = 1; count <= customers; count++)
                         customerQueue.add(new Customer(count * arrivalRate));
                     
                     totalTime = 0;
                     
                     // process all customers in the queue 
                     while (!(customerQueue.isEmpty())) 
                     {
                         for (int count = 0; count <= cashiers; count++)
                         {
                             if (!(customerQueue.isEmpty()))
                             {
                                 customer = customerQueue.remove();
                                 if (customer.getArrivalTime() > cashierTime[count])
         						         start = customer.getArrivalTime();
                                 else
                                    start = cashierTime[count]; 
         						      departs = start + processTime;
         					         customer.setDepartureTime(departs);
                                 cashierTime[count] = departs;
                                 totalTime += customer.totalTime();
                             }
                         }
                     }
          
                     averageTime = totalTime / customers;
                     if(preferredAverageTime > averageTime)
                        {
                           System.out.println("The number of cashiers needed is: " + (cashiers + 1) + ".");
                           break;
                        }
                 }
                System.out.println("Would you like to try again? Type yes or no.");
                continueLoop = keyboard.nextLine();
                 
        } while((continueLoop.equalsIgnoreCase("Yes")) || (continueLoop.equalsIgnoreCase("Y")));
    }
}
    


//Name: Nicoh Carter
//Student ID: 00408527  
//Major: CSC
//Time of CSC Class: 2 pm