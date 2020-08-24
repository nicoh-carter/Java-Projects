//Nicoh Carter
//CSC 252-02

public class BubbleSort
{
   static Node head;
   static Node tail;
      
   static Node pointer;
      
   public static void main(String[] args)
   {
      int[] array = {34, 56, 4, 10, 77, 51, 93, 30, 5, 52};
      
      //storing values in double linked list
      for(int i = 0; i < array.length; i++)
      {
         pointer = new Node();
         
         if(head == null)
         {
            pointer.data = array[i];
            head = pointer;
            tail = head;
         }
         
         else
         {
            pointer.data = array[i];
            pointer.previous = tail;
            tail.next = pointer; 
            tail = pointer;
         }
      }
   
   System.out.println("Unsorted Double Linked List");
   
   //printing unsorted double linked list
   pointer = head;
   while(pointer != null)
   {
      System.out.print(pointer.data + " ");
      pointer = pointer.next;  
   }
   System.out.println();
   
   //bubble sort
   boolean done = false;
   while(!done)
   {
      pointer = head;
      done = true;
      
      while(pointer != tail)
      {
         if(pointer.data > pointer.next.data)
         {
            Node before, swap1, swap2, after;
            
            before = pointer.previous;
            swap1 = pointer;
            swap2 = pointer.next;
            after = pointer.next.next;
            
            if(before != null)
               before.next = swap2;
            else
               head = swap2;
            
            swap1.next = after;
            swap1.previous = swap2;
            swap2.next = swap1;
            swap2.previous = before;
            
            if(after != null)
               after.previous = swap1;
            else 
               tail = swap1;
               
            done = false;
            
         }
         else
            pointer = pointer.next;
      }
   }
   
   System.out.println("\nSorted Double Linked List");
   
   //printing sorted double linked list
   Node pointer = head;
   while(pointer != null)
   {
      System.out.print(pointer.data + " ");
      pointer = pointer.next;
   }
   
   System.out.println();
}}