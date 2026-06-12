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

    /* Declare deposit method */
    public void deposit (double amount) {
        if (amount <= 0){
            System.out.println("Error: the deposit amount couldn't be less than or equal to 0");
        } else {
            balance += amount;
            System.out.println("Successful deposit");
            System.out.printf("Your new balance is $%.2d", balance);
        }
    }
}