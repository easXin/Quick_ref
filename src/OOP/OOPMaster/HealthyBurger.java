package OOP.OOPMaster;

public class HealthyBurger extends Hamburger {
    private String healthyBurgerItem1;
    private double healthyBurgerPrice1;

    private String healthyBurgerItem2;
    private double healthyBurgerPrice2;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "brown rye");
    }
    public void addHealthyItem1(String name, double price){
        this.healthyBurgerItem1 = name;
        this.healthyBurgerPrice1 = price;
    }
    public void addHealthyItem2(String name, double price){
        this.healthyBurgerItem2 = name;
        this.healthyBurgerPrice2 = price;
    }

    @Override
    public double itemizeHamburger() {
        double healthyBurgerPrice = super.itemizeHamburger();
        if(healthyBurgerItem1!= null){
            healthyBurgerPrice += this.healthyBurgerPrice1;
            System.out.println("Added "+this.healthyBurgerItem1+" for an extra "+this.healthyBurgerItem1);
        }
        if(healthyBurgerItem2!= null){
            healthyBurgerPrice += this.healthyBurgerPrice2;
            System.out.println("Added "+this.healthyBurgerItem2+" for an extra "+this.healthyBurgerItem2);
        }
        return healthyBurgerPrice;
    }
}
