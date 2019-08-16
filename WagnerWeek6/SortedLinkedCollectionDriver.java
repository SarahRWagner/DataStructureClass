/** Sarah Wagner Week Five Assignments
   Problem 22 Driver Class **/
  
import ch05.collections.*;
import support.LLNode;


public class SortedLinkedCollectionDriver
{   
   public static void main(String[] args)
    {
      SortedLinkedCollection<Integer> testCollection = new SortedLinkedCollection<Integer>();
            
      testCollection.add(1);
      testCollection.add(2);
      testCollection.add(3);
      testCollection.add(4);
      testCollection.add(3);
      testCollection.add(5);
      
      System.out.println(testCollection.toString());
     
    }
    
 }