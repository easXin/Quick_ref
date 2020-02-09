package WithArray;

public class StackByArray {
    int [] arr;
    // keeps track of last occupied pos
    int topOfStack; // stack with -1

    public StackByArray(int size){
        create(size);
    }
    // create O(1) O(1)
    public void create(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Successfully created an empty stack");
    }
    // push O(1) O(n)
    public void push(int val){
        if(isFull()){
            System.out.println("Stack is full");
        }else{
          arr[topOfStack+1] = val;
          topOfStack++;
          System.out.println("Successfully inserted value "+ val+" in the stack");
        }
    }
    // pop O(1) O(1)
    public void pop(){
        if(isEmpty()){
            System.out.println("Action cannot be performed");
        }else{
            System.out.println("Successfully deleted value " + arr[topOfStack]+" from stack");
            topOfStack--;
        }
    }
    // peek O(1) O(1)
    public void peek(){
        if(isEmpty()){
            System.out.println("The stack is empty");
        }else{
            System.out.println("Top of stack : " + arr[topOfStack]);
        }
    }
    // isEmpty O(1) O(1)
    public boolean isEmpty(){
        if(topOfStack == -1){
            return true;
        }
        return false;
    }
    // isFull O(1) O(1)
    public boolean isFull(){
        if(topOfStack == arr.length-1){
            System.out.println("Stack is full");
            return true;
        }else{
            return false;
        }
    }
    // delete stack O(1) O(1)
    public void deleteStack(){
        arr = null;
        System.out.println("Stack is successfully deleted");
    }
}
