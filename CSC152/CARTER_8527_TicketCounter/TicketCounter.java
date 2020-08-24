//Nicoh Carter


import java.util.*;

public class Carter_8527_P3    
{
    //private final static int MAX_CASHIERS = 15;

    public static void main(String[] args) 
    {    
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the preferred processing time: ");
        int processTime = keyboard.nextInt();
        System.out.println("Enter the number of queues: ");
        int queues = keyboard.nextInt();
        System.out.println("Enter the number of customers: ");
        int customers = keyboard.nextInt();
        System.out.println("Enter the customer arrival rate: ");
        int arrivalRate = keyboard.nextInt();
        System.out.println("Enter the preferred average time, in minutes: ");
        int averageTime = keyboard.nextInt();
        keyboard.nextLine();
        
        Customer customer;
        Queue<Customer> customerQueue = new LinkedList<Customer>();
        int[] cashierTime = new int[MAX_CASHIERS];	
        int totalTime, averageTime, departs, start;
        
        System.out.println("Name: Nicoh Carter\nStudent ID: 00408527\nMajor: Computer Science\n");

        // run the simulation for various number of cashiers 
        for (int cashiers = 0; cashiers < MAX_CASHIERS; cashiers++)
        { 
            // set each cashiers time to zero initially
            for (int count = 0; count < cashiers; count++)
                cashierTime[count] = 0;

            // load customer queue 
            for (int count = 1; count <= customers; count++)
                customerQueue.add(new Customer(count * 15));
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

            // output results for this simulation 
            averageTime = totalTime / customers;
            System.out.println("Number of cashiers: " + (cashiers + 1));
            System.out.println("Average time: " + averageTime + "\n");
        }
    }
}

//Name: Nicoh Carter
//Student ID: 00408527  
//Major: CSC
//Time of CSC Class: 2 pm