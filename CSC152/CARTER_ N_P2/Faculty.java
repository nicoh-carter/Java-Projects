/* =================================================================
* CSC 152 Program Assignment 2 – Inheritance and Exception, Fall 2017
* FileName: Faculty
* Purpose: Faculty Class
* Name: Nicoh Carter
* Major: CSC
================================================================== */


public class Faculty extends Person
{
   private String department;
   private String position;
   
   public Faculty(String firstName, String lastName, int bYear, double money) throws InvPerExc
   {
      super(firstName,lastName,bYear,money);
      department = "Unknown";
      position = "Unknown";
   }
   
   public Faculty(String firstName, String lastName, int bYear, double money, String department, String position) throws InvPerExc
   {
      super(firstName,lastName,bYear,money);
      this.department = department;
      this.position = position;
   }
   
   public String getDepartment()
   {
      return department;
   }
   
   public String getPosition()
   {
      return position;
   }
   
   public void setDepartment(String newDept)
   {
      department = newDept;
   }
   
   public void setPosition(String newPos)
   {
      position = newPos;
   } 
   
   public String toString()
   {
      String toString = firstName + " " + lastName + "\t" + birth_year + "\t" + money + "\t" + department + "\t" + position;
      return toString;
   } 
}    