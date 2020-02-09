package WithLLS;

public class StackByLLS {
    SingleLinkedList list;

    public StackByLLS(){
        list = new SingleLinkedList();
    }
    // push O(1) O(1)
    public void push(int val){
        if(list.getHead() == null){
            list.createSingleLinkedList(val);
        }else{
            list.insertingLinkedList(val,0);
        }
        System.out.println("Inserted "+ val +" in stack ");
    }
    // pop O(1) O(1)
    public int pop(){
        int val = -1;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            val = list.getHead().getValue();
            list.deletingNode(0);
        }
        return val;
    }
    // peek O(1) O(1)
    public int peek(){
        if(!isEmpty()){
            System.out.println(list.getHead().getValue());
            return list.getHead().getValue();
        }else{
            System.out.println("The stack is empty");
            return -1;
        }
    }
    public boolean isEmpty(){
        if(list.getHead()==null){
            return true;
        }
        return false;
    }
    public void delete(){
        list.setHead(null);
    }
}
