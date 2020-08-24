//Nicoh Carter

public class NicohStringNode
{
   private String data;
   private NicohStringNode link;
   private NicohStringNode front;   
   private NicohStringNode end;
   private NicohStringNode tPtr;
   
   public NicohStringNode(String data1, NicohStringNode link1)
   {
      data = data1;
      link = link1;
   }
   
      
   public void addToFrontNC(String x)
   {
      if(front == null)
      {
         front = new NicohStringNode(x, front);
         end = front;
      }
      else
      {
         front = new NicohStringNode( x, front);
         end.link = front;
      }
   }
   
   public void printLLNC()
   {
      tPtr = front;
      if(front == null)
      {
         System.out.println("Linked List is empty.");
      }
      else
      {
         while(tPtr != end)
         {
            System.out.println(tPtr.data);
            tPtr = tPtr.link;
         }
         System.out.println(tPtr.data);
         
      }
   }
   
   public void addToEndNC(String x)
   {
      tPtr = front;
      if(front == null)
      {
         System.out.println("Linked List is empty.");
      }
      else
      {
         while(tPtr != end)
         {
            tPtr = tPtr.link;
         }
         tPtr.link = new NicohStringNode( x, end.link);
         end = tPtr.link;
         front = end.link;
         //System.out.println(end.data);
      }
         
      
   }
   
   public void addAfterNC(String x, String y)
   {
      tPtr = front;
      if(front == null)
      {
         System.out.println("Linked List is empty.");
      }
      else if(tPtr.data.equals(x))
      {
         addToEndNC(x);
      }
      else
      {
         while(tPtr != end)
         {
            tPtr = tPtr.link;
            if(tPtr.data.equals(x))
               tPtr.link = new NicohStringNode(y, tPtr.link);
            //System.out.println("l");
            
         }
        // tPtr.link = new NicohStringNode( y, front);
         //end = tPtr.link;
      }
   }
   
   public boolean searchLLNC(String x)
   {
      tPtr = front;
      boolean found = false;
      if(front == null)
         System.out.println("Linked List is empty.");
      else if(tPtr.data.equals(x))
         found = true;
      else
      {
         while(tPtr != end && found == false)
         {
            tPtr = tPtr.link;
            if(tPtr.data.equals(x))
            {
               found = true;
            }
         }
      } 
      return found;
   }
   
   public void removeFrontNC()
   {
      if(front == null)
         System.out.println("Linked List is empty");
      else
      {
         front = front.link;
         end.link = front;
      }
   }
   
   public void removeLastNC()
   {
      tPtr = front;
      if(front == null)
         System.out.println("Linked List is empty");
      else
      {
         while(tPtr.link != end)
         {
            tPtr = tPtr.link;
         }
         end = tPtr;
         end.link = front;
      }
   }
   
   public void removeElementNC(String x)
   {
      tPtr = front;
      boolean found = false;
      
      if(front == null)
         System.out.println("Linked List is empty");
      else if(tPtr.data.equals(x))
      {
         front = front.link;
         end.link = front;
      }
      else
      {
         while(tPtr.link != end)
         {
            if(tPtr.link.data.equals(x))
            {
               tPtr.link = tPtr.link.link;
            }
            tPtr = tPtr.link;
         }
      }
   }
   
   public String findDuplicate(String s)
   {
      tPtr = front;
      int count = 0;
      if(front == null)
         System.out.println("Linked List is empty");
      else
      {
         while(tPtr != end)
         {
            if(tPtr.data.equals(s))
               count++;
            tPtr = tPtr.link;
         }
         if(tPtr.data.equals(s))
            count++;
      }
      if(count > 1)
         return s;
      else
         return "No duplicates found.";
   }
   
   public boolean findLetter(char l)
   {
      tPtr = front;
      boolean found = false;
      
      if(front == null)
         System.out.println("Linked List is empty");
      else if(tPtr.data.charAt(0) == l)
         found = true;
      else
      {
         while(tPtr != end && found == false)
         {
            tPtr = tPtr.link;
            if(tPtr.data.charAt(0) == l)
               found = true;
         }
         if(tPtr.data.charAt(0) == l)
            found = true;
      }
      return found;
   }   
}