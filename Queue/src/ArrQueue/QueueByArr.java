package ArrQueue;
// FIFO
public class QueueByArr {
    // storage
    int [] arr;
    int beginningOfQueue; // first one in the line
    int topOfQueue; // last one in the line

    public QueueByArr(int size){
        createQueue(size);
    }
    // creation O(1) O(n)
    public void createQueue(int size){
        this.arr = new int[size];
        this.topOfQueue=-1;
        this.beginningOfQueue=-1;
        System.out.println("Successfully created an empty queue");
    }
    // enqueue O(1) O(1)
    public void enqueue(int val){
        // 1. queue is full
        if(isQueueFull()){
            System.out.println("Queue is full");
        }
        // 2. queue is empty
        else if(isQueueEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = val;
            System.out.println("Successfully inserted "+ val+" in the queue");
        }
        // 3. just push
        else{
            topOfQueue++;
            arr[topOfQueue] = val;
            System.out.println("Successfully inserted "+ val+" in the queue");
        }
        printQueue();
        System.out.println();
    }
    // dequeue O(1) O(1)
    public void dequeue(){
        // 1. queue is empty
        if(isQueueEmpty()){
            System.out.println("Dequeue cannot be performed");
        }
        // 2. just dequeue, 1 Element
        else {
            System.out.println("Dequeued value " + arr[beginningOfQueue] + " from queue");
            beginningOfQueue++;
            if(beginningOfQueue>topOfQueue){
                beginningOfQueue=topOfQueue=-1;
            }
        }
    }
    // peek O(1) O(1)
    public void peek(){
        if(isQueueEmpty()){
            System.out.println("Queue doesn't exist");
        }else{
            System.out.println(arr[beginningOfQueue]);
        }
    }
    // isEmpty
    public boolean isQueueEmpty(){
        if(beginningOfQueue == -1 || beginningOfQueue == arr.length){
            return true;
        }
        return false;
    }
    // isFull
    public boolean isQueueFull(){
        if(topOfQueue == arr.length-1){
            return true;
        }
        return false;
    }
    // delete O(1) O(1)
    public void deleteQueue(){
        arr=null;
        System.out.println("Queue is deleted");
    }
    // printQueue O(n) O(1)
    public void printQueue(){
        if(isQueueEmpty()){
            System.out.println("Queue doesn't exist");
        }else{
            for(int i=beginningOfQueue; i<=topOfQueue; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
