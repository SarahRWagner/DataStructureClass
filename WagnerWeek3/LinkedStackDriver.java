/** Sarah Wagner Week Three Assignments
   Problem 47 Driver Class **/
   
import ch02.stacks.*;
import support.LLNode;

public class LinkedStackDriver
{   
   public static void main(String[] args)
    {
          // Create the stack
          MyExtendedLinkStack testStack;
          testStack = new MyExtendedLinkStack <>();
          
          // Fill stack
          testStack.push(1);
          testStack.push(2);
          testStack.push(3);
          testStack.push(4);
          
          // Print the stack
          System.out.println(testStack.toString());
          
          //Current size of stack
          System.out.println("Current stack size: " + testStack.size());
          
          // Pops off one node from stack
          testStack.popSome(1);
          
          // Push that element back on
          testStack.push(4);
          
          // Test the exception if you try to pop off more than the stack
          // testStack.popSome(5);
          
          // Swap the first two items on the list
          testStack.swapStart();
          
          // Pop off the top, store it
          testStack.poptop();
          
          
    }
}