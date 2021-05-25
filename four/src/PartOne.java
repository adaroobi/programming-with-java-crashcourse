import java.util.Arrays;

public class PartOne {
    public static void main(String[] args) {
//        String ahmed = "Ahmed";
        String[] students = new String[4];
//        [null, null, null]
//          0     1     2
//        0th     1st   2nd
        students[0] = "First Student";
        students[1] = "Second Student";
        students[2] = "Third Studnet";
        students[3] = "Fourth Studnet";

        for (String studentName: students) {
            studentName += " **";
            System.out.println(studentName);
        }

        for (int i = 1; i <= students.length; i++) {
            if (i < students.length) {
                students[i] += " **";
                System.out.println(students[i]);
            }
        }

        int[] test = new int[5];

        for (int i = 15; i > test.length; i += 5) {
            test[i] = i + 1;
        }

        System.out.println(Arrays.toString(test));

        String name = "Ahmed";
        String age = "10";
        System.out.println(greet("Anybody", name, age));

        // Array literals
        String[] attr = {"Mohamed", "22"};
        attr[0] = "Mohamed2";
        attr[1] = "222";

        System.out.println(greet("Anyone", new String[] {"Omar", "33"}));
        System.out.println(greet("Anyone", attr));

        System.out.println(greet("Default", getName(), getAge()));

        Human ahmed2 = new Human();
        ahmed2.name = "Ahmed 2";
        ahmed2.age = 55;

        Human ahmed3 = new Human();
        ahmed3.name = "Ahmed 3";
        ahmed3.age = 15;

        System.out.println(greetHuman(new Human("Ahmed 2", 55), new Human("Ahmed 3", 15)));
    }

    // Arity
    public static String greet(String defautlName, String... attributes) {
        return  "Hello " + defautlName + " " + attributes[0] + " I am " + attributes[getAgeIndex()];
    }

    public static String greetHuman(Human... humans) {
        String output = "";

        for (int i = 0; i < humans.length; i++) {
            output += humans[i].name + " Age " + humans[i].age;
        }

        return "Hello all " + output;
    }

    public static String getName() {
        return "Omar";
    }

    public static String getAge() {
        return "15";
    }

    public static int getAgeIndex() {
        return 1;
    }
}


class Human {
    Human() {

    }

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String name;
    public int age;
}
