/**
 * Sarah Wagner Week Two, #17, this is the generic interface for a pair of objects. THe use of T allows
 * any type of object to be used by this interface.
 * @param <T>
 */

public interface PairInterface <T>{
    T getFirst();
    T getSecond();

    void setFirst(T first);
    void setSecond(T second);
}
