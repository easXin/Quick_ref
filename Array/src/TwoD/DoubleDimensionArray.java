package TwoD;

public class DoubleDimensionArray {
    int arr[][] = null;

    public DoubleDimensionArray(int numOfR, int numOfC){
        creating2DArray(numOfR,numOfC);
    }
    // creating O(1) O(n)
    public void creating2DArray(int row, int col){
        arr = new int [row][col];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }
    // Inserting()  O(1) O(1)
    public void inserting2DArray(int row, int col, int val){
        try{
            if(arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = val;
            }else{
                System.out.println("The position "+row+"x"+col+" is already occupied");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array");
        }
    }
    // Traversing O(n) O(1)
    public void traversing2DArray(){
        try{
            for(int r=0; r<arr.length; r++){
                for(int c=0; c<arr[0].length; c++){
                    System.out.print(arr[r][c]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }catch(Exception e){
            System.out.println("Array doesn't exist");
        }
    }
    // Accessing O(1) O(1)
    public void accessing2DArray(int r, int c){
        try{
            System.out.println(arr[r][c]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array");
        }
    }
    // Searching O(n) O(1)
    public void searching2DArray(int val){
        for(int r=0; r<arr.length; r++){
            for(int c=0; c<arr[0].length; c++){
                if(arr[r][c]==val){
                    System.out.println(val+" is found at position "+r+"x"+c);
                    return;
                }
            }
        }
        System.out.println("Value is not found in array");
    }
    // Deleting O(1) O(1)
    public void deletingFromIdx2DArray(int r, int c){
        try{
            arr[r][c] = Integer.MIN_VALUE;
            System.out.println("Successfully deleted: element from " + arr[r][c]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index "+r+"x"+c+" is not int the range of array");
        }
    }
    // Delete all O(1) O(1)
    public void deleteArray(){
        arr = null;
    }
}
