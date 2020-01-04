package OOP.OOPMaster;

public class Main {
    public static void main(String[] args) {
        Hamburger burger = new Hamburger("Basic","Sausage",2.4,"Wheat");
        burger.addHamburgerAddition1("Chicken",2.00);
        burger.addHamburgerAddition2("Hot Sauce",0.40);
        burger.addHamburgerAddition3("Cheese",0.20);
        burger.addHamburgerAddition4("Sarami",0.90);
        double price = burger.itemizeHamburger();
        System.out.println("Total : " + price);
        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
        System.out.println("Total : " + healthyBurger.itemizeHamburger());
        Deluxburger bestOneOfALL = new Deluxburger();
        System.out.println("Total : " + bestOneOfALL.itemizeHamburger());

    }
}
