import ch09.priorityQueues.*;
import support.LLNode;
import java.util.Comparator;

public class SortedListQueue < T > implements PriQueueInterface < T >

{
   protected LLNode < T > front; // reference to the front of this queue
   protected LLNode < T > rear; // reference to the rear of this queue
   protected int numElements = 0; // number of elements in this queue
   protected Comparator < T > comp;

   public SortedListQueue()
   {
      front = null;
      rear = null;
      comp = 
         new Comparator<T>()
         {
            public int compare(T element1, T element2)
            {
               return ((Comparable)element1).compareTo(element2);
            }
         };
   }

   public void enqueue( T element )
   	// Adds element to the rear of this queue.
   {
      LLNode < T > newNode = new LLNode < T > ( element );
    
          
      if(this.isEmpty() == true) // Case One
      {
         front = newNode;
         rear = newNode;
         newNode.setLink(null);
            
      }
      else if(comp.compare(newNode.getInfo(), front.getInfo()) > 0) // Case THree
      {
         newNode.setLink(front);
         front = newNode;  
      }
       
      else if(comp.compare(rear.getInfo(), newNode.getInfo()) > 0) //Case Four If the whole queue is bigger than the newNode then set rear to the newNode
      {
         rear.setLink(newNode);
         newNode.setLink(null);
         rear = newNode;
           
      }         
      else// Case Two and Five
      {
         LLNode < T > prevNode = front;
         LLNode < T > currNode = front.getLink();
          
         while(comp.compare(currNode.getInfo(), newNode.getInfo()) > 0)
         {
            prevNode = currNode;
            currNode = currNode.getLink();
         }
          
         prevNode.setLink(newNode);
         newNode.setLink(currNode);  
      }        
      numElements++;         
   }
                
   public T dequeue()
   	// Throws QueueUnderflowException if this queue is empty;
   	// otherwise, removes front element from this queue and returns it.
   {
      if ( isEmpty() )
         throw new PriQUnderflowException( "Dequeue attempted on empty queue." );
      else
      {
         T element;
         element = front.getInfo();
         front = front.getLink();
         if ( front == null )
            rear = null;
         numElements--;
         return element;
      }
   }


   public boolean isEmpty()
   	// Returns true if this queue is empty; otherwise, returns false.
   {
      return ( front == null );
   }

   public boolean isFull()
   	// Returns false - a linked queue is never full.
   {
      return false;
   }

   public int size()
   	// Returns the number of elements in this queue.
   {
      return numElements;
   }

}