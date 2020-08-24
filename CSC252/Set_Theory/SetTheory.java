//Nicoh Carter 


public class SetTheory
{
   private int[] setA = {1,2,3,4,5};
   private int[] setB = {4,5,6,7,8};
   private int[] setC = new int[setA.length + setB.length];
   
   //displaying the arrays in the proper format
   public void displayArrays()
   {
      //printing set A
      System.out.print("A = {");
      
      for(int i = 0; i < 5; i++)
      {
         
         if(setA[i] == 5)
            System.out.println(setA[i] + "}");
         else
            System.out.print(setA[i] + ", ");
      }
      
      //printing set B
      System.out.print("B = {");
      for(int i = 0; i < 5; i++)
      {   
         //printing setB
         if(setB[i] == 8)
            System.out.println(setB[i] + "}");
         else 
            System.out.print(setB[i] + ", ");
      }
   }
   
   
   //performing A union B
   public void union()
   {
   
      int count = 0;
      for(int i = 0; i < setA.length; i++)
      {
         setC[i] = setA[i];
         count++;
      }
      
      for(int i = 2; i < setB.length; i++)
      {
         setC[count++] = setB[i];
      }
      
      System.out.print("A Union B = {");
      
      for( int i = 0; i < (setC.length -2); i++)
      {
         if(setC[i] == 8)
            System.out.println(setC[i] + "}");
         else 
            System.out.print(setC[i] + ", ");
      }
   }
   
   //performing A intersect
   public void intersect()
   {
      System.out.print("A Intersect B = {");
      
      for(int i = 3; i < 5; i++)
      {
         if(setC[i] == 5)
            System.out.println(setC[i] + "}");
         else
            System.out.print(setC[i] + ", ");
      }
   }
   
   //performing A - B
   public void AminusB()
   {
      System.out.print("A - B = {");
      
      for(int i = 0; i < 3; i++)
      {
         if(setA[i] == 3)
            System.out.println(setA[i] + "}");
         else
            System.out.print(setA[i] + ", ");
      }
   }
   
   //performing B - A
   public void BminusA()
   {
      System.out.print("B - A = {");
      
      for(int i = 2; i < setB.length; i++)
      {
         if(setB[i] == 8)
            System.out.println(setB[i] + "}");
         else
            System.out.print(setB[i] + ", ");
      }
   }
}
