/* =================================================================
* CSC 152 Program Assignment 2 – Inheritance and Exception, Fall 2017
* FileName: managePerson_Carter_8527
* Purpose: Driver
* Name: Nicoh Carter
* Major: CSC
================================================================== */

import java.util.Scanner;

public class managePerson_Carter_8527
{
   public static void main(String[] args) throws InvPerExc
   {
      System.out.println("I, Nicoh Carter, did not receive any assistance from anyone other than Dr. Boonthum - Denecke or assigned tutors for Fall 2017.");
      Scanner keyboard = new Scanner(System.in);
      
      String firstNamePer = "Sally";
      String lastNamePer = "Mae";
      int birthYearPer = 1986;
      Person Carter_8527_Per1 = new Person(firstNamePer, lastNamePer, birthYearPer );
      System.out.println("Person object info: " + Carter_8527_Per1.toString());

      
      
      String firstNameStu1 = "Nicoh";
      String lastNameStu1 = "Carter";
      int birthYearStu1 = 1998;
      Person Carter_8527_Stu1 = new Student(firstNameStu1, lastNameStu1, birthYearStu1, 900,"CSC", 3.5 );
      System.out.println("Student 1 object info: " + Carter_8527_Stu1.toString());
      
      
      String firstNameStu2 = "Vince";
      String lastNameStu2 = "Rollerson";
      int birthYearStu2 = 1997;
      String majorStu2 = "Psychology";
      Student Carter_8527_Stu2 = new Student(firstNameStu2, lastNameStu2, birthYearStu2, 189 ,majorStu2, 3.2 );
      System.out.println("Student 2 object info: " + Carter_8527_Stu2.toString());
      System.out.println("Enter new major for student 2: ");
      majorStu2 = keyboard.nextLine();
      Carter_8527_Stu2.setMajor(majorStu2);
      Carter_8527_Stu2.shop(27);
      System.out.println("Student 2 new object info: " + Carter_8527_Stu2.toString());
      
      String firstNameFac1 = "Ian";
      String lastNameFac1 = "Costello";
      int birthYearFac1 = 1971;
      Person Carter_8527_Fac1 = new Faculty(firstNameFac1, lastNameFac1, birthYearFac1, 608,"Naval Science","Liuetenant");
      System.out.println("Faculty 1 object info: " + Carter_8527_Fac1.toString());

      
      String firstNameFac2 = "Andrzej";
      String lastNameFac2 = "Makagon";
      int birthYearFac2 = 1964;
      Person Carter_8527_Fac2 = new Faculty(firstNameFac2, lastNameFac2, birthYearFac2, 504,"Mathematics","Statistics Professor");
      System.out.println("Faculty 2 object info: " + Carter_8527_Fac2.toString());
      
      System.out.println("This program is completed by Nicoh Carter, CSC, 00408527.");
      
   }
}
      

      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
