public class Main {
    public static void main(String[] args) {
        /* Initialize a Caja class with String argument*/
        Caja<String> names = new Caja<>();

        /* Add String value */
        names.setItem("Samuel");

        /* Initialize a new Caja class with Integer argument */
        Caja<Integer> numbers = new Caja<>();

        /* Add Integer value */
        numbers.setItem(47);

        /* Print Cajas class values */
        System.out.println(names.getItem());
        System.out.println(numbers.getItem());
    }
}
