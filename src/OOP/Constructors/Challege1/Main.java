package OOP.Constructors.Challege1;

public class Main {
    public static void main(String[] args) {
        Account newAccount = new Account();
        newAccount.setAccountNumber("12345");
        newAccount.setBalance(0.0);
        newAccount.setCustomerName("John");
        newAccount.setCustomerEmail("myEmail@icloud.com");
        newAccount.setCustomerNumber("123-456-7890");

        newAccount.withdrawa(100.0);

        newAccount.depositFunds(50.0);
        newAccount.withdrawa(100.0);

        newAccount.depositFunds(51.0);
        newAccount.withdrawa(100.0);

        System.out.println(newAccount.toString());
    }
}
