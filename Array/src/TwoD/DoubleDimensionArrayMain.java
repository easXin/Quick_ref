package TwoD;

public class DoubleDimensionArrayMain {
    public static void main(String[] args) {

        System.out.println("Creating a blank array of size 5X5...");
        DoubleDimensionArray twoDArray = new DoubleDimensionArray(5,5);
        twoDArray.traversing2DArray();


        twoDArray.inserting2DArray(0,2,1000000001);
        twoDArray.traversing2DArray();

        twoDArray.inserting2DArray(0,2,1000000001);
        twoDArray.traversing2DArray();


        twoDArray.accessing2DArray(0,2);
        twoDArray.accessing2DArray(6,2);
        twoDArray.accessing2DArray(2,2);


        twoDArray.searching2DArray(10);
        twoDArray.searching2DArray(-2147483648);
        twoDArray.searching2DArray(1000000001);


        twoDArray.deletingFromIdx2DArray(0,2);
        twoDArray.traversing2DArray();


        twoDArray.deleteArray();
        twoDArray.traversing2DArray();
    }
}
