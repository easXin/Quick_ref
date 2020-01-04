package OOP.Polymorphism.Challenge;

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    public String startEngine(){
        /* locate class loc, get class name*/
        return getClass().getSimpleName() + " -> startEngine()";
       // return "Car -> startEngine()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }
}

class Nissan extends Car{
    public Nissan(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Nissan -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Nissan -> accelerate()";
    }

    @Override
    public String brake() {
        return "Nissan -> brake()";
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Spot car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Nissan rogue = new Nissan(6,"SUV SL");
        System.out.println(rogue.startEngine());
        System.out.println(rogue.accelerate());
        System.out.println(rogue.brake());
    }
}
/*
*       classType ref = new Object(param){
*            @override
*            # blahblahblah                           # incline class
*       }
* */