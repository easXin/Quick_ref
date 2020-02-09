package ArrQueue;

public class QueueByArrMain {
    public static void main(String[] args) {

        System.out.println("Creating an empty queue...");
        QueueByArr queue = new QueueByArr(5);

        System.out.println("Enqueuing 6 values in the queue...");
        for (int i = 1; i <= 6; i++) {
            queue.enqueue(i * 10);
        }

        System.out.println("Peek value from queue...");
        queue.peek();

        System.out.println("Dequeue 6 values from queue...");
        for (int i = 0; i <= 5; i++) {
            queue.dequeue();
        }

        System.out.println("Deleting the entire Queue...");
        queue.deleteQueue();

    }
}
