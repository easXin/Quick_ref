package OOP.Constructors.Challege2;

public class vipPerson {
    private String name,mailAddress;
    private double creditLimit;
    public vipPerson(){
        this("Eric","mail@gmail.com",1000.0);
    }

    public vipPerson(String name, String mailAddress) {
      this(name,mailAddress,500.0);
    }

    public vipPerson(String name, String mailAddress, double creditLimit) {
        this.name = name;
        this.mailAddress = mailAddress;
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "vipPerson{" +
                "name='" + name + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", creditLimit=" + creditLimit +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}



