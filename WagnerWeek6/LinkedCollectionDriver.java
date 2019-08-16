/** Sarah Wagner Week Five Assignments
   Problem 22 Driver Class **/
  
import ch05.collections.*;
import support.LLNode;


public class LinkedCollectionDriver
{   
   public static void main(String[] args)
    {
      MyExtendedLinkCollection<Integer> testCollection = new MyExtendedLinkCollection<Integer>();
      MyExtendedLinkCollection<Integer> otherCollection = new MyExtendedLinkCollection<Integer>(); 
      MyExtendedLinkCollection<Integer> comboCollection = new MyExtendedLinkCollection<Integer>(); 

      
      testCollection.add(1);
      testCollection.add(2);
      testCollection.add(3);
      testCollection.add(4);
      testCollection.add(3);
      testCollection.add(5);
      
      System.out.println(testCollection.toString());
     
      int counter = testCollection.count(3);
      System.out.println(counter);
      
      testCollection.removeAll(3);
      System.out.println(testCollection.toString());
      
      otherCollection.add(6);
      otherCollection.add(7);
      otherCollection.add(8);
      otherCollection.add(9);
      otherCollection.add(10);
      otherCollection.add(11);
      
      comboCollection = testCollection.combine(otherCollection);
      System.out.println(comboCollection.toString());
    }
    
 }