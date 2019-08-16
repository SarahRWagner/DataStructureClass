/**
 * Sarah Wagner, Week Two #28
 * I had help from Tutor.com on the last two questions. My tutor Scott helped me realize that when you deal with stacks
 * you need to focus on the topIndex rather than the .length. I was thinking of the stack as an array, but now I really see
 * the first in first out idea.
 */

import ch02.stacks.ArrayBoundedStack;
import ch02.stacks.StackUnderflowException;

public class MyExtendedArrayBoundedStack<T> extends ArrayBoundedStack<T>
{
    /**
     * Convert the values of elements into a String
     * @return the String that tells the user what is in elements
     */
    public String toString(){
        String currentStack = String.valueOf(elements);
        return currentStack;
    } // end of toString

    /**
     * This shows how many elements are in the stack. Different than the length of the stack because there could be more indexes,
     * but only as many elements as the top index or the top of the stack's value.
     * @return the size of the index
     */
    public int size(){
        return topIndex+1;
    } // end of size method

    /**
     * This will remove as many topIndexes as the user decides. If the index is lower than the user input, then
     * it will throw an exception, if not it will remove as many indexes as desired.
     * @param count how many indexes the user wants to pop off
     */
    public void popSome(int count){
        if(topIndex < count) {
            throw new StackUnderflowException();
        }
        else{
            elements[topIndex] = null;
        }
    } // end of popSome method

    /**
     * This swaps the top two indexes, however if the index doesn't have at least 2, then the method returns false because
     * it cannot switch values if there is no value to switch with. If it does have more than 2 then it will switch the
     * top two elements and return true.
     * @return
     */
    public boolean swapStart(){
        int swapStartAmount = 2;
        if(topIndex < swapStartAmount){
            return false;
        }
        else{
            T holder = elements[topIndex];
            elements[topIndex] = elements[topIndex-1];
            elements[topIndex-1] = holder;

            return true;
        }
    } // end of swapStart method

    /**
     * This is set the top index to null and point to the next index, and return the orginal value of the top. If the index
     * is -1 that means the stack is empty and it will throw an exception.
     * @return
     */
    public T poptop(){
        if(topIndex == -1){
            throw new StackUnderflowException();
        }
        else{
            T oldTop = elements[topIndex];
            elements[topIndex] = null;
            topIndex--;
            return oldTop;
        }
    }


}