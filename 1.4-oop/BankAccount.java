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

    /* Declare getter methods */
    public String getOwner () {
        return owner;
    }
    public long getAccountNumber () {
        return accountNumber;
    }
    public double getBalance () {
        return balance;
    }

    /* Declare setter methods */
    public void setOwner (String owner) {
        this.owner = owner;
    }
    public void setBalance (double balance) {
        this.balance = balance;
    }
}