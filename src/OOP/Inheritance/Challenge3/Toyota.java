package OOP.Inheritance.Challenge3;

public class Toyota extends Car {
    private int roadServiceMonths;

    public Toyota(int roadServiceMonths) {
        super("Toyota", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity()+rate;
        if(newVelocity==0){
            stop();
            changeGear(1);
        }else if(newVelocity >0 && newVelocity <=10){
            changeGear(1);
        }else if(newVelocity >0 && newVelocity <=10){
            changeGear(2);
        }else if(newVelocity >0 && newVelocity <=10){
            changeGear(3);
        }else{
            changeGear(4);
        }
        if(newVelocity > 0){
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }
}
