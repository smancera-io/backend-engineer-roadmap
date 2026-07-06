public class BankAccount {

    /* Add attributes */
    private String owner;
    private long accountNumber;
    private double balance;

    /* Add a static attribute */
    private static int accountCounter = 0;

    /* Create constructor */
    public BankAccount (String owner, double balance){
        this.owner = owner;
        this.accountNumber = setAccountNumber();
        this.balance = balance;
        accountCounter ++;
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
    public static int getAccountCounter () {
        return accountCounter;
    }

    /* Declare setter methods */
    public void setOwner (String owner) {
        this.owner = owner;
    }
    public long setAccountNumber () {
        this.accountNumber = (long) (Math.random() * 1000000000) + 1;
        return accountNumber;
    }

    /* Declare deposit method */
    public void deposit (double amount) {
        if (amount <= 0){
            throw new CantidadNegativaException("La cantidad ingresada es negativa o igual a 0"); // Use personalized exception
        } else {
            balance += amount;
            System.out.printf("Successful deposit in the account: %d \n", getAccountNumber());
            System.out.printf("Your new balance is $%.2f \n", getBalance());
        }
    }

    /* Declare withdraw method */
    public void withdraw (double amount) {
        if ( amount > getBalance()){
            throw new SaldoInsuficienteException("Saldo insuficiente para hacer la operacion"); // Use personalized exception
        } else { if (amount <= 0){
            throw new CantidadNegativaException("La cantidad ingresada es negativa o igual a 0"); // Use personalized exception
        } else {
            balance -= amount;
            System.out.printf("Successful withdraw in the account: %d \n", getAccountNumber());
            System.out.printf("Your new balance is $%.2f \n", getBalance());
            }
        }
    }

    /* Declare printBalance method */
    public void printBalance (){
        System.out.printf("Your balance in the account %d is $%.2f \n", getAccountNumber(), getBalance());
    }
}