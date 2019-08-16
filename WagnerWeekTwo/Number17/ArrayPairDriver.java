/**
 * Sarah Wagner, Week Two, #17, This is the driver file to test the ArrayPair class
 */

public class ArrayPairDriver {

    public static void main(String[] args)
    {
        PairInterface <Integer> myPair  = new ArrayPair<Integer>(1,2);
        System.out.println(myPair.getFirst() + " ");
        myPair.setSecond(4);
        System.out.println(myPair.getSecond());
    } // end of main
} // end of class
