package Blatt7.Aufgabe2;

public class Main {
    public static void main(String[] args){
        TNode<Integer> head = new TNode<>(10, new TNode<>(5, new TNode<>(3, null, new TNode<>(4, null, null)), new TNode<>(7, null, null)), new TNode<>(12, null, new TNode<>(15, new TNode<>(13, null, null), null)));
        TTree<Integer> integerTTree = new TTree<>(head);
        System.out.println("Pre");
        integerTTree.printPreOrder(integerTTree.getRoot());
        System.out.println("Post");
        integerTTree.printPostOrder(integerTTree.getRoot());
        System.out.println("In");
        integerTTree.printInOrder(integerTTree.getRoot());
    }
}
