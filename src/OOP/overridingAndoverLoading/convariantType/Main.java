package OOP.overridingAndoverLoading.convariantType;

class Vehicle{

    public Vehicle makeType(){
        System.out.println("This is from the vehicle Method");
        return new Vehicle();
    }
}

class Car extends Vehicle{
    @Override
    public Car makeType() {
        // override the method, and return a more specific type
        return new Car();
    }
}


public class Main {
}
