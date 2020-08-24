//Nicoh Carter

import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;


public class Carter_P5
{

   public static void main(String[] args) throws IOException
   {
      //importing keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //honor statement or whatever
      System.out.println("I, Nicoh Carter, did not receive any assistance from anyone other than Dr. Boonthum-Denecke or assigned tutor Fall 2017.\n");
      
      //reading in file
      File fileReader = new File("Carter_data.txt");
      Scanner input = new Scanner(fileReader);
      
      //setting array sizes
      int[] Carter_array_unsorted = new int[30];
      int[] Carter_array_sorted = new int[1];
      
      //declaring variables
      int number;
      
      int index = 0;
      
      //putting numbers into array
      while(input.hasNext())
         {      
            number = input.nextInt();
            Carter_array_unsorted[index] = number;
            index++;
         }
      
      //showing user the array 
      System.out.println("Here is the unsorted data: " + Arrays.toString(Carter_array_unsorted));
      
      //showing the user the menu
      System.out.println("\nWhat would you like to do now? Please type a letter.\na. Sort using Selection Sort\nb. Sort using Insertion Sort\nc. Sort using Bubble Sort\nd. Search using Linear Search\ne. Search using Binary Search (only if you have a sorted data)\nf. Add a new value to an array\ng. Exit\n");
      
      //asking user for choice
      String choice = keyboard.nextLine();
      
      //used to exit program
      boolean exit = false;
      
      //this is for only choice F, so disregard this until later. (It's used to show the user the previous sort.)
      boolean choiceA = false;
      boolean choiceB = false;
      boolean choiceC = false;
      
      //making sure user puts in the write character for the menu
      while(!choice.equalsIgnoreCase("a") && !choice.equalsIgnoreCase("b") && !choice.equalsIgnoreCase("c") && !choice.equalsIgnoreCase("d") && !choice.equalsIgnoreCase("e") && !choice.equalsIgnoreCase("f") && !choice.equalsIgnoreCase("g"))
         {
            System.out.println("Please type a choice from the menu.");
            choice = keyboard.nextLine();
         }
      
      //code for menu
      while(exit==false)
      {
      
         switch (choice)
         {
            case "a": case "A":
               //selection sort program executes
               Carter_array_sorted = Carter_SelectionSort.doSelectionSort(Carter_array_unsorted);
               System.out.println("Selection Sort: \n" + Arrays.toString(Carter_array_sorted));
               System.out.println("\nWhat would you like to do now? Please type a letter.\na. Sort using Selection Sort\nb. Sort using Insertion Sort\nc. Sort using Bubble Sort\nd. Search using Linear Search\ne. Search using Binary Search (only if you have a sorted data)\nf. Add a new value to an array\ng. Exit\n");
               //selection sort was just chosen (used for choice F)
               choiceC = false;
               choiceB = false;
               choiceA = true;
               //user inputs next choice
               choice = keyboard.nextLine();  
               //buffer
               keyboard.nextLine();
               break; 
            case "b": case "B":
               //insertion sort program executes
               Carter_array_sorted = Carter_InsertionSort.doInsertionSort(Carter_array_unsorted);
               System.out.println("Insertion Sort: \n" + Arrays.toString(Carter_array_sorted));
               System.out.println("\nWhat would you like to do now? Please type a letter.\na. Sort using Selection Sort\nb. Sort using Insertion Sort\nc. Sort using Bubble Sort\nd. Search using Linear Search\ne. Search using Binary Search (only if you have a sorted data)\nf. Add a new value to an array\ng. Exit\n");
               //insertion sort was just chosen (used for choice F)
               choiceC = false;
               choiceA = false;
               choiceB = true;
               //user inputs next choice
               choice = keyboard.nextLine();
               //buffer
               keyboard.nextLine();
               break;
            case "c": case "C":
               //bubble sort program executes
               Carter_array_sorted = Carter_BubbleSort.doBubbleSort(Carter_array_unsorted);
               System.out.println("Bubble Sort: \n" + Arrays.toString(Carter_array_sorted));
               System.out.println("\nWhat would you like to do now? Please type a letter.\na. Sort using Selection Sort\nb. Sort using Insertion Sort\nc. Sort using Bubble Sort\nd. Search using Linear Search\ne. Search using Binary Search (only if you have a sorted data)\nf. Add a new value to an array\ng. Exit\n");
               //bubble sort was just chosen (used for choice F)
               choiceB = false;
               choiceA = false;
               choiceC = true;
               //user inputs next choice
               choice = keyboard.nextLine();
               break;
            case "d": case "D":
               //asking user for integer value to search for
               System.out.println("Enter an integer target value to look for in the array: ");
               int target = keyboard.nextInt();
               //buffer
               keyboard.nextLine();
               //Linear search program executes and returns an index
               int key = Carter_LinearSearch.doLinearSearch(Carter_array_unsorted, target);
               //if the integer value is not in the array. The user must try again.
               while (key == -1)
                  { 
                     System.out.println("Target is not in the array. Please try again.");
                     target = keyboard.nextInt();
                     key = Carter_LinearSearch.doLinearSearch(Carter_array_unsorted, target);
                  }
               //if the integer value is in the array. The index is shown.
               System.out.println("Target value "+ target +" found at index: "+ Carter_LinearSearch.doLinearSearch(Carter_array_unsorted, target));
               System.out.println("\nWhat would you like to do now? Please type a letter.\na. Sort using Selection Sort\nb. Sort using Insertion Sort\nc. Sort using Bubble Sort\nd. Search using Linear Search\ne. Search using Binary Search (only if you have a sorted data)\nf. Add a new value to an array\ng. Exit\n");
               //user inputs next choice
               choice = keyboard.nextLine();
               //buffer
               keyboard.nextLine();
               break;
            case "e": case "E":
               //makes sure data was sorted first
               while(Carter_array_sorted.length == 1)
               {
                  System.out.println("Please sort values before trying to do a binary search. Pick another choice from the menu.");
                  choice = keyboard.nextLine();
               }
               //user inputs target value
               System.out.println("Enter an integer target value to look for in the array: ");
               target = keyboard.nextInt();
               //buffer
               keyboard.nextLine();
               //Binary search program executes and returns an index
               key = Carter_BinarySearch.doBinarySearch(Carter_array_sorted, target);
               //if target is not in array. The user must try again.
               while (key == -1)
                  { 
                     System.out.println("Target is not in the array. Please try again.");
                     target = keyboard.nextInt();
                     key = Carter_BinarySearch.doBinarySearch(Carter_array_sorted, target);
                  }
               //if target is in array. This returns the index of the target in the array.
               System.out.println("Target value "+ target +" found at index: "+ Carter_BinarySearch.doBinarySearch(Carter_array_sorted, target));
               System.out.println("\nWhat would you like to do now? Please type a letter.\na. Sort using Selection Sort\nb. Sort using Insertion Sort\nc. Sort using Bubble Sort\nd. Search using Linear Search\ne. Search using Binary Search (only if you have a sorted data)\nf. Add a new value to an array\ng. Exit\n");
               //user inputs next choice
               choice = keyboard.nextLine();
               //buffer
               keyboard.nextLine();
               break;
            case "f": case "F":
               //asks user for amount of numbers to enter into array. The maximum size of the array is 30.
               System.out.println("How many numbers would you like to put in the array (The maximum size of the array is 30.)?");
               int amountOfValues = keyboard.nextInt();
               //makes sure user doesnt enter a negative value or a value that is too big
               while(amountOfValues <= 0 || amountOfValues >= 9)
               {
                  System.out.println("Please try again. Negative numbers, 0, and any number more than 9 are not accepted.");
                  amountOfValues = keyboard.nextInt();
               }
               //asks user for numbers
               System.out.println("Please enter a number (or numbers) to put into the array and then wait a second: ");
               int numberChoice = keyboard.nextInt();
               //inputs values into array
               for(int index1 = 20; index <= (amountOfValues + index); index++)
               {
                  Carter_array_unsorted[index1] = numberChoice;
                  //if the user wants to input more than one value, they can
                  if(amountOfValues > 1)
                  {
                     numberChoice = keyboard.nextInt();
                  }
               }
               //prints out unsorted array first with new values included
               System.out.println("Here is the unsorted array with the new values: \n" + Arrays.toString(Carter_array_unsorted));
               //this checks for previous sort (if there is one) then prints out sorted array and then asks user to input next choice
               if (choiceA == true)
               {
                  Carter_array_sorted = Carter_SelectionSort.doSelectionSort(Carter_array_unsorted);
                  System.out.println("Selection Sort: \n" + Arrays.toString(Carter_array_sorted));
                  keyboard.nextLine();
                  System.out.println("\nWhat would you like to do now? Please type a letter.\na. Sort using Selection Sort\nb. Sort using Insertion Sort\nc. Sort using Bubble Sort\nd. Search using Linear Search\ne. Search using Binary Search (only if you have a sorted data)\nf. Add a new value to an array\ng. Exit\n");
                  choice = keyboard.nextLine();
               }
               else if(choiceB == true)
               {
                  Carter_array_sorted = Carter_InsertionSort.doInsertionSort(Carter_array_unsorted);
                  System.out.println("Insertion Sort: \n" + Arrays.toString(Carter_array_sorted));
                  keyboard.nextLine();
                  System.out.println("\nWhat would you like to do now? Please type a letter.\na. Sort using Selection Sort\nb. Sort using Insertion Sort\nc. Sort using Bubble Sort\nd. Search using Linear Search\ne. Search using Binary Search (only if you have a sorted data)\nf. Add a new value to an array\ng. Exit\n");
                  choice = keyboard.nextLine();
               }
               else if(choiceC == true)
               {
                  Carter_array_sorted = Carter_BubbleSort.doBubbleSort(Carter_array_unsorted);
                  System.out.println("Bubble Sort: \n" + Arrays.toString(Carter_array_sorted));
                  keyboard.nextLine();
                  System.out.println("\nWhat would you like to do now? Please type a letter.\na. Sort using Selection Sort\nb. Sort using Insertion Sort\nc. Sort using Bubble Sort\nd. Search using Linear Search\ne. Search using Binary Search (only if you have a sorted data)\nf. Add a new value to an array\ng. Exit\n");
                  choice = keyboard.nextLine();
               }
               else
                  break;
            case "g": case "G":
               //exits program
               exit = true;
               break;
            default: 
               //this will never execute. However, I needed to include a default case....soooooo
               System.out.println("This line will never execute.");
               System.exit(0);
               break;
         }
      }
      //last line of output
      System.out.println("This program is completed by Nicoh Carter, CSC, 00408527.");
          
   }
}

      
           