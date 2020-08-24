/*
Author: Nicoh Carter
Instructor: Jean Muhammad
Program Name: SwamiNC
Date: 4/26/2017
Location: In da crib
*/

import java.util.Scanner;

public class demoSwamiNC
{
   public static void main(String[] args)
   {
      
      //Scanner Object
      Scanner keyboard = new Scanner(System.in);
      
      //User's Name
      System.out.println("Enter your name: ");
      String Name = keyboard.nextLine();
      
      keyboard.nextLine(); //buffer
      
      //User's birthday
      System.out.println("Enter the month that you were born: ");
      int Month = keyboard.nextInt();
      
      System.out.println("Enter the day that you were born: ");
      int Day = keyboard.nextInt();
      
      //First Object
      SwamiNC swami1 = new SwamiNC();
      swami1.setName(Name);
      swami1.setMonth(Month);
      swami1.setDay(Day);
      
      //displaying initial state of the object
      System.out.println("\nName:" + swami1.getName() + "\t" + "Month:" + swami1.getMonth() + 
      "\t" + "Day:" + swami1.getDay() + "\n" + "Sign:" + swami1.getSign() + "\t" +
      "Symbol:" + swami1.getSymbol() + "\t" + "Element:" + swami1.getElement() + "\n" +
      swami1.getName() + ", Swami says: " + swami1.getHoroscope() + "\n");
      
      //Second Object
      SwamiNC swami2 = new SwamiNC();
      swami2.setName(Name);
      swami2.setMonth(Month);
      swami2.setDay(Day);
      swami2.changeBirthday();   //changing birthday
      
      //displaying initial state of the object
      System.out.println("\nName:" + swami2.getName() + "\t" + "Month:" + swami2.getMonth() + 
      "\t" + "Day:" + swami2.getDay() + "\n" + "Sign:" + swami2.getSign() + "\t" +
      "Symbol:" + swami2.getSymbol() + "\t" + "Element:" + swami2.getElement() + "\n" +
      swami2.getName() + ", Swami says: " + swami2.getHoroscope() + "\n");
      
      //Third Object
      SwamiNC swami3 = new SwamiNC();
      swami3.setName(Name);
      swami3.setMonth(Month);
      swami3.setDay(Day);
      swami3.changeBirthday();
      swami3.changeBirthday();   //changing birthday again
      
      //displaying initial state of the object
      System.out.println("\nName:" + swami3.getName() + "\t" + "Month:" + swami3.getMonth() + 
      "\t" + "Day:" + swami3.getDay() + "\n" + "Sign:" + swami3.getSign() + "\t" +
      "Symbol:" + swami3.getSymbol() + "\t" + "Element:" + swami3.getElement() + "\n" +
      swami3.getName() + ", Swami says: " + swami3.getHoroscope() + "\n");
      
      //Fourth Object
      SwamiNC swami4 = new SwamiNC();
      swami4.setName(Name);
      swami4.setMonth(Month);
      swami4.setDay(Day);
      swami4.changeBirthday();
      swami4.changeBirthday();
      swami4.changeBirthday();   //changing birthday again
      
      //displaying initial state of the object
      System.out.println("\nName:" + swami4.getName() + "\t" + "Month:" + swami4.getMonth() + 
      "\t" + "Day:" + swami4.getDay() + "\n" + "Sign:" + swami4.getSign() + "\t" +
      "Symbol:" + swami4.getSymbol() + "\t" + "Element:" + swami4.getElement() + "\n" +
      swami4.getName() + ", Swami says: " + swami4.getHoroscope() + "\n");
      
      //Fifth Object
      SwamiNC swami5 = new SwamiNC();
      swami5.setName(Name);
      swami5.setMonth(Month);
      swami5.setDay(Day);
      swami5.changeBirthday();
      swami5.changeBirthday();
      swami5.changeBirthday();
      swami5.changeBirthday();   //changing birthday again
      
      //displaying initial state of the object
      System.out.println("\nName:" + swami5.getName() + "\t" + "Month:" + swami5.getMonth() + 
      "\t" + "Day:" + swami5.getDay() + "\n" + "Sign:" + swami5.getSign() + "\t" +
      "Symbol:" + swami5.getSymbol() + "\t" + "Element:" + swami5.getElement() + "\n" +
      swami5.getName() + ", Swami says: " + swami5.getHoroscope() + "\n");
      
   }
}      
      
      
      
      
      
      