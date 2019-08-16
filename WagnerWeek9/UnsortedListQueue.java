import ch09.priorityQueues.*;
import support.LLNode;
import java.util.Comparator;

public class UnsortedListQueue < T > implements PriQueueInterface < T >

{
   protected LLNode < T > front; // reference to the front of this queue
   protected LLNode < T > rear; // reference to the rear of this queue
   protected int numElements = 0; // number of elements in this queue
   protected Comparator < T > comp;

   public UnsortedListQueue()
   {
      front = null;
      rear = null;
   }

       

   public void enqueue( T element )
   	// Adds element to the rear of this queue.
   {
      LLNode < T > newNode = new LLNode < T > ( element );
      if ( rear == null )
         front = newNode;
      else
         rear.setLink( newNode );
      rear = newNode;
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
         LLNode maxCursor = front;
         LLNode prevMaxCursor = null;
              
         LLNode prevCursor = null;
         LLNode cursor = front;
         while(cursor != null){
            if(comp.compare((T)maxCursor.getInfo(), (T)cursor.getInfo()) < 0) {
               maxCursor = cursor;
               prevMaxCursor = prevCursor;
            }
                  
            prevCursor = cursor;
            cursor = cursor.getLink();
         }
              
         T element = (T)maxCursor.getInfo();
         if ( prevMaxCursor == null )
         {
            front = front.getLink();
            if(front == null)
               rear = null;
         } 
         else
         {
            prevMaxCursor.setLink(maxCursor.getLink());
            if(maxCursor.getLink() == null);
            rear = prevMaxCursor;
         }
              
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



