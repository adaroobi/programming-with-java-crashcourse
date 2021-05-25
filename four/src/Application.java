import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
//                              0       1         2       3
        String[] students = {"Ahmed", "Mohamed", "Omar", "Ali"};

//        for (int i = students.length-1; i != -1; i--) {
//            System.out.println(students[i]);
//        }
//        students[1] = null;
//        System.out.println(Arrays.toString(students));

//        removeItem(students, 1);
//
//        System.out.println(Arrays.toString(students));

//        removeItem2(students, 1);

//        System.out.println(Arrays.toString(students));

        Arrays.sort(students);

//        System.out.println(Arrays.toString(students));

        String[] persons = new String[4];

//        System.out.println(Arrays.toString(persons));

        Arrays.fill(persons, "");

//        System.out.println(Arrays.toString(persons));

//        System.out.println(Arrays.binarySearch(students, "Omar"));

        removeItem(students, 2);
        students = removeNullFromArray(students);
//        System.out.println(Arrays.toString(students));

        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Ahmed");
        studentsList.add("Mohamed");
        studentsList.add("Omar");

        System.out.println(studentsList);

        System.out.println(studentsList.get(1));
        studentsList.set(1, "Mohamed*");
        System.out.println(studentsList.get(1));

        System.out.println(studentsList.remove(1));

//        System.out.println(studentsList.indexOf());

        // wrappers

        // Autoboxing
        Integer number = 10;

        // Unboxing
        System.out.println(number * 100);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(null);
//        numbers.sort();
        int[][] numberz = {
                {1, 2, 3},
                {11, 22, 33},
                {111, 222, 333},
        };
//        numberz[0][1]; // 11
/*
        ------------------------------------------------------------
        |       |           |               |               |       |
        ------------------------------------------------------------
        |        |           |               |               |       |
        ------------------------------------------------------------
         |        |           |               |               |       |
        ------------------------------------------------------------
         |        |           |               |               |       |
        ------------------------------------------------------------
         |        |           |               |               |       |
        ------------------------------------------------------------
 */
    }

    public static void removeItem(String[] array, int index) {
        // Remove target array item
        array[index] = null;

        // 1 - 10
        // 7
        // low 1 - 4 /// 6 - 7 // 6
        // high 6 - 10 // 9 - 10 // 9 - 10
        // Middle 5  /// 8 // 7 //
        // Binary search array.length /2
        for (int i = index + 1; i < array.length; i++) {
            array[i-1] = array[i];
            array[i] = null;
        }
    }

    public static void removeItem2(String[] array, int index) {
        // Remove target array item
        array[index] = null;

        for (int i = array.length-1; i > index ; i--) {
            if (array[i] == null) {
                continue;
            }

            array[index] = array[i];
            array[i] = null;
            break;
        }
    }

    public static String[] removeNullFromArray(String[] array) {
        String[] temp = new String[array.length - 1];

        for (int i = 0; i < array.length -1; i++) {
            temp[i] = array[i];
        }

        return temp;
    }
}
