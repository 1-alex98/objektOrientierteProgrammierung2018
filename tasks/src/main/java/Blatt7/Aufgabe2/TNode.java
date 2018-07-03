package Blatt7.Aufgabe2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TNode <T> {
    private T data;
    private TNode<T> left;
    private TNode<T> right;


}
