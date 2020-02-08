package doubleLinkedList;

public class DoubleLinkedList {
    private DoubleNode head;
    private DoubleNode tail;
    private int size;
    // Creation O(1) O(1)
    public DoubleNode creatingDouble(int val){
        head = new DoubleNode();
        DoubleNode node = new DoubleNode();
        node.setValue(val);
        node.setPrev(null);
        node.setNext(null);
        head = tail = node;
        size =1;
        return head;
    }
    // Insertion O(n) O(n)
    public void insertingDouble(int val, int loc){
        DoubleNode node = new DoubleNode();
        node.setValue(val);
        // 1. Linked list doesn't exist
        if(!isExistedLinkedList()){
            System.out.println("The linked list doesn't exist");
            return;
        }
        // 2. Insert at head
        else if(loc == 0){
            node.setNext(head);
            node.setPrev(null);
            head.setPrev(node);
            head = node;
        }
        // 3. Insert at tail
        else if(loc >= size){
            node.setNext(null);
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
        // 4. Insert at any position
        else{
            DoubleNode temp = head;
            for(int i=0; i<loc; i++){
                temp = temp.getNext();
            }
            node.setPrev(temp);
            node.setNext(temp.getNext());
            temp.setNext(node);
            node.getNext().setPrev(node);
        }
        size++;
    }
    // Traverse O(n) O(1)
    public void traversingDouble(){
        if(isExistedLinkedList()){
            DoubleNode temp = head;
            for(int i=0; i<size; i++){
                System.out.print(temp.getValue() +" ");
                temp = temp.getNext();
            }
        }else{
            System.out.println("Linked list doesn't exist");
        }
        System.out.println();
    }
    // Searching O(n) O(1)
    public boolean searchingDouble(int val){
        if(isExistedLinkedList()){
            DoubleNode temp = head;
            for(int i=0; i<size; i++){
                if(temp.getValue()==val){
                    System.out.println("Value "+ val +" is found at index "+i);
                    return true;
                }
                temp=temp.getNext();
            }
        }else{
            System.out.println("Linked list doesn't exist");
        }
        System.out.println("Node is not found");
        return false;
    }
    // Delete a node O(n) O(1)
    public void deletingFromIndexDouble(int loc){
        // 1. linked list doesn't exist
        if(!isExistedLinkedList()){
            System.out.println("The linked list doesn't exist");
        }
        // 2. delete from head
        else if(loc == 0){
            if(getSize()==1){
                head = tail = null;
                setSize(getSize()-1);
            }else{
                head = head.getNext();
                head.setPrev(null);
                setSize(getSize()-1);
            }
        }
        // 3. delete from tail
        else if(loc >= size){
            DoubleNode temp = tail.getPrev();
            if(getSize()== 1){
                head = tail = null;
                setSize(getSize()-1);
            }
            temp.setNext(null);
            tail = temp;
            setSize(getSize()-1);
        }
        // 4. delete from any position
        else{
            DoubleNode temp = head;
            int i;
            for( i=0; i<loc; i++){
                temp = temp.getNext();
            }
            if(getSize()== 1){
                head = tail = null;
                setSize(getSize()-1);
                return;
            }

            System.out.println(i + " : " + loc );
            // __ __ __ __
            if(temp.getNext() != null) {
                temp.setNext(temp.getNext().getNext());
                temp.getNext().setPrev(temp);
                setSize(getSize() - 1);
                return;
            }else{
                temp = temp.getPrev();
                setSize(getSize()-1);
            }
        }
    }
    // traversing O(n) O(1)
    public void traversingDoubleInReverseOrder(){
        if(isExistedLinkedList()){
            DoubleNode temp = tail;
            for(int i=0; i<size; i++){
                System.out.print(temp.getValue() +" ");
                temp = temp.getPrev();
            }
        }else{
            System.out.println("Linked list doesn't exist");
        }
    }
    // Delete entire double linked  O(n) O(1)
    public void deletingDouble(){
        System.out.println("Deleting linked list");
        DoubleNode temp = head;
        for(int i=0; i<size; i++){
            temp.setPrev(null);
            temp = temp.getNext();
        }
        head = tail = null;
        System.out.println("Linked list is deleted");
    }
    public boolean isExistedLinkedList(){
        return head!=null;
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
