

public class QuadraticEquation
{
   private double a, b, c, x1 , x2, discriminant;
   
   
   public QuadraticEquation( double a1, double b1, double c1)
   {
      a = a1;
      b = b1;
      c = c1;
      x1 = 0;
      x2 = 0;
      discriminant = 0;
   }
   public double getRoot1()
   {
      return x1;
   }
   
   public double getRoot2()
   {
      return x2;
   }      
   
   public void calcFormula()
   {
      discriminant = ((b*b)-(4*a*c));
      
      if(discriminant < 0)
         {
            System.out.println("There are imaginary roots that I can not solve for...");
            System.exit(0);
            /*
            Trying to enter imaginary numbers...S.O.Pln("There are imaginary roots");
            
            */
         }
      else if(discriminant == 0)
         System.out.println("The polynomial has a double root.");
      else
         {
            System.out.println("The polynomial has two roots."); 
            System.out.println("The discriminant is " + discriminant + ".");
         }                    
      
      x1 = (((-b) + (Math.sqrt(discriminant)))/(2*a));
      x2 = (((-b) - (Math.sqrt(discriminant)))/(2*a));
   }
   
}              