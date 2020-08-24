/* =================================================================
* CSC 152 Program Assignment 2 – Inheritance and Exception, Fall 2017
* FileName: Student
* Purpose: Student Class
* Name: Nicoh Carter
* Major: CSC
================================================================== */


public class Student extends Person
{
   private String major;
   private double gpa;
   
   public Student(String firstName, String lastName, int bYear, double money) throws InvPerExc
   {
      super(firstName,lastName,bYear,money);
      major = "Undeclared";
      gpa = 0.00;
   }
   
   public Student(String firstName, String lastName, int bYear, double money, String major, double gpa) throws InvPerExc
   {
      super(firstName,lastName,bYear,money);
      this.major = major;
      this.gpa = gpa;
      if(gpa < 0)
         throw new InvPerExc("GPA cannot be negative");  
   }
   
   public String getMajor()
   {
      return major;
   }
   
   public double getGPA()
   {
      return gpa;
   }
   
   public void setMajor(String newMajor)
   {
      major = newMajor;
   }
   
   public void setGPA(double newGPA) throws InvPerExc
   {
      gpa = newGPA;
      if(gpa < 0)
         throw new InvPerExc("GPA cannot be negative");  
   }
   
   public String toString()
   {
      String toString = firstName + " " + lastName + "\t" + birth_year + "\t"  + money + "\t" + major + "\t" + gpa;
      return toString;
   }
}
   
      
   