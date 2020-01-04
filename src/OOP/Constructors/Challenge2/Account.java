package OOP.Constructors.Challenge2;

public class Account {
    private String accountNumber, customerName, customerEmail,customerNumber;
    private double balance;
    /* additional method */
    public Account(){
        /* It has to be very first line of code */
        // called one constructor from another constructor with keyword this
        this("12345","John","myEmail@icloud.com","123-456-7890",0.0);
        System.out.println("Empty constructor called");
    }
    /* replacement of the set methods */
    public Account(String accountNumber, String customerName, String customerEmail, String customerNumber, double balance) {
        System.out.println("Account constructor with parameter called");
       /* use this keyword to refer the class variable*/
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerNumber = customerNumber;
        this.balance = balance;
    }

    public Account(String customerName, String customerEmail, String customerNumber) {
        /* disadvantage : Some of data need to be added manually*/
        this("12345","John","myEmail@icloud.com","123-456-7890",0.0);
    }

    public void depositFunds(double funds){
        this.balance += funds;
        System.out.println("Deposit of "+ funds +" made. New balance is " +getBalance());
    }
    public void withdrawa(double funds){
        if(funds>getBalance()){
            System.out.println("Insufficient Balance");
        }else if(funds<0){
            System.out.println("Invalid input");
        }else{
            this.balance -= funds;
            System.out.println("Successful Withdraw "+funds+ " Current balance " + getBalance() );
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerNumber='" + customerNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
