public class Main {
    public static void main(String[] args) {
        /* Use try block */
        try {

            /* Inicialize 2 BankAccount objets */
            BankAccount bankAccount1 = new BankAccount("samuel", 0);
            BankAccount bankAccount2 = new BankAccount("samuel", 0);

            /* Use deposit method */
            bankAccount1.deposit(-2); // Validate a logic amount and test handle exception
            bankAccount2.deposit(2500); // Use in a correct way

            /* Use printBalance method */
            bankAccount1.printBalance();
            bankAccount2.printBalance();

            /* Use withdraw method */
            bankAccount1.withdraw(5); // Validate enough balance and test handle exception
            bankAccount2.withdraw(2000); // Use in a correct way

            /* Add catch and finally blocks */
        } catch (SaldoInsuficienteException | CantidadNegativaException e) {
            if (e instanceof SaldoInsuficienteException) {
                System.out.println("Error:" + e.getMessage());
            } else if (e instanceof CantidadNegativaException) {
                System.out.println("Error: " + e.getMessage());
            }
        } finally {
            System.out.println("Fin de la sesion");
        }

        /* Use the static attribute */
        System.out.println(BankAccount.getAccountCounter());
    }
}
