package Blatt7.Aufgabe2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

    public void printLevelOrder(){
        LinkedList<TNode> tNodes= new LinkedList<>();
        tNodes.add(root);
        while (!tNodes.isEmpty()){
            TNode pop = tNodes.pop();
            System.out.println(pop.getData());
            if(pop.getLeft()!=null)tNodes.add(pop.getLeft());
            if(pop.getRight()!=null)tNodes.add(pop.getRight());
        }
    }
}
