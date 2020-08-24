//Nicoh Carter

import java.util.Scanner;
import java.io.*;

public class QueueDriverNC
{
   public static void main(String[] args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      
      QueueNCarter classFile = new QueueNCarter();
      
      classFile.storeQueue();
      System.out.println("Enter a name to store into the queue: ");
      String name = keyboard.nextLine();
      classFile.addQueue(name);
      classFile.removeQueue();
      System.out.println("The Queue contains: ");
      classFile.printQueue();
   }
}