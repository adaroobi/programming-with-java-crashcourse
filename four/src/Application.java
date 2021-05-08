public class Application {
    public static void main(String[] args) {
        Human ahmed = new Human("Ahmed", 20);
        Human fatima = new Human("Fatima", 23);
        Human mohamed = new Human("Mohamed", 1);
        Human sarah = Human.born("Sarah");

        Human ahmed2 = ahmed;

        println(ahmed.toString());
        println(ahmed2.toString());

        ahmed2.setAge(50);

        int x = 1;
        int y = x;
        y = 6;

        String n = "String";
        String m = n;
        m = "Stringa";

        println(ahmed.getAge());
        println(y == x);
        println(n == m);

    }

    private static void println(String text) {
        System.out.println(text);
    }

    private static void println(int text) {
        System.out.println(text);
    }

    private static void println(boolean text) {
        System.out.println(text);
    }

    private static void println(double text) {
        System.out.println(text);
    }
}
