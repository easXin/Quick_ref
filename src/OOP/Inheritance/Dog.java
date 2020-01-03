package OOP.Inheritance;
// inheritance extends
public class Dog extends Animal{
    /* Attributes that only dog has it */
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    // must use constructor in the inheritance
    /* Attributes that all the animal have */
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // call the constructor of where we instantiate from
        super(name, 1, 1, 1, weight);
        // all dog has 1 brain and 1 body
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    // only unique to dog class
    private void chew(){
        System.out.println("Dog.chew() called");
    }
    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        // call superclass or hiding super class's implementation
        /*use super to call equivalent method in the super class*/
        super.eat();
    }
    private void moveLegs(int speed){
        System.out.println("Dog.legs called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
