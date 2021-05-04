public class Application {
    public static void main(String[] args) {
        Human ahmed = new Human();
        ahmed.name = "Ahmed";
        ahmed.age = 20;

        Human fatima = new Human();
        fatima.name = "Fatima";
        fatima.age = 23;

        System.out.println(ahmed.selfIntroduce());
        System.out.println(fatima.selfIntroduce());
    }
}
