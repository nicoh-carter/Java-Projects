import java.io.*;
import java.util.Scanner;

public class QueueNCarter
{
   private final int size = 8;
   private String[] queueArray = new String[size];
   private String[] tempQArray = new String[size];
   private int rear, tempRear = 0;
   private int front, tempFront = 0;
   private int count, tempCount= 0;
   private String x = "";
   
   public void storeQueue() throws IOException
   {
      File file = new File("queueList.txt");
      Scanner queuelist = new Scanner(file);
      
      for(int i = 0; i < 6; i++)
      {
         queueArray[i] = queuelist.nextLine();
         rear++;
         count++;
      }
   }
   
   public void addQueue(String y)
   {
      if(count < size)
      {
         if(rear > size)
         {
            rear = 0;
            queueArray[rear] = y;
            rear++;
            count++;
            
         }
         else
         {
            queueArray[rear] = y;
            rear++;
            count++;
         }       
      }
      else
         System.out.println("The Queue is full.");
   }
   
   public void removeQueue()
   {
      if(count > 0)
      {
         front++;
         count--;
      }
      else
         System.out.println("The Queue is empty.");
   }
   
   public void printQueue()
   {
      if(count != 0)
      {
         for(int i = front; i <= count; i++)
         {
            tempQArray[i] = queueArray[i];
            System.out.println(queueArray[i]);
            rear--;
            tempRear++;
            tempCount++;
         }
         for(int i = tempFront; i <= tempCount; i++)
         {
            queueArray[i] = tempQArray[i];
            rear++;
            tempRear--;
         }
      }
      else
         System.out.println("The Queue is empty.");
   }
}

         