package OneD;

public class SingleDimensionArrayMain {
    public static void main(String[] args) {
        System.out.println("Creating a blank array of size 10...");
        SingleDimensionArray oneDArray = new SingleDimensionArray(10);


        System.out.println("Printing the Array...");
        oneDArray.traversingArray();
        System.out.println();
        System.out.println();

        System.out.println("Inserting few values in the array...");
        oneDArray.insertingArray(0,0);
        oneDArray.insertingArray(1,10);
        oneDArray.insertingArray(2,20);
        oneDArray.insertingArray(3,30);
        oneDArray.insertingArray(4,40);
        oneDArray.insertingArray(5,50);
        oneDArray.insertingArray(6,60);
        oneDArray.insertingArray(7,70);
        oneDArray.insertingArray(8,80);
        oneDArray.insertingArray(1,100);
        oneDArray.insertingArray(12,120);
        System.out.println();
        System.out.println();


        System.out.println("Printing the Array...");
        oneDArray.traversingArray();
        System.out.println();
        System.out.println();



        System.out.println("Accessing cell number#1...");
        oneDArray.accessingArray(1);
        System.out.println();
        System.out.println();


        System.out.println("Accessing cell number#5...");
        oneDArray.accessingArray(5);
        System.out.println();
        System.out.println();


        System.out.println("Accessing cell number#15...");
        oneDArray.accessingArray(15);
        System.out.println();
        System.out.println();


        System.out.println("Searching 30 in the array...");
        oneDArray.searchingArray(30);
        System.out.println();
        System.out.println();


        System.out.println("Searching 400 in the array...");
        oneDArray.searchingArray(400);
        System.out.println();
        System.out.println();



        System.out.println("Deleting value from Cell#3 of array...");
        System.out.println("Before Deleting: ");
        oneDArray.traversingArray();
        oneDArray.deletingFromIdxArray(3);
        System.out.println();
        System.out.println("After Deleting: ");
        oneDArray.traversingArray();
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Deleting value from Cell#15 of array...");
        System.out.println("Before Deleting: ");
        oneDArray.traversingArray();
        oneDArray.deletingFromIdxArray(15);
        System.out.println("After Deleting: ");
        oneDArray.traversingArray();
        System.out.println();
        System.out.println();
        System.out.println();



        oneDArray.deleteArray();
        System.out.println("After Deleting: ");
        oneDArray.traversingArray();

    }
}
