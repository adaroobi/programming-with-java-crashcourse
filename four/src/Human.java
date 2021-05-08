public class Human {
    final private String name;
    private int age;

    public Human(String humanName, int humanAge) {
        name = humanName;
        age = humanAge;
    }

    public String talk() {
        return "Hi! I am " + name + ", and I am " + age + " years old.";
    }

    public String selfIntroduce() {
        return "Hi! I am " + name + ", and I am " + age + " years old.";
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
