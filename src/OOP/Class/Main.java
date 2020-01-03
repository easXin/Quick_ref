package OOP.Class;

public class Main {
    public static void main(String[] args) {
        // create an object of car, try it as data type
        /* create an object on porsche based on the car*/
        Car porsche = new Car();
        Car holden = new Car();
        // you define the object, but haven't been initialized
        // porsche = null
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}
