package Blatt7.Aufgabe2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TTree <T> {
    private TNode<T> root;

    public void printInOrder(TNode<T> root){
        if(root==null){
            return;
        }
        printInOrder(root.getLeft());
        System.out.println(root.getData());
        printInOrder(root.getRight());
    }

    public void printPostOrder(TNode<T> root){
        if(root==null){
            return;
        }
        printPostOrder(root.getLeft());
        printPostOrder(root.getRight());
        System.out.println(root.getData());

    }

    public void printPreOrder(TNode<T> root){
        if(root==null){
            return;
        }
        System.out.println(root.getData());
        printPreOrder(root.getLeft());
        printPreOrder(root.getRight());
    }
}
