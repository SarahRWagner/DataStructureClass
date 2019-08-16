/** Sarah Wagner Week Five Assignments
   Problem 22 Driver Class **/
  
import ch04.queues.*;
import support.LLNode;


public class LinkedStackDriver
{   
   public static void main(String[] args)
    {
      MyExtendedLinkQueue<Integer> testQueue = new MyExtendedLinkQueue<Integer>();
      
      testQueue.enqueue(1);
      testQueue.enqueue(2);
      testQueue.enqueue(3);
      testQueue.enqueue(4);
      
      System.out.println(testQueue.toString());
      //testQueue.remove(2);
      //testQueue.swapStart()
      testQueue.swapEnds();

    }
    
 }