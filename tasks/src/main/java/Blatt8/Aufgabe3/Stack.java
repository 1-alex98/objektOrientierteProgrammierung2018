package Blatt8.Aufgabe3;

import java.util.*;

public class Stack<T> extends ArrayList<T> implements StackInterface<T> {

    @Override
    public Stack<T> push(T element) {
        add(element);
        return this;
    }

    @Override
    public T pop() {
        T t = get(size()-1);
        remove(t);
        return t;
    }
}
