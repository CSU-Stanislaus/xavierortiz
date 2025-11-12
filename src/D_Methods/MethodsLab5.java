package D_Methods;

public class MethodsLab5 {

    public static void main(String[] args) {

        // ===========================
        // TEST YOUR METHODS HERE
        // ===========================

        // Q1: square
        System.out.println("square(4) = " + square(4));
        System.out.println("square(10) = " + square(10));

        // Q2: average
        System.out.println("average(5, 10) = " + average(5, 10));
        System.out.println("average(7, 3) = " + average(7, 3));

        // Q3: greetPerson
        System.out.println(greetPerson("Liam", 20));
        System.out.println(greetPerson("Sophia", 35));

        // Q4: repeatWord
        System.out.println("repeatWord(\"Hi\", 3) = " + repeatWord("Hi", 3));
        System.out.println("repeatWord(\"Java\", 2) = " + repeatWord("Java", 2));

        // Q5: absoluteValue
        System.out.println("absoluteValue(-5) = " + absoluteValue(-5));
        System.out.println("absoluteValue(12) = " + absoluteValue(12));
    }

    // ============================================================
    // Q1. square
    // ============================================================
    public static int square(int num) {
        return num * num;
    }

    // ============================================================
    // Q2. average
    // ============================================================
    public static double average(double a, double b) {
        return (a + b) / 2;
    }

    // ============================================================
    // Q3. greetPerson
    // ============================================================
    public static String greetPerson(String name, int age) {
        return "Hello, " + name + "! You are " + age + " years old.";
    }

    // ============================================================
    // Q4. repeatWord
    // ============================================================
    public static String repeatWord(String word, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += word;
        }
        return result;
    }

    // ============================================================
    // Q5. absoluteValue
    // ============================================================
    public static int absoluteValue(int n) {
        if (n < 0) {
            return -n;
        } else {
            return n;
        }
    }
}
