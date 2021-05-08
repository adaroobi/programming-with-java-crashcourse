public class Application {
    public static void main(String[] args) {
        Human ahmed = new Human("Ahmed", 20);

        Human fatima = new Human("Fatima", 23);

        ahmed.selfIntroduce();
        ahmed.setAge(50);
        ahmed.selfIntroduce();

        fatima.selfIntroduce();
        fatima.setAge(40);
        fatima.selfIntroduce();

        ahmed.talk("Hello");
    }
}
