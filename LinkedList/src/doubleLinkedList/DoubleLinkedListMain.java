package doubleLinkedList;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.creatingDouble(5);
        list.traversingDouble();

        list.insertingDouble(10, 1);
        list.traversingDouble();

        list.insertingDouble(20, 2);
        list.traversingDouble();

        list.insertingDouble(30, 3);
        list.traversingDouble();

        list.insertingDouble(40, 4);
        list.traversingDouble();


        System.out.println("\nSearching the node having value 40: ");
        list.searchingDouble(40);

        System.out.println("\n\nSearching the node having value 400: ");
        list.searchingDouble(400);


        System.out.println("\n\nLinked List in order");
        list.traversingDouble();
        System.out.println("Linked List in reverse order");
        list.traversingDoubleInReverseOrder();


        System.out.println("\n\nDeleting the node having location = 2: ");
        System.out.println("List before deletion: ");
        list.traversingDouble();
        list.deletingFromIndexDouble(2);
        System.out.println("List after deletion: ");
        list.traversingDouble();


        System.out.println("\n\nDeleting the node having location = 3: ");
        System.out.println("List before deletion: ");
        list.traversingDouble();
        System.out.println("------>"+ list.getSize());
        list.deletingFromIndexDouble(3);
        System.out.println("List after deletion: ");
        list.traversingDouble();


        list.deletingDouble();
        list.traversingDouble();

    }
}
