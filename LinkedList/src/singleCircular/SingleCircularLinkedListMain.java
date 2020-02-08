package singleCircular;

public class SingleCircularLinkedListMain {
    public static void main(String[] args) {
        SingleCircularLinkedList list = new SingleCircularLinkedList();
        list.creatingCircular(5);
        list.insertingCircular(10, 1);
        list.insertingCircular(20, 2);
        list.insertingCircular(30, 3);
        list.insertingCircular(40, 4);

        System.out.println("Linked List now: ");
        list.traversingCircular();

        list.insertingCircular(35, 4);
        list.traversingCircular();

        list.insertingCircular(1, 0);
        list.traversingCircular();

        list.insertingCircular(100, 10);
        list.traversingCircular();


        System.out.println("Searching the node having value 40: ");
        list.searchingCircular(40);

        System.out.println("\n\nSearching the node having value 200: ");
        list.searchingCircular(200);


        System.out.println("\n\nDeleting the node having location = 2: ");
        System.out.println("Before deletion...");
        list.traversingCircular();
        list.deletingFromIdxCircular(2);
        System.out.println("After deletion...");
        list.traversingCircular();


        System.out.println("\n\nDeleting the node having location = 0: ");
        System.out.println("Before deletion...");
        list.traversingCircular();
        list.deletingFromIdxCircular(0);
        System.out.println("After deletion...");
        list.traversingCircular();


        System.out.println("\n\nDeleting the node having location = 15: ");
        System.out.println("Before deletion...");
        list.traversingCircular();
        list.deletingFromIdxCircular(15);
        System.out.println("After deletion...");
        list.traversingCircular();


        System.out.println("\n\nDeleting the node having location = 15: ");
        System.out.println("Before deletion...");
        list.traversingCircular();
        list.deletingFromIdxCircular(15);
        System.out.println("After deletion...");
        list.traversingCircular();


        list.deletingCircular();
        list.traversingCircular();
    }
}
