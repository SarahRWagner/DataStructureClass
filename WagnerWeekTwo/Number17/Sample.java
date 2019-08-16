/**
 * Sarah Wagner, Week Two, #17, THis is the sample driver class for the BasicPair class and PairInterface
 */
public class Sample {

    public static void main(String[] args)
    {
        PairInterface <String> myPair  = new BasicPair <String> ("apple", "peach");
        System.out.println(myPair.getFirst() + " ");
        myPair.setSecond("orange");
        System.out.println(myPair.getSecond());
    } // end of main
} // end of class
