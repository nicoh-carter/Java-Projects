/* =================================================================
* CSC 152 Program Assignment 2 – Inheritance and Exception, Fall 2017
* FileName: Person
* Purpose: Person Class
* Name: Nicoh Carter
* Major: CSC
================================================================== */


public class Person
{
   protected String firstName, lastName, city, state;
   protected int birth_year;
   protected double money;
   
   public Person(String fName, String lName, int bYear, double aMoney) throws InvPerExc
   {
      firstName = fName;
      lastName = lName;
      if(bYear > 2000)
         throw new InvPerExc("Must be at least 17 years old.");
      birth_year = bYear;
      if(aMoney < 100.00)
         throw new InvPerExc("Money cannot be less than 100");
      money = aMoney;
      city = "Upper Marlboro";
      state = "MD";
   }
   
   public Person(String firstName, String lastName, int bYear) throws InvPerExc
   {
      this.firstName = firstName;
      this.lastName = lastName;
      birth_year = bYear;
      if(bYear > 2000)
         throw new InvPerExc("Must be at least 17 years old.");
      city = "Upper Marlboro";
      state = "MD";
      money = 8527.0;
   }
   
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public int getBirthYear()
   {
      return birth_year;
   }
   
   public double getMoney()
   {
      return money;
   }
   
   public String getCity()
   {
      return city;
   }
   
   public String getState()
   {
      return state;
   }
   
   public void setFirstName(String newName)
   {
      firstName = newName;
   }
   
   public void setLastName(String newName)
   {
      lastName = newName;
   }
   
   public void setBirthYear(int newYear) throws InvPerExc
   {
      if(birth_year > 2000)
         throw new InvPerExc("Must be at least 17 years old.");
         newYear = birth_year;
   }
      
   public void setMoney(double newMoney) throws InvPerExc
   {
      if(newMoney < 100.00)
         throw new InvPerExc("Money cannot be less than 100");
      money = newMoney;
   }
      
   public void setCity(String newCity)
   {
      city = newCity;
   }
   
   public void setState(String newState)
   {
      state = newState;
   }
   
   public String getName()
   {
      String fullName = firstName + " " + lastName;
      return fullName;
   }
   
   public int getAge()
   {
      return 2017 - birth_year;
   }
   
   public void work(double earnAmt)
   {
      money+=earnAmt;
   }
   
   public void work(int hours, double regularRate, double overtimeRate)
   {
      double wage = hours * regularRate;
      money+=wage;
      if(hours > 40)
         {
            wage = ((hours-40) * overtimeRate);
            money+=wage;
         }
   }
   
   public void shop() throws InvPerExc   //cannot have negative money (use exception)
   {
      money-=25;
      if(money < 100.00)
            throw new InvPerExc("Money cannot be less than 100");    
      money+=25;
   }
   
   public void shop(double spentAmt) throws InvPerExc      //cannot have negative money (use exception)
   {  
      money-=spentAmt;
      if(money < 100.00)
            throw new InvPerExc("Money cannot be less than 100");
   }
   
   public String toString()
   {
      String toString = firstName + " " + lastName + "\t" + birth_year + "\t" + city + "\t" +
      state + "\t" + money;      
      return toString;
   }   
}   