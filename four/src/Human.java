public class Human {
    final private String name;
    private int age;

    public Human(String humanName, int humanAge) {
        name = humanName;
        age = humanAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int humanAge) {
        age = humanAge;
    }

    public void talk(String speech) {
        System.out.println(speech);
    }

    public void selfIntroduce() {
        talk("Hi! I am " + name + ", and I am " + age + " years old.");
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
