package OOP.CompositionHASA;

public class Main {
    public static void main(String[] args) {
        Dimension dimension = new Dimension(20,20,5);
        Case theCase = new Case("2208","Dell","240",dimension);
        /* if you dont want to pass in any variable then use new className(params)*/
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27, new Resolution(2540,1440));
        Motherboard theMotherboard = new Motherboard("Bj-200","Asus",4,6,"v2.44");
        PC thePC = new PC(theCase,theMonitor,theMotherboard);
        thePC.powerUp();
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();
    }
}
