package singleLinkedList;

public class SingleLinkedListMain {
    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();
        list.createSingleLinkedList(5);
        list.traversingLinkedList();

        list.insertingLinkedList(10, 1);
        list.traversingLinkedList();

        list.insertingLinkedList(20, 2);
        list.traversingLinkedList();

        list.insertingLinkedList(30, 2);
        list.traversingLinkedList();

        list.insertingLinkedList(40, 1);
        list.traversingLinkedList();

        list.traversingLinkedList();
        System.out.println();


        System.out.println("\nSearching the node having value 40...");
        list.searchingNode(40);

        System.out.println("\nSearching the node having value 500...");
        list.searchingNode(500);


        System.out.println("\n\nDeleting the node having location = 0: ");
        System.out.println("Before Deletion:");
        list.traversingLinkedList();
        list.deletingNode(0);
        System.out.println("After Deletion:");
        list.traversingLinkedList();
        System.out.println();

        System.out.println("\n\nDeleting the node having location = 2: ");
        System.out.println("Before Deletion:");
        list.traversingLinkedList();
        list.deletingNode(2);
        System.out.println("After Deletion:");
        list.traversingLinkedList();
        System.out.println();


        System.out.println("\n\nDeleting the node having location = 100: ");
        System.out.println("Before Deletion:");
        list.traversingLinkedList();
        list.deletingNode(100);
        System.out.println("After Deletion:");
        list.traversingLinkedList();
        System.out.println();


        list.deleteLinkedList();
        list.traversingLinkedList();
    }
}
