/** Sarah Wagner Week Five Assignments
   Problem 31 Extended Class **/
import ch05.collections.*;
import support.LLNode;


public class SortedLinkedCollection < T > implements CollectionInterface < T > {

     public LLNode < T > head; // head of the linked list
     protected int numElements = 0; // number of elements in this collection

     // set by find method
     protected boolean found; // true if target found, else false
     protected LLNode < T > location; // node containing target, if found
     protected LLNode < T > previous; // node preceding location

     public SortedLinkedCollection() {
         numElements = 0;
         head = null;
     }

     public String toString() //Prints out the queue
     {
         String result = "";
         LLNode < T > holder = head;

         while (holder != null) {
             result += holder.getInfo().toString() + "\n";
             holder = holder.getLink();
         }

         return result;
     } // end of toString method
     @Override
     public boolean add(T element) {
         LLNode < T > newNode = new LLNode < T > (element);
         LLNode < T > currentNode = new LLNode < T > (element);

         // So we have two cases:
         // If the head is null  {

         // This is the easy case. Set head to be equal to newNode,
         // and increase numElements by 1.

         //}
         
         if(this.isEmpty() == true){
             newNode.setLink(head);
             head = newNode;
             numElements++;
         }
        
         else {
             currentNode = head;
             previous = null;
             
             while(currentNode != null && ((Comparable)currentNode.getInfo()).compareTo(newNode.getInfo()) < 0){
                   previous = currentNode;
                   currentNode = currentNode.getLink();
              }    
            if(currentNode.equals(head) && previous == null){
               head.setLink(newNode);
               numElements++;
            }
            else if(currentNode != null && previous != null){
               previous.setLink(newNode.getLink());
               currentNode = newNode;
               numElements++;
             }
            else{
               previous.setLink(newNode.getLink());
               newNode.setLink(null);
               numElements++;
            }
             
             
             
         }
         //Otherwise {

         // set currentNode = head
         // set previousNOde = null

         // while (currentNode != null && currentNode.getInfo().compareTo(newNode.getInfo()) < 0)
         // {
         // previousNode = currentNOde
         // currentNode = currentNode.getLink()
         // }

         // Here, we write an "if" statement for our 3 cases:

         // if currentNode is still the head and previousNode still null:
         // {
         // The newNode we're inserting needs to become the new head.
         // }
         // else if neither previousNode nor currentNode are null:
         // {
         // THe newNode we're inserting goes between previousNode and currentNode
         // }
         // else if currentNode is null and previousNode is not.
         // {
         // The newNode we're inserting comes immediately after "previousNode" and will
         // become the last node in our list.
         // }
         return true;
         }   

         protected void find(T target)
             // Searches the collection for an occurence of an element e such that
             // e.equals(target). If successful, sets instance variables
             // found to true, location to node containing e, and previous
             // to the node that links to location. If not successful, sets 
             // found to false.
             {
                 location = head;
                 found = false;

                 while (location != null) {
                     if (location.getInfo().equals(target)) // if they match
                     {
                         found = true;
                         return;
                     } else {
                         previous = location;
                         location = location.getLink();
                     }
                 }
             }

         public int size()
             // Returns the number of elements on this collection. 
             {
                 return numElements;
             }

         public boolean contains(T target)
             // Returns true if this collection contains an element e such that 
             // e.equals(target); otherwise, returns false.
             {
                 find(target);
                 return found;
             }

         public boolean remove(T target)
             // Removes an element e from this collection such that e.equals(target)
             // and returns true; if no such element exists, returns false.
             {
                 find(target);
                 if (found) {
                     if (head == location)
                         head = head.getLink(); // remove first node
                     else
                         previous.setLink(location.getLink()); // remove node at location

                     numElements--;
                 }
                 return found;
             }

         public T get(T target)
             // Returns an element e from this collection such that e.equals(target);
             // if no such element exists, returns null.
             {
                 find(target);
                 if (found)
                     return location.getInfo();
                 else
                     return null;
             }

         public boolean isEmpty()
             // Returns true if this collection is empty; otherwise, returns false.
             {
                 return (numElements == 0);
             }

         public boolean isFull()
             // Returns true if this collection is full; otherwise, returns false.
             {
                 return false; // Linked implementation is never full
             }


} // end of program