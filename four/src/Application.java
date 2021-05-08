public class Application {
    public static void main(String[] args) {
        Human ahmed = new Human("Ahmed", 20);
        Human fatima = new Human("Fatima", 23);
        Human Mohamed = new Human("Mohamed", 1);

        ahmed.selfIntroduce();

        fatima.selfIntroduce();

        Human.oxygenIntake = "Injection";

        ahmed.selfIntroduce();

        fatima.selfIntroduce();

        Mohamed.selfIntroduce();
        Mohamed.talk("Hello this is me");
        Mohamed.grow();
        Mohamed.talk("Hello");
        Mohamed.selfIntroduce();

        System.out.println(Human.getTalkingAge());
        Human.setTalkingAge(3);
        System.out.println(Human.getTalkingAge());
        Mohamed.selfIntroduce();

//        System.out.println(Human.oxygenIntake);
    }
}
