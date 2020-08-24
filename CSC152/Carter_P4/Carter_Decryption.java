//Nicoh Carter

//importing utilites
import java.util.Scanner;
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Carter_Decryption
{
   public static void main (String[] args) throws IOException
   {  
      //importing keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //honor statement or whatever
      System.out.println("I, Nicoh Carter, did not receive any assistance from anyone.\n");
      
      
      //Ask user for file name
      System.out.println("Please enter file name for data decryption (Make sure you enter it exactly as it appears and it is in the same folder): ");
      String fileName = keyboard.nextLine();
      
      //using scanner methods for file
      File fileReader = new File(fileName);
      Scanner input = new Scanner(fileReader);
      
      //initializing stack
      Stack<Character> NEC_char_stack = new Stack<Character>();  
      
      //initializing variables
      String EncryptedCode;
      char AsciiCode;
      int individualValue;
      
        //making a loop to print the entire message
        while (input.hasNext())
        {
           //storing one line in a variable
           EncryptedCode = input.nextLine();
            
           //seperating the line element by element
           StringTokenizer st = new StringTokenizer(EncryptedCode);
           
           //turning tokens into integers then characters by casting then pushing it into a stack
           while(st.hasMoreTokens())
           {
              individualValue = Integer.parseInt(st.nextToken());
              
              AsciiCode = (char) individualValue;
              
              NEC_char_stack.push(AsciiCode);   
           }
           
           //seperating each line
           NEC_char_stack.push('\n');
          
           
        }
        
        //printing out decrypted message
        while(!NEC_char_stack.isEmpty())
        {
              System.out.print(NEC_char_stack.pop());
        }  
        
        //completion statement
        System.out.println("\n");
        System.out.print("This program is completed by Nicoh Carter, CSC, 00408527.");             
   }
}
        