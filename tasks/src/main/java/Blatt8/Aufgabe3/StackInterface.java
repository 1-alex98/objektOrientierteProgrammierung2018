package Blatt8.Aufgabe3;

import java.util.List;

interface StackInterface<T> extends List<T>{
    StackInterface<T> push(T element);
    T pop();
}
