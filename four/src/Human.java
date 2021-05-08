public class Human {
    final private String name; // Instance Variable
    private int age; // Instance Variable

    public static String oxygenIntake = "Breathing"; // Class Variable
    private static int talkingAge = 2; // Class variable

    public Human(String humanName, int humanAge) {
        name = humanName;
        age = humanAge;
    }

    public Human(String humanName) {
        name = humanName;
        age = 0;
    }

    public static Human born(String humanName) {
        return new Human(humanName);
    }

    public String getName() {
        return name;
    }

    // Instance method
    public int getAge() {
        return age;
    }

    // Class Method
    public static int getTalkingAge() {
        return talkingAge;
    }

    public static void setTalkingAge(int humanTalkingAge) {
        talkingAge = humanTalkingAge;
    }

    public void setAge(int humanAge) {
        age = humanAge;
    }

    public void talk(String speech) {
        if (age < talkingAge) {
            speech = "Waaaaaaaa";
        }

        System.out.println(speech);
    }

    public void talk() {
        selfIntroduce();
    }

    private void selfIntroduce() {
        talk("Hi! I am " + name + ", and I am " + age + " years old. My oxygen intake is " + oxygenIntake);
    }

    public void grow() {
        age++;
    }

    public String sneeze() {
        return "Atchooo";
    }

    public String cough() {
        return "Cough Cough";
    }

    public String yawn() {
        return  "Yaaaaaaaaaaawn";
    }
}
