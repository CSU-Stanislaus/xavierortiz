package E_Arrays;

public class ArraysLab7 {

    public static void main(String[] args) {

        // Q1: sumArray
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {10, -5, 2};
        System.out.println("sumArray(nums1) = " + sumArray(nums1)); // 10
        System.out.println("sumArray(nums2) = " + sumArray(nums2)); // 7

        // Q2: firstElement
        int[] a = {42, 99, 100};
        int[] b = {5};
        System.out.println("firstElement(a) = " + firstElement(a)); // 42
        System.out.println("firstElement(b) = " + firstElement(b)); // 5

        // Q3: lastElement
        String[] words1 = {"apple", "banana", "cherry"};
        String[] words2 = {"hi"};
        System.out.println("lastElement(words1) = " + lastElement(words1)); // "cherry"
        System.out.println("lastElement(words2) = " + lastElement(words2)); // "hi"

        // Q4: countEvens
        int[] z1 = {2, 5, 8, 11, 14}; // evens: 2,8,14 → 3
        int[] z2 = {1, 3, 5};        // evens: none → 0
        System.out.println("countEvens(z1) = " + countEvens(z1));
        System.out.println("countEvens(z2) = " + countEvens(z2));

        // Q5: toStringArray
        int[] demo = {7, 8, 9};
        System.out.println("toStringArray(demo) = " + toStringArray(demo));
        // Expected: "[7, 8, 9]"
    }

    // Q1
    public static int sumArray(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    // Q2
    public static int firstElement(int[] arr) {
        return arr[0];
    }

    // Q3
    public static String lastElement(String[] arr) {
        return arr[arr.length - 1];
    }

    // Q4
    public static int countEvens(int[] arr) {
        int evens = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evens++;
            }
        }
        return evens;
    }

    // Q5
    public static String toStringArray(int[] arr) {
        if (arr.length == 0) {
            return "[]";
        }

        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i < arr.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}


