package D_Methods;

public class MethodsLab4 {

    public static void main(String[] args) {

        // ===========================
        // TEST YOUR METHODS HERE
        // Call your methods and print the results
        // ===========================

        // Example tests (uncomment after you write the methods):

        // Q1: greet
        // String msg1 = greet("Ava");
        // String msg2 = greet("Professor");
        // System.out.println("greet(\"Ava\") = " + msg1);
        // System.out.println("greet(\"Professor\") = " + msg2);

        // Q2: add
        // int sum1 = add(2, 3);
        // int sum2 = add(100, 400);
        // System.out.println("add(2, 3) = " + sum1);
        // System.out.println("add(100, 400) = " + sum2);

        // Q3: max
        // int m1 = max(10, 4);
        // int m2 = max(9, 9);
        // System.out.println("max(10, 4) = " + m1);
        // System.out.println("max(9, 9) = " + m2);

        // Q4: fullName
        // String name1 = fullName("Taylor", "Swift");
        // String name2 = fullName("Bruce", "Wayne");
        // System.out.println("fullName(\"Taylor\", \"Swift\") = " + name1);
        // System.out.println("fullName(\"Bruce\", \"Wayne\") = " + name2);

        // Q5: isEven
        // boolean even1 = isEven(8);
        // boolean even2 = isEven(13);
        // System.out.println("isEven(8) = " + even1);
        // System.out.println("isEven(13) = " + even2);

        // ⭐ EXTRA (optional)
        // String shout1 = shout("stop");
        // String shout2 = shout("hello world");
        // System.out.println("shout(\"stop\") = " + shout1);
        // System.out.println("shout(\"hello world\") = " + shout2);
    }

    // ============================================================
    // Q1. greet
    // ============================================================
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    // ============================================================
    // Q2. add
    // ============================================================
    public static int add(int a, int b) {
        return a + b;
    }

    // ============================================================
    // Q3. max
    // ============================================================
    public static int max(int x, int y) {
        if (x >= y) {
            return x;
        } else {
            return y;
        }
    }

    // ============================================================
    // Q4. fullName
    // ============================================================
    public static String fullName(String first, String last) {
        return first + " " + last;
    }

    // ============================================================
    // Q5. isEven
    // ============================================================
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // ============================================================
    // ⭐ EXTRA CREDIT
    // ============================================================
    public static String shout(String text) {
        return text.toUpperCase() + "!";
    }
}
