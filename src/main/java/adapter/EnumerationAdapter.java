package adapter;

import iterator.Iterator;

import java.util.Enumeration;

public class EnumerationAdapter implements Iterator {

    private Enumeration enumeration;

    public EnumerationAdapter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
