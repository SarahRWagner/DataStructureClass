/** Sarah Wagner Week Five Assignments
   Problem 25 Circular Queue Class **/
import ch04.queues.*;
import support.LLNode;

public class CircularQueue<T> implements QueueInterface<T>
{
  // Rear node and counter variable declared
  protected LLNode<T> rear;      
  protected int numElements = 0; 

  // Constructor, differs from original queue by removing front
  public CircularQueue()
  {
    rear = null;
  } // end of constructor

  // Enqueue method
  public void enqueue(T element)
  { 
    LLNode<T> newNode = new LLNode<T>(element);
    
    
    if (rear == null) // If rear is 'empty' then have rear equal the new Node
    {
      rear = newNode; 
      numElements++; // increase the size
    }
    
    else
    { 
      if (rear.getLink() == null) // If the link past rear or the 'last' element of the queue is empty 
      {
         rear.setLink(newNode); // set rear to point to the new noode
         newNode.setLink(rear); // new node points at rear
         rear = newNode; // this is where the circle effect is generated
         numElements++; // keep track of the number of elements
      }
      
      else // Otherwise
      {
         newNode.setLink(rear.getLink()); // points to the next element after rear
         rear.setLink(newNode); // rear points at the new node
         rear = newNode; // the rear and new node are switched, the circle effect continues
         numElements++;
         }
    } 
  } //end of enqueue 
//Dequeue method
   public T dequeue()
   {
    if (rear == null)
      throw new QueueUnderflowException("Stack is empty!");
    else
    {
      T savedElement;
      savedElement = rear.getLink().getInfo(); // keep this information so it can be returned
      rear.setLink(rear.getLink().getLink()); // set the links so it stops pointing at rear.getLink
      
      if (rear.getLink() == null)  // If there's nothing after rear.getLink than rear is all that's left
         rear = null;

      numElements--;
      return element; // dequeues need to return the element
     }
   }// end of dequeue


//Copied over from the original Queue class
  public boolean isEmpty()
  // Returns true if this queue is empty; otherwise, returns false.
  {              
    return (rear == null);
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

} // end of class
 


