package OneD;

/**
     1) When to use array
        when there is need to store multiple similar type of data
        when random access is regular affair

     2) When to avoid array
        data to be store are non-homogeneous
        when number of data to be store is not known in advance
 */
public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int size){
        creatingArray(size);
    }

    // creating O(1) O(1)
    public void creatingArray(int size){
        arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    // inserting O(1) O(1)
    public void insertingArray(int loc, int val){
        try{
            if(arr[loc] == Integer.MIN_VALUE){
                arr[loc] = val;
                System.out.println("Successfully inserted "+ val +" at position "+loc);
            }
            else{
                System.out.println("The position "+loc +" is already occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array");
        }
    }

    // traversing O(n) O(1)
    public void traversingArray(){
        try{
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+ " ");
            }
        }catch (Exception e){
            System.out.println("Array doesn't exist ");
        }
    }

    // accessing O(1) O(1)
    public void accessingArray(int loc){
        try{
            System.out.println(arr[loc]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array");
        }
    }
    // searching O(n) O(1)
    public void searchingArray(int val){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == val){
                System.out.println("Value " +val +" is found at index "+i);
                return;
            }
        }
        System.out.println("Value "+val +" is not found");
    }
    // deleting O(1) O(1)
    public void deletingFromIdxArray(int idx){
        try{
            arr[idx] = Integer.MIN_VALUE;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index, index "+idx+" is not in the range of array ");
        }
    }
    public void deleteArray(){
        arr = null;
        System.out.println("Array has been successful deleted");
    }
}
