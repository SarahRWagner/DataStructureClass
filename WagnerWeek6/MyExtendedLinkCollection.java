/** Sarah Wagner Week Five Assignments
   Problem 30 Extended Class **/
   
import ch05.collections.*;
import support.LLNode;


public class MyExtendedLinkCollection<T> extends LinkedCollection<T>{

 public String toString() //Prints out the queue
   {
      String result = "";
      LLNode<T> holder = head;
      
      while(holder != null)
      {
         result += holder.getInfo().toString() + "\n";
         holder = holder.getLink();
      }
      
      return result ;
   } // end of toString method

  public int count(T target)
  {
      int count = 0;
      LLNode<T> nextNode = head; 
      
      for(int i=0; i < this.size(); i++)
      {
         if(nextNode.getInfo().equals(target))
            count++;
            nextNode = nextNode.getLink();
      }
      return count;
  } // end of count method
  
     public void removeAll(T target) {
      
      location = head;
            
        if (head == location && (head.getInfo().equals(target))) { 
            head = head.getLink();    // remove first node
            numElements--;
        }

        while (location != null) 
            {
               if (location.getInfo().equals(target)) { // if they match 
                  previous.setLink(location.getLink()); // remove node at location
                  location = location.getLink();
                  numElements--;
                  }
               else {
                  previous = location;
                  location = location.getLink();
                }   
        }   
   
   }
public MyExtendedLinkCollection combine(LinkedCollection<T> other)
   { 
        MyExtendedLinkCollection<T> comboCol = new MyExtendedLinCollection<T>();       
        
        LLNode<T> temp1 = this.head;
        LLNode<T> temp2 = other.head;
         
        for(int i = 0; i < this.size(); i++)
        {
            comboCol.add(temp1.getInfo());
            temp1 = temp1.getLink();
        }
         for(int j = 0; j < this.size(); j++)
        {
            comboCol.add(temp2.getInfo());
            temp2 = temp2.getLink();
        }
         
         
        return comboCol;
   
   


  } // end of combine method
} // end of program