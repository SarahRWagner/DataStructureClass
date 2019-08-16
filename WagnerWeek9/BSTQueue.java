import ch09.priorityQueues.*;
import support.BSTNode;
import ch07.trees.*;
import java.util.Comparator;

import java.util.*;   // Iterator, Comparator


public class BSTQueue < T > extends BinarySearchTree<T> implements PriQueueInterface < T >

{
		
   public void enqueue( T element )
   {
      this.add(element);
   }
      
		                
   public T dequeue()
   {
      T removal = this.max();
      this.remove(removal);
      return removal;
         
   }


   public boolean isEmpty()
   	// Returns true if this queue is empty; otherwise, returns false.
   {
      return ( root == null );
   }

   public boolean isFull()
   	// Returns false - a linked queue is never full.
   {
      return false;
   }

   public int size()
   	// Returns the number of elements in this queue.
   {
      return this.size();
   
   }






}