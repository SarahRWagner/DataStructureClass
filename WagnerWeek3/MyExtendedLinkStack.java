/** Sarah Wagner Week Three Assignments
   Problem 47 Extended Class **/
   
import ch02.stacks.*;
import support.LLNode;


public class MyExtendedLinkStack<T> extends LinkedStack<T>{

   public String toString()
   {
   
      String result = "";
      LLNode<T> holder = top;
      
      while(holder != null)
      {
         result += holder.getInfo().toString() + "\n";
         holder = holder.getLink();
      }
      
      return result ;
   } // end of toString method


   public int size()
   {
      int counter = 0;
      LLNode<T> temp = top;
      
      while(temp != null)
      {
         counter++;
         temp = temp.getLink();
      }
      
      return counter;
   } // end of size method

   public void popSome(int count)
   {
      if(this.size() < count)
      {
         throw new StackUnderflowException();
      }
      else
      {
         for(int i = 0; i < count; i++)
         {
            if(top == null)
            {
               throw new StackUnderflowException();
            }
            else
            {
               this.pop();
            }
          } // end of for loop
       }
   } // end of popSome method

  public boolean swapStart()
   {
      int swapStartAmount = 2; 
      
      if(this.size() < swapStartAmount)
      {
         return false;
      }
      else
      {
          LLNode<T> temp1 = top; // hold a
          LLNode<T> temp2 = top.getLink(); // hold b
          
           top.setLink(top.getLink().getLink()); // a points to c
           temp2.setLink(top); // b points to a
           top = temp2; // set top link to b
           return true;
                    
      }
   } // end of swapStart method
   
   
   public  LLNode<T> poptop(){
        if(top == null){
            throw new StackUnderflowException();
        }
        else{
             LLNode<T> oldTop = top;
            top = top.getLink();
            return oldTop;
        }
    } // end of poptop method

      
} // end of MyExtendedLinkStack class
