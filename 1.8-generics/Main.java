public class Main {
    public static void main(String[] args) {
        Caja<String> names = new Caja<>();
        names.setItem("Samuel");
        Caja<Integer> numbers = new Caja<>();
        numbers.setItem(47);
        System.out.println(names.getItem());
        System.out.println(numbers.getItem());
    }
}
