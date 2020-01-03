package OOP.Constructors.Challege1;

public class Account {
    private String accountNumber, customerName, customerEmail,customerNumber;
    private double balance;
    /* additional method */
    public Account(){
        System.out.println("Issued new account");
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
