public class Application {
    public static void main(String[] args) {
        Human ahmed = new Human("Ahmed", 20);

        Human fatima = new Human("Fatima", 23);

        System.out.println(ahmed.selfIntroduce());
        System.out.println(fatima.selfIntroduce());
//        System.out.println(ahmed.age);
    }
}
