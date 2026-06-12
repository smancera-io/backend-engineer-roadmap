public class Main {
    public static void main(String[] args) {

        /* Inicialize 2 BankAccount objets */
        BankAccount BankAccount1 = new BankAccount("samuel", 0);
        BankAccount BankAccount2 = new BankAccount("samuel", 0);
        
        /* Use deposit method */
        BankAccount1.deposit(-2); // Validate a logic amount
        BankAccount2.deposit(2500); // Use in a correct way

        /* Use printBalance method */
        BankAccount1.printBalance();
        BankAccount2.printBalance();

        /* Use withdraw method */
        BankAccount1.withdraw(5); // Validate enough balance
        BankAccount2.withdraw(2000); // Use in a correct way


    }
}
