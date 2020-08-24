//Mikayla Johnson 00375803
//Dr. Chutima B.
//Rectangle Inheritance class

public class Rectangle
{
   protected int length;
   protected int width;
   
   public Rectangle()      //Created no-arg constructor for Rectangle class
   {
      length = 15;
      width = 5;
   }
   public Rectangle(int l, int w) throws InvalidRectangleException   //Created a contructor with 2 parameters and an exception
   {  
      if(l < 0 || w < 0)
         throw new InvalidRectangleException("Length and width cannot be less than zero.");
      length = l; //length of rectangle
      width = w; //width of rectangle
   }
   public int getLength() //Accessor method to retrieve length of rectangle
   {
      return length;
   }
   public void setLength(int newL) throws InvalidRectangleException //Mutator method to set length of rectangle with exception
   {  
      if(newL < 0)
         throw new InvalidRectangleException("Length cannot be less than zero.");
      length = newL;
   }
   public int getWidth() //Accessor method to retrieve width of rectangle
   {
      return width;
   }
   public void setWidth(int newW) throws InvalidRectangleException //Mutator Method to set width of rectangle with exception
   {  
      if (newW < 0)
         throw new InvalidRectangleException("Width cannot be less than zero.");
      width = newW;
   }
   public int getArea() //Accessor method to get area of rectangle
   {
      int area = length * width;
      return area;
   }
 
   public String toString() //Method to load user input into a string
   {
      String info = "Width " + getWidth() + " Length " + getLength() + " Area " + getArea();
      return info;
   }
   
   
   
}//End of Rectangle Class
   