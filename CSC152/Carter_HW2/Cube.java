//Nicoh Carter's Cube Class


public class Cube extends Rectangle
{
   private int height;
   
 //no argument constructor  
   public Cube()
   {
   
      super ( 10, 10);
      height = 10;
      
      
   }
 //constructor with parameter  
   public Cube(int l)
   {
   
      super ( l, l);
      height = l;
      
   
   }
   
 //Mutators
   public void setHeight(int newH)
   {
   
      height = newH;
      length = newH;
      width = newH;
      
   }
   
   public void setLength(int newL)
   {
   
      length = newL;
      height = newL;
      width = newL;
      
   }
   
   public void setWidth(int newW)
   {
   
      width = newW;
      height = newW;
      length = newW;
      
   }         
   
   public void set(int newL)
   {
   
      width = newL;
      height = newL;
      length = newL;
     
   }
    
 //Accessors   
   public int getHeight()
   {
      return height;
   }
   
   public int getArea()
   {
   
      return 6 * super.getArea();
      
   }
   
   public int getVolume()
   {
   
      int sideCubed = length * width * height;
      return sideCubed;
      
   }
   
   public String toString()
   {
   
      String info = "Length: " + getLength() + ", Width: " + getWidth() + ", Height: " + getHeight() + ", Surface Area: " + getArea() +
      ", Volume: " + getVolume();
      
      return info;
      
   }   
   
              
   
   
   
   
   


}   