/**
 * Sarah Wagner Week Two, #17 This is for part A of the question. It is the Basic Pair class that the Interface
 * is implemented in.
 * @param <Object>
 */
public class BasicPair<Object> implements PairInterface<Object>  {

    private Object first;
    private Object second;

    /**
     * This is the constructor that takes in the pair of objects needed.
     * @param first
     * @param second
     */
    public BasicPair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    /** These are the getters for the two objects
     * @return
     */
    @Override
    public Object getFirst() {
        return first;
    }

    @Override
    public Object getSecond() {
        return second;
    }

    /** These are the setters for the two objects
     * @param first
     */
    @Override
    public void setFirst(Object first) {
        this.first = first;
    }

    @Override
    public void setSecond(Object second) {
        this.second = second;
    }


}

