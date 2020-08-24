//Mikayla Johnson 00375803
//Dr. Chutima B
//Exceptions Homework 3
//Exceptions Class

public class InvalidRectangleException extends Exception //create a subclass from the super class (Exception)
{
	public InvalidRectangleException(String errorMsg)  //create method for exception
   {
      super(errorMsg); //call errorMsg from super class (Exception)
   }
}  //End class   