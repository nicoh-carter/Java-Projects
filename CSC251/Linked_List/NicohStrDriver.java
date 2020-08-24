//Nicoh Carter

public class NicohStrDriver
{
   public static void main(String[] args)
   {
      
      
   
      NicohStringNode classF = new NicohStringNode(null, null); //empty list
     
      /*Adding Elements then printing*/
      classF.addToFrontNC("Zeus");
      classF.addToFrontNC("Poseidon");
      classF.addToFrontNC("Hades");
      classF.addToFrontNC("Dionysus");
      classF.addToFrontNC("Persephone");
      classF.addToFrontNC("Hermes");
      classF.addToFrontNC("Hades");
      classF.printLLNC();
      
      /*adding to end then printing all elements again*/
      classF.addToEndNC("Ares");
      System.out.println();
      classF.printLLNC();
      
      /*adding after then printing all elements again*/
      System.out.println();
      classF.addAfterNC("Dionysus", "Apollo");
      classF.printLLNC();
      
      /*searching for elements then printing if found or not*/
      System.out.println();
      System.out.println(classF.searchLLNC("Apollo"));
      
      /*removing front then printing all elements again*/
      classF.removeFrontNC();
      System.out.println();
      classF.printLLNC();
      
      /*removing last element then printing all elements again*/
      classF.removeLastNC();
      System.out.println();
      classF.printLLNC();
      
      /*removing element then printing all elements again*/
      classF.removeElementNC("Hermes");
      System.out.println();
      classF.printLLNC();
      
      /*checking if there are duplicates then returning duplicate*/
      System.out.println();
      System.out.println(classF.findDuplicate("Hades"));
      
      /*checking if node begins with specific letter then returning true or false*/
      System.out.println();
      System.out.println(classF.findLetter('H'));
      
     
   }
}