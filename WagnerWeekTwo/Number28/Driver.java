/**
 * Sarah Wagner, Week Two #28 Driver File
 */

import ch02.stacks.StackInterface;

public class Driver {
    public static void main(String[] args) {

        MyExtendedArrayBoundedStack testerStack = new MyExtendedArrayBoundedStack(); // Create the new object
        System.out.println(testerStack.toString() + " "); // using the toString method

        int amount = testerStack.size(); // see the size of the stack
        System.out.println(amount);

        testerStack.popSome(1); // Take off the 1 index from the top

        testerStack.swapStart(); // calling the swap method

        testerStack.poptop(); // caling the poptop method



    }
}
