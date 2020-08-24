

public class ResolutionProofsNC
{
   public static void main(String[] args)
   {
      
      boolean p, q, r;  
      
      System.out.println("Resolution Proofs");
      
      System.out.println("\nIf (p | q) and (!p | r) are both true,\nthen (q | r) is true.\n\n");
      
      System.out.println("p\t\t\tq\t\t\tr\t\t\tp | q\t\t!p | q\tq | r\n");
   
      // Table Row for true true true
      p = true; q = true; r = true;
      System.out.println(p + "\t\t" + q + "\t\t" + r + "\t\t" + (p | q)
       + "\t\t" + (!p | r) + "\t\t" + (q | r));
       
      //Table Row for true true false
      p = true; q = true; r = false;
      System.out.println(p + "\t\t" + q + "\t\t" + r + "\t\t" + (p | q)
       + "\t\t" + (!p | r) + "\t\t" + (q | r));
       
      //Table Row for true false true
      p = true; q = false; r = true;
      System.out.println(p + "\t\t" + q + "\t\t" + r + "\t\t" + (p | q)
      + "\t\t" + (!p | r) + "\t\t" + (q | r));
      
      //Table Row for true false false
      p = true; q = true; r = false;
      System.out.println(p + "\t\t" + q + "\t\t" + r + "\t\t" + (p | q)
       + "\t\t" + (!p | r) + "\t\t" + (q | r));
       
      //Table Row for false true true
      p = false; q = true; r = true;
      System.out.println(p + "\t\t" + q + "\t\t" + r + "\t\t" + (p | q)
       + "\t\t" + (!p | r) + "\t\t" + (q | r));
       
      //Table Row for false true false
      p = false; q = true; r = true;
      System.out.println(p + "\t\t" + q + "\t\t" + r + "\t\t" + (p | q)
       + "\t\t" + (!p | r) + "\t\t" + (q | r));
       
      //Table Row for false false true
      p = false; q = false; r = true;
      System.out.println(p + "\t\t" + q + "\t\t" + r + "\t\t" + (p | q)
       + "\t\t" + (!p | r) + "\t\t" + (q | r));
       
      //Table Row for false false false
      p = false; q = false; r = false;
      System.out.println(p + "\t\t" + q + "\t\t" + r + "\t\t" + (p | q)
       + "\t\t" + (!p | r) + "\t\t" + (q | r));
       
   }
}
