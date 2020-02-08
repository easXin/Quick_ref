package doubleCircular;

public class DoubleCircularLinkedListMain {
    public static void main(String[] args) {
        DoubleCircularLinkedList list = new DoubleCircularLinkedList();
        list.creatingCircularDouble(5);
        list.insertingCircularDouble(10, 1);
        list.insertingCircularDouble(20, 2);
        list.insertingCircularDouble(30, 2);
        list.insertingCircularDouble(40, 1);



        System.out.println("\nSearching the node having value 40: ");
        list.searchingCircularDouble(40);

        System.out.println("\nSearching the node having value 200: ");
        list.searchingCircularDouble(200);


        System.out.println("\n\nDeleting the node having location = 0: ");
        System.out.println("Before Deletion...");
        list.traversingCircularDouble();
        list.deletingFromIndexCircularDouble(0);
        System.out.println("After Deletion...");
        list.traversingCircularDouble();

        System.out.println("\n\nDeleting the node having location = 3: ");
        System.out.println("Before Deletion...");
        list.traversingCircularDouble();
        list.deletingFromIndexCircularDouble(3);
        System.out.println("After Deletion...");
        list.traversingCircularDouble();

        System.out.println("\n\nDeleting the node having location = 20: ");
        System.out.println("Before Deletion...");
        list.traversingCircularDouble();
        list.deletingFromIndexCircularDouble(20);
        System.out.println("After Deletion...");
        list.traversingCircularDouble();


        list.deletingCircularDouble();
        list.traversingCircularDouble();

    }

}
