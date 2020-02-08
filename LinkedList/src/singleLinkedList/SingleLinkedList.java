package singleLinkedList;

public class SingleLinkedList {
    private SingleNode head;
    private SingleNode tail;
    private int size;
    // Node:  1) data | 2) reference to next node
    // Creation O(1)  O(1)
    public SingleNode createSingleLinkedList(int val){
        head = new SingleNode();
        SingleNode node = new SingleNode();
        node.setValue(val);
        node.setNext(null);
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    // Insertion O(n) O(1)
    public void insertingLinkedList(int val, int loc){
        SingleNode node = new SingleNode();
        node.setValue(val);  // 10  1
        // 1. Linked list doesn't exist
        if(!isExistedLinkedList()){
            System.out.println("The linked list doesn't exist");
        }
        // 2. Insert at first location
        else if(loc == 0){
            node.setNext(head);
            head = node;
        }
        // 3. Insert at last location
        else if(loc >= size){
            node.setNext(null);
            tail.setNext(node);
            tail = node;
        }
        // 4. Insert at specified location
        else{
            // move point to the one point backward
            SingleNode temp = head;
            int index = 0;
            while(index < loc-1){
                temp = temp.getNext();
                index++;
            }
            SingleNode nextNode = temp.getNext();
            temp.setNext(node);
            node.setNext(nextNode);
        }
        setSize(getSize()+1);
    }
    // Searching O(n) O(1)
    public boolean searchingNode(int val){
        if(!isExistedLinkedList()){
            SingleNode temp = head;
            int index = 0;
            while(index <getSize()){
                if(temp.getValue() == val){
                    System.out.println("Value "+val+" is found at index "+index);
                    return true;
                }
                temp = temp.getNext();
                index++;
            }
        }
        System.out.println("Node is not found");
        return false;
    }
    // Traversing O(n) O(1)
    public void traversingLinkedList(){
        if(isExistedLinkedList()){
            SingleNode temp = head;
            for(int i=0; i<getSize(); i++){
                System.out.print(temp.getValue()+" ");
                temp = temp.getNext();
            }
        }else{
            System.out.println("Linked list doesn't exist");
        }
        System.out.println("\n");
    }
    // Deleting a node O(n) O(1)
    public void deletingNode(int loc){
        // 1. Linked list doesn't exist
        if(!isExistedLinkedList()){
            System.out.println("The linked list doesn't exist");
            return;
        }
        // 2. Delete at first location
        else if(loc == 0){
            head = head.getNext();
            setSize(getSize()-1);
            if(getSize()==0){
                tail = null;
            }
        }
        // 3. Delete at last location
        else if(loc >= getSize()){
            SingleNode temp = head;
            for(int i=0; i<getSize()-1;i++){
                temp = temp.getNext();
            }
            if(temp == head){
                head = null;
                tail = null;
                setSize(getSize()-1);
                return;
            }
            temp.setNext(null);
            tail = temp;
            setSize(getSize()-1);
        }
        // 4. Delete at specified location
        else{
            SingleNode temp = head;
            for(int i=0; i<loc; i++){
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
            setSize(getSize()-1);
        }
    }
    // Deleting a linked list O(1) O(1)
    public void deleteLinkedList(){
        System.out.println("Deleting Linked List");
        head=null;
        tail=null;
        System.out.println("Linked List deleted successfully");
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
