package singleCircular;

import singleLinkedList.SingleNode;

public class SingleCircularLinkedList {
    private SingleNode head;
    private SingleNode tail;
    private int size;

    // head: 111  tail: 111  Node: 10 | 111
    // creating O(1) O(1)
    public SingleNode creatingCircular(int val){
        head = new SingleNode();
        SingleNode node = new SingleNode();
        node.setValue(val);
        node.setNext(node);
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    // inserting O(n) O(1)
    public void insertingCircular(int val, int loc){
        SingleNode node = new SingleNode();
        node.setValue(val);
        System.out.println("Inserting value "+val+" at location: " + loc);
        // 1. Linked list doesn't exist
        if(!isExistedLinkedList()){
            System.out.println("Linked list doesn't exist");
            return;
        }
        // 2. Insert at first position
        else if(loc == 0){
            node.setNext(head);
            head = node;
            tail.setNext(node);
            // __ __ __
        }
        // 3. Insert at last position
        else if(loc >= size){
           tail.setNext(node);
           tail = node;
           tail.setNext(head);
        }
        // 4. Insert at any position
        else{
            SingleNode temp = head;
            for(int i=0; i<loc; i++){
                temp = temp.getNext();
            }
            // __ x __
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
        size++;
    }
    // traversing O(n) O(1)
    public void traversingCircular(){
        if(isExistedLinkedList()){
            SingleNode temp = head;
            for(int i=0; i<size; i++){
                System.out.print(temp.getValue()+" ");
                temp = temp.getNext();
            }
        }else{
            System.out.println("Linked list doesn't exist");
        }
        System.out.println();
    }
    // searching O(n) O(1)
    public boolean searchingCircular(int val){
        if(isExistedLinkedList()){
            SingleNode temp = head;
            for(int i=0; i<size; i++){
                if(temp.getValue() == val){
                    System.out.println("Value "+val+" is found at index "+i);
                    return true;
                }
                temp = temp.getNext();
            }
        }else{
            System.out.println("Node is not found");
        }
        return false;
    }
    // deleting O(n) O(1)
    public void deletingFromIdxCircular(int loc){
        // 1. Linked list doesn't exist
        if(!isExistedLinkedList()){
            System.out.println("Linked list doesn't exist");
        }
        // 2. Delete from front
        else if(loc == 0){
            head = head.getNext();
            tail.setNext(head);
            setSize(getSize()-1);
            if(getSize() == 0 ){
                tail = null;
            }
        }
        // 3. Delete from back
        else if(loc >= size){
            SingleNode temp = head;
            for(int i=0; i<size; i++){
                temp = temp.getNext();
            }
            if(temp == head){
                head = tail = null;
                setSize(getSize()-1);
                return;
            }
            temp.setNext(head);
            tail = temp;
            setSize(getSize()-1);
        }
        // 4. Delete from any position
        else{
            SingleNode temp = head;
            for(int i=0; i<loc; i++){
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
            setSize(getSize()-1);
            // __ __ __ __
        }
    }
    // deleting all linked list O(1) O(1)
    public void deletingCircular(){
        System.out.println("Deleting Circular Linked List");
        if(isExistedLinkedList()){
            head = tail = null;
            System.out.println("Successfully deleting circular linked list ");
        }else{
            System.out.println("Action can not be done, circular doesn't exist");
        }
    }
    public boolean isExistedLinkedList(){
        return head != null;
    }
    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }

    public SingleNode getTail() {
        return tail;
    }

    public void setTail(SingleNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
