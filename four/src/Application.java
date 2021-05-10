public class Application {
    public static void main(String[] args) {
        Human ahmed = new Human("Ahmed", 20);

        Food apple = new Food("Apple");
        Drink water = new Drink("Water");
        Cloth shirt = new Cloth();

        ahmed.eastOrDrink(shirt);

        ahmed.consume(water);
        ahmed.consume(water);

//        System.out.println();
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
