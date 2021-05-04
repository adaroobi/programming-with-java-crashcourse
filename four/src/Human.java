public class Human {
    public String name;
    public int age;

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
