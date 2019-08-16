/** Sarah Wagner Week Five Assignments
   Problem 25 Driver Class **/
  
import ch04.queues.*;
import support.LLNode;


public class CircularQueueDriver 
{   
   public static void main(String[] args)
    {
    
      CircularQueue<Integer> testQueue = new CircularQueue<Integer>();
      
      testQueue.enqueue(1);
      testQueue.enqueue(2);
      testQueue.enqueue(3);
      testQueue.enqueue(4);
      testQueue.enqueue(5);
      testQueue.enqueue(6);
      
      testQueue.dequeue();
      testQueue.dequeue();
      
      System.out.println(testQueue.toString());
      
      
           
      } // end of main
} // end of class