/**
 * Sarah Wagner Week Two, #17 Part C. This class implements the Interface made in part A, however
 * this differs from the Basic Pair because it deals with Arrays of any type of Object.
 * @param <T>
 */
public class ArrayPair<T> implements PairInterface<T>  {


    private T[] arr;
    private int size = 2;

    /**
     * This is the constructor for the pair of objects in the Array
     * @param first
     * @param second
     */
    public ArrayPair(T first, T second){
        arr = (T[]) new Object[size];
        this.arr[0] = first;
        this.arr[1] = second;
    }

    /**
     * These are the getters
     * @return
     */
    @Override
    public T getFirst() {
        return arr[0];
    }

    @Override
    public T getSecond() {
        return arr[1];
    }

    /**
     * These are the setters
     * @param first
     */
    @Override
    public void setFirst(T first) {
        arr[0] = first;
    }

    @Override
    public void setSecond(T second) {
        arr[1] = second;
    }


} // end of class

