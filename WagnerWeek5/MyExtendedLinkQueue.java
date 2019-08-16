/** Sarah Wagner Week Five Assignments
   Problem 22 Extended Class **/
   
import ch04.queues.*;
import support.LLNode;


public class MyExtendedLinkQueue<T> extends LinkedQueue<T>{

 public String toString() //Prints out the queue
   {
   
      String result = "";
      LLNode<T> holder = front;
      
      while(holder != null)
      {
         result += holder.getInfo().toString() + "\n";
         holder = holder.getLink();
      }
      
      return result ;
   } // end of toString method

 public void remove(int count) // Remove however many elements as user requested
   {
      if(this.size() < count)
      {
         throw new QueueUnderflowException("Queue does not have enough elements");
      }
      else
      {
         for(int i = 0; i < count; i++)
         {
            T element;
            element = front.getInfo();
            front = front.getLink();
            if(front == null)
            {
               rear = null;
            }
            numElements--;
         }
      }
   
   } // end of remove
   
 public boolean swapStart()
 {
    if(this.size() < 2)
    {
      return false;
    }
    else
    {
      LLNode<T> temp1 = front; // hold a
      LLNode<T> temp2 = front.getLink(); // hold b
    
      front.setLink(front.getLink().getLink()); // a points to c
      temp2.setLink(front); // b points to a
      front = temp2; // set top link to b
     return true;
    }

  } // end of swapStart
 public boolean swapEnds()
 {
   if(this.size() < 2)
    {
      return false;
    }
    else
    {
      LLNode<T> temp1 = front; // holds A
      LLNode<T> temp2 = rear; // holds D
      
      LLNode<T> temp3 = front; // Holds C
      
      
      for(int i = 1; i < this.size() - 1; i++)
      {
         temp3 = temp3.getLink(); // Gets C
      }
      
      
      temp2.setLink(front.getLink()); // Set D to point at B
      front=temp2;
      temp3.setLink(temp1); // Set C to point at A
      rear = temp1; //Set A to point at null
      temp1.setLink(rear);
      return true;
    }
    
 } // end of SwapEnds
}

