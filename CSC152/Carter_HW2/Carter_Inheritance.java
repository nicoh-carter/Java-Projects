//Nicoh Carter's Driver Application

public class Carter_Inheritance
{
   public static void main(String args[])
   {
     //declared variables
      int lengthR = 20;
      int widthR = 50;
      
     //created object
      Rectangle rect1 = new Rectangle(lengthR, widthR);
      
     //printed current state of rectangle object
      System.out.println("Rectangle object's info: " + rect1.toString() + "\n");
     
     //changed length to 25  
      lengthR = 25;
      rect1.setLength(lengthR);
     
     //updated current state of rectangle object 
      System.out.println("Rectangle object's info after update: " + rect1.toString() + "\n");
     
     int sides = 20;
     Cube cuboid = new Cube(sides);
     
     System.out.println("Cube object's info: " + cuboid.toString() + "\n");
     
     sides = 15;
     cuboid.setLength(15);
     
     System.out.println("Cube object's info after update: " + cuboid.toString());
   
   }
}      