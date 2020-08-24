//Nicoh Carter

public class LList_IntNodeP
{
   
   private int data;
   private LList_IntNodeP link;
   private LList_IntNodeP head;
   private LList_IntNodeP tPtr;
   
   public LList_IntNodeP (int data1, LList_IntNodeP link1)
   {
      data = data1;
      link = link1;
   }
   
   public void createEmptyList()
   {
      head = null;
   }
   
   public void addToFrontNC(int x)
   {
      if(head == null)
      {
         head = new LList_IntNodeP( x, null);
      }
   }
   
   public void addAfterNC(int x, int y)
   {
      LList_IntNodeP newNode;
      newNode = head;
   
      while(head != null)
      {
         
         if(newNode.data == x)
         {
            newNode = newNode.link;
            newNode = new LList_IntNodeP ( y , null);
         }
      }
   }
   
   
   
   
   
   
   
}         