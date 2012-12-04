package generics;

/**
 * Generic version of the Box class.
 */
public class GenericBox<K> {

    private K t; // T stands for "Type"

    public void add(K t) {
        this.t = t;
    }

    public K get() {
        return t;
    }
}