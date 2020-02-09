package LLQueue;

public class QueueByLLS {
    sllADT list;

    public QueueByLLS(){
        list = new sllADT();
    }
    // O(1)  O(1)
    public void enqueue(int val){
        if(list.getHead() == null){
            list.createSingleLinkedList(val);
        }else{
            list.insertingLinkedList(val,list.getSize());
        }
    }
    // O(1)  O(1)
    public int dequeue(){
        int val = -1;
        if(isQueueEmpty()){
            System.out.println("Queue is empty");
        }else{
            val = list.getHead().getValue();
            list.deletingNode(0);
        }
        return val;
    }
    // O(1)  O(1)
    public int peek(){
        int val =-1;
        if(isQueueEmpty()){
            System.out.println("Queue is empty");
        }else{
            val = list.getHead().getValue();
        }
        return val;
    }
    // O(1)  O(1)
    public boolean isQueueEmpty(){
        if(list.getHead() == null){
            return true;
        }
        return false;
    }
}
