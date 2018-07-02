package Blatt8.Aufgabe1;

public class DoubleList {
    private DoubleNode head;

    public void add(Double data){
        DoubleNode doubleNode = new DoubleNode(data);
        if(head==null) {
            head = doubleNode;
            return;
        }
        DoubleNode cursor=head;
        while (cursor.getNext()!=null){
            cursor= cursor.getNext();
        }
        cursor.setNext(doubleNode);
    }

    public void insertFirst(Double data){
        DoubleNode doubleNode = new DoubleNode(data);
        doubleNode.setNext(head);
        head= doubleNode;
    }

    public Double get(int n){
        if (invalidIndex(n)) return null;
        DoubleNode cursor= head;
        for(int i=0;i<n;i++){
            cursor=cursor.getNext();
        }
        return cursor.getData();
    }

    public void remove(int n){
        if (invalidIndex(n)) return;
        DoubleNode cursor= head;
        for(int i=0;i<n-1;i++){
            cursor=cursor.getNext();
        }
        if(n==0){
            head=head.getNext();
            return;
        }
        cursor.setNext(cursor.getNext().getNext());

    }

    private boolean invalidIndex(int n) {
        if(n<0 || n>= size()){
            return true;
        }
        return false;
    }

    public int size(){
        int size=0;
        DoubleNode cursor= head;
        while (cursor!=null){
            size++;
            cursor = cursor.getNext();
        }
        return size;
    }
}
