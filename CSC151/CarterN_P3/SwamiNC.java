/*
 Author: Nicoh Carter
Instructor: Jean Muhammad
Program Name: SwamiNC
Date: 4/16/2017
Location: In da crib
*/


public class SwamiNC
{
   //instance variables
   private String name, sign, element, symbol, horoscope;
   private int month, day;
   
   //default constructor
   public SwamiNC()
   {
      month = 0;
      day = 0;
      sign = null;
      element = null;
      symbol = null;
      name = null;
   }
   
   //setting day
   public void setDay (int twentyFourHours)
   {
      day = twentyFourHours;
      
      //making sure it fits the Gregarian Calendar
      if (!(month % 2 == 0) && (day > 31))   //odd months have 31 days at the most
         {
            System.out.println("That is an invalid date! System is exiting....");
            System.exit(0);
         }
      else if ((month == 2) && (day > 29))  //february has 29 days at the most
         {
            System.out.println("That is an invalid date! System is exiting....");
            System.exit(0);
         }
      else if ((month % 2 == 0) && (day > 30)) //even months have 30 days at the most
         {
            System.out.println("That is an invalid date! System is exiting....");
            System.exit(0);
         }  
                       
   }
   
   //setting month
   public void setMonth (int days)
   {
      month = days;
   }
   
   //setting name
   public void setName (String identity)
   {
      name = identity;
   }   
   
   public void changeBirthday()
   {
      //decrementing month as asked in instructions
      month--;
      
      //making sure month does not go into the negatives, if user puts January first
      if (month < 1)
         month = 12;
      
      //changing day as per instructions   
      if (day <= 5)
         day+=5;
      else 
         day-=5;
            
      if (month > 12)
         {
            System.out.println("That is an invalid month!");
            System.out.println("System is exiting....");
            System.exit(0);
         }   
            
   }
   
   //accessor methods
   public int getDay()
   {
      return day;
   }
   
   public int getMonth()
   {
      return month;
   }
   
   public String getName()
   {
      return name;
   }
   
   //returning sign based on month and day
   public String getSign()
   {
      if(month == 12 && day >= 22)
         sign = "Capricorn";
      else if (month == 1 && day <= 19)
         sign = "Capricorn";
      else if (month == 1 && day >= 20)
         sign = "Aquarius";
      else if (month == 2 && day <= 18)
         sign = "Aquarius";
      else if (month == 2 && day >= 19)
         sign = "Pisces";
      else if (month == 3 && day <= 20)
         sign = "Pisces";
      else if (month == 3 && day >= 21)
         sign = "Aries";
      else if (month == 4 && day <= 19)
         sign = "Aries"; 
      else if (month == 4 && day >= 20)
         sign = "Taurus";
      else if (month == 5 && day <= 20)
         sign = "Taurus";
      else if (month == 5 && day >= 21)
         sign = "Gemini";
      else if (month == 6 && day <= 21)
         sign = "Gemini";
      else if (month == 6 && day >= 22)
         sign = "Cancer";
      else if (month == 7 && day <= 22)
         sign = "Cancer";
      else if (month == 7 && day >= 23)
         sign = "Leo";
      else if (month == 8 && day <= 22)
         sign = "Leo";
      else if (month == 8 && day >= 23)
         sign = "Virgo";
      else if (month == 9 && day <= 22)
         sign = "Virgo";
      else if (month == 9 && day >= 23)
         sign = "Libra";
      else if (month == 10 && day <= 23)
         sign = "Libra";
      else if (month == 10 && day >= 24)
         sign = "Scorpio";
      else if (month == 11 && day <= 21)
         sign = "Scorpio";
      else if (month == 11 && day >= 22)
         sign = "Sagittarius";
      else if (month == 12 && day <= 21)
         sign = "Sagittarius";   
      
      return sign;
         
   }
   
   //returning element based on sign
   public String getElement()
   {
      if (sign.equals("Virgo") || sign.equals("Taurus") || sign.equals("Capricorn"))                                                                        
         element = "Earth";
      else if (sign.equals("Gemini") || sign.equals("Libra") || sign.equals("Aquarius"))
         element = "Air";
      else if (sign.equals("Cancer") || sign.equals("Scorpio") || sign.equals("Pisces"))
         element = "Water";
      else if (sign.equals("Aries") || sign.equals("Leo") || sign.equals("Sagittarius"))
         element = "Fire";
      
      return element;
      
   }
   
   //returning symbol based on sign
   public String getSymbol()                    
   {
      if (sign.equals("Capricorn"))
         symbol = "Goat";
      else if (sign.equals("Aquarius"))
         symbol = "Water Bearer";
      else if (sign.equals("Pisces"))
         symbol = "Fish";
      else if (sign.equals("Aries"))
         symbol = "Ram";
      else if (sign.equals("Taurus"))
         symbol = "Bull";
      else if (sign.equals("Gemini"))
         symbol = "Twins";
      else if (sign.equals("Cancer"))
         symbol = "Crab";
      else if (sign.equals("Leo"))
         symbol = "Lion";
      else if (sign.equals("Virgo"))
         symbol = "Virgin";
      else if (sign.equals("Libra"))
         symbol = "Scales";
      else if (sign.equals("Scorpio"))
         symbol = "Scorpion";
      else if (sign.equals("Sagittarius"))
         symbol = "The Archer";
      
      return symbol;
      
   }
   
   //returning horoscope based on sign
   public String getHoroscope()
   {
      if (sign.equals("Capricorn"))
         horoscope = "Slow down and appreciate more.";
      else if (sign.equals("Aquarius"))
         horoscope = "A disturbing feeling or impression may simply vanish with no explanation or discussion.";
      else if (sign.equals("Pisces"))
         horoscope = "Peace and quiet may be scarce, but you'll cherish every moment.";
      else if (sign.equals("Aries"))
         horoscope = "A financial decision that seems obvious to you may surprise others, but your instincts will outweigh any advice.";
      else if (sign.equals("Taurus"))
         horoscope = "Create a more beautiful world for yourself and know that you can make it last.";
      else if (sign.equals("Gemini"))
         horoscope = "Give yourself some private time to reflect on what you want to do that you haven't yet started.";
      else if (sign.equals("Cancer"))
         horoscope = "If you've wanted to step up into a more luxurious - if expensive - circle of friends and associates, there could be some introductions coming your way.";
      else if (sign.equals("Leo"))
         horoscope = "You know your own mind. Be authoritative but not bossy.";
      else if (sign.equals("Virgo"))
         horoscope = "You can master the basics of something that turns an event or occasion your way.";
      else if (sign.equals("Libra"))
         horoscope = "You may have no obvious big concerns, but there could be a number of small issues that you'd be glad to lay to rest. Perhaps now's the time.";
      else if (sign.equals("Scorpio"))
         horoscope = "It could be a new romance or a fresh, powerful insight that enriches your current relationship.";
      else if (sign.equals("Sagittarius"))
         horoscope = "It may be hard at times to moderate what and how much you eat, but you should be able to reduce stress and enjoy a less hectic schedule. You'll still be busy, of course.";
      
      return horoscope;
      
   }                                                            
   
}            
         
            
