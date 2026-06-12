public class BankAccount {

    /* Add attributes */
    private String owner;
    private long accountNumber;
    private double balance;

    /* Create constructor */
    public BankAccount (String owner, long accountNumber, double balance){
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}