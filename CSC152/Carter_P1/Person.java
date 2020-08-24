//Nicoh Carter

//class
public class Person
{
   //variables
   private String firstName, lastName;
   private int age;
   private double money;
   
   //no action variable
   private int negMoneyChecker;
   
   //constructor
   public Person(String fName, String lName, int aAge, double aMoney)
   {
      firstName = fName;
      lastName = lName;
      age = aAge;
      money = aMoney;
   }
   
   //accessor methods
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public int getAge()
   {
      return age;
   }
   
   //no action checker
   public int getNegMoneyChecker()
   {
      return negMoneyChecker;
   }   
   
   public double getMoney()
   {
      return money;
   }
   
   //setter methods
   public void setFirstName(String newName)
   {
      firstName = newName;
   }
   
   public void setLastName(String newName)
   {
      lastName = newName;
   }
   
   public void setAge(int newAge)
   {
      age = newAge;
   }
   
   public void setMoney(double newMoney)
   {
      money = newMoney; 
   }
   
   //calculated methods
   public String getName()
   {
      String fullName = firstName + " " + lastName;
      return fullName;  
   }
   
   public void work(double earnAmt)
   {
      money += earnAmt;
   }
   
   public void shop(double spentAmt)
   {
      money -= spentAmt;
      
      //creating no action if negative values
      negMoneyChecker = 0;
      if (money < 0)
      {
         money +=spentAmt;
         negMoneyChecker++;
      }
   }
   
   public String toString()
   {
      String attributeV = getName() + "\t" + getAge() + "\t" + getMoney();
      return attributeV;
   }
         
}

//Nicoh Carter                                        