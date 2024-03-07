package opgave02.models;

import java.util.Iterator;

// Implementerer hasNext og next metoderne i RangeIterator klassen, således at
// foreach løkken i main metoden i Opgave01 udskriver tallene i den angivne
// talrække.

public class RangeIterator implements Iterator<Integer> {

    //    Returns the next element in the iteration.
//    Returns:
//    the next element in the iteration
//    Throws:
//    NoSuchElementException – if the iteration has no more elements
    private int from;
    private int to;

    public RangeIterator(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean hasNext() {
        if (from < to) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Integer next() {
        return from++;
    }
}
