package doubleCircular;
import doubleLinkedList.DoubleNode;
public class DoubleCircularLinkedList {
    private DoubleNode head;
    private DoubleNode tail;
    private int size;
    // creating O(1) O(1)
    public DoubleNode creatingCircularDouble(int val){
        head = new DoubleNode();
        DoubleNode temp = new DoubleNode();
        temp.setValue(val);
        temp.setPrev(temp);
        temp.setNext(temp);
        head = temp;
        tail = temp;
        size = 1;
        return head;
    }
    // inserting O(b) O(1)
    public void insertingCircularDouble(int val, int loc){
        DoubleNode node = new DoubleNode();
        node.setValue(loc);
        // 1. LinkedList doesn't exist
        if(!isExistedDoble()){
            System.out.println("The linked list doesn't exist");
            return;
        }
        // 2. Insert at front
        else if(loc == 0){
            node.setNext(head);
            node.setPrev(tail);
            head.setPrev(node);
            tail.setNext(node);
            head = node;
        }
        // 3. Insert at tail
        else if(loc >= size){
            node.setNext(head);
            node.setPrev(tail);
            head.setPrev(node);
            tail.setNext(node);
            tail = node;
        }
        // 4. Insert at any
        else{
            DoubleNode temp = head;
            for(int i=0; i<size; i++){
                temp = temp.getNext();
            }
            // --     --  --
            //     **
            node.setPrev(temp);
            node.setNext(temp.getNext());
            temp.setNext(node);
            node.getNext().setPrev(node);
        }
        size++;
    }
    // traversing O(n) O(1)
    public void traversingCircularDouble(){
        if(isExistedDoble()){
            DoubleNode temp = head;
            for(int i=0; i<size; i++){
                System.out.print(temp.getValue() +" ");
                temp = temp.getNext();
            }
        }else{
            System.out.println("The linked list doesn't exist");
        }
    }
    // searching O(n) O(1)
    public boolean searchingCircularDouble(int val){
        if(isExistedDoble()){
            DoubleNode temp = head;
            for(int i=0; i<size; i++){
                if(temp.getValue() == val){
                    System.out.println("Value " + val + " is found at index "+ i);
                    return true;
                }
                temp = temp.getNext();
            }
        }else{
            System.out.println("The linked list doesn't exist");
        }
        return false;
    }
    // deleting  O(n) O(1)
    public void deletingFromIndexCircularDouble(int loc){
        // 1. linked list doesn't exist
        if(!isExistedDoble()){
            System.out.println("The linked list doesn't exist");
        }
        // 2. delete from head
        else if(loc == 0){
            if(size == 1){
                head.setNext(null);
                head.setPrev(null);
                head = tail = null;
                setSize(getSize() - 1);
                return;
            }else {
                head = head.getNext();
                head.setPrev(null);
                tail.setNext(head);
                setSize(getSize() - 1);
            }
        }
        // 3. delete from tail
        else if(loc > size){
            if (getSize() == 1) {
                head.setNext(null);
                head.setPrev(null);
                tail = head = null;
                setSize(getSize() - 1);
                return;
            }
            tail = tail.getPrev();
            tail.setNext(head);
            head.setPrev(tail);
            setSize(getSize() - 1);
        }
        // 4. delete from any position
        else{
            DoubleNode tempNode = head;
            for (int i = 0; i < loc - 1; i++) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            tempNode.getNext().setPrev(tempNode);
            setSize(getSize() - 1);
        }
    }
    // deleting entire linked list O(1) O(1)
    public void deletingCircularDouble(){
        DoubleNode temp = head;
        if(isExistedDoble()){
            System.out.println("The linked list doesn't exist");
            return;
        }
        for(int i=0; i<size; i++){
            temp.setPrev(null);
            temp = temp.getNext();
        }
        head.setPrev(null);
        head.setNext(null);
        tail.setPrev(null);
        tail.setNext(null);
        head = tail = null;
        System.out.println("Linked list deleted successfully");
    }

    public boolean isExistedDoble(){
        return head != null;
    }
    public DoubleNode getHead() {
        return head;
    }

    public void setHead(DoubleNode head) {
        this.head = head;
    }

    public DoubleNode getTail() {
        return tail;
    }

    public void setTail(DoubleNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
