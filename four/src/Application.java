public class Application {
    public static void main(String[] args) {
        Human ahmed = new Human("Ahmed", 20);
        Human fatima = new Human("Fatima", 23);
        Human mohamed = new Human("Mohamed", 1);
        Human sarah = Human.born("Sarah");

        ahmed.talk();
        fatima.talk();
        mohamed.talk();
        System.out.println(sarah.getAge());
        sarah.talk();
    }
}
