/** Sarah Wagner Week Four Assignments
   Problem 16 and 17 Recursive Examples Class **/
  
import support.LLNode;
import ch02.stacks.LinkedStack;
 
public class ListDriver<T>
 {
    public static void main(String[] args)
    {
         //Create the nodes
         LLNode<Integer> temp1, temp2, temp3, temp4, temp5;
          temp1 = new LLNode<Integer>(3);
          temp2 = new LLNode<Integer>(6);
          temp3 = new LLNode<Integer>(6);
          temp4 = new LLNode<Integer>(9);
          temp5 = new LLNode<Integer>(12);   
          
         //Create the list and link up the nodes
          LLNode<Integer> multiList = temp1;
          temp1.setLink(temp2);   
          temp2.setLink(temp3);   
          temp3.setLink(temp4);   
          temp4.setLink(temp5);      
         
         //Recursive method calls
          System.out.println(numEven(multiList));
          System.out.println(contains(6, multiList));   
              
    } // end of main method
    
public static int numEven(LLNode<Integer> list)
{
      if(list == null)
      {
         return 0;
      }
      else
      {
         if(list.getInfo()%2 == 0)
         {
            return 1 + (numEven(list.getLink()));
           
         }
         else
         {
            return numEven(list.getLink());
           
         }
      }
          
} // end of numEven method
    
public static boolean contains(int target, LLNode<Integer> list)
    {
      if(list == null)
      {
         return false;
      }
      else
      {
         if(list.getInfo() == target)
         {
            return true || (contains(target, list.getLink()));
           
         }
         else
         {
            return false || (contains(target, list.getLink()));
           
         }
      }
 } // end of contains method

    
} // end of class