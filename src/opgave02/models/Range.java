package opgave02.models;

import java.util.Iterator;

//I models pakken klassen Range der repræsenterer en talrække. Implementer
//iterator metoden i Range klassen, så den returnerer en RangeIterator.


public class Range implements Iterable<Integer>{
    private int from;
    private int to;

    public Range(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator(from, to);
    }
}
