public class Main {
    public static void main(String[] args) {

        /* Inicialize 2 BankAccount objets */
        BankAccount bankAccount1 = new BankAccount("samuel", 0);
        BankAccount bankAccount2 = new BankAccount("samuel", 0);
        
        /* Use deposit method */
        bankAccount1.deposit(-2); // Validate a logic amount
        bankAccount2.deposit(2500); // Use in a correct way

        /* Use printBalance method */
        bankAccount1.printBalance();
        bankAccount2.printBalance();

        /* Use withdraw method */
        bankAccount1.withdraw(5); // Validate enough balance
        bankAccount2.withdraw(2000); // Use in a correct way

        /* Use the static attribute */
        System.out.println(BankAccount.getAccountCounter());

    }
}
