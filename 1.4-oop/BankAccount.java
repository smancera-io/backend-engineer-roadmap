public class BankAccount {

    /* Add attributes */
    private String owner;
    private long accountNumber;
    private double balance;

    /* Create constructor */
    public BankAccount (String owner, double balance){
        this.owner = owner;
        this.accountNumber = setAccountNumber();
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
    public long setAccountNumber () {
        this.accountNumber = (long) (Math.random() * 1000000000) + 1;
        return accountNumber;
    }

    /* Declare deposit method */
    public void deposit (double amount) {
        if (amount <= 0){
            System.out.println("Error: the deposit amount couldn't be less than or equal to 0");
        } else {
            balance += amount;
            System.out.println("Successful deposit");
            System.out.printf("Your new balance is $%.2f \n", getBalance());
        }
    }

    /* Declare withdraw method */
    public void withdraw (double amount) {
        if ( amount > getBalance()){
            System.out.println("Error: You don't have enough balance");
        } else { if (amount == 0){
            System.out.println("Error: the deposit amount couldn't be equal to 0");
        } else {
            balance -= amount;
            System.out.println("Successful withdraw");
            System.out.printf("Your new balance is $%.2f \n", getBalance());
            }
        }
    }

    /* Declare printBalance method */
    public void printBalance (){
        System.out.printf("Your balance is $%.2f \n", getBalance());
    }
}