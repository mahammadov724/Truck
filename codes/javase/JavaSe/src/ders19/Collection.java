package ders19;

import java.util.HashSet;
import java.util.Set;

public class Collection<T> {
    private Set<T> hs;

    public Collection() {
        hs = new HashSet<>();
    }

    public void addElement(T element) {
        hs.add(element);
    }

    public void printElement() {
        for (T element : hs) {
            System.out.println(element);
        }
    }

    public int size() {
        return hs.size();
    }
}
