package E_Arrays;

public class ArraysLab8 {

    public static void main(String[] args) {

        // Q1: findIndex
        int[] data1 = {5, 10, 15, 20};
        int[] data2 = {7, 7, 7};
        System.out.println("findIndex(data1, 15) = " + findIndex(data1, 15)); // 2
        System.out.println("findIndex(data1, 99) = " + findIndex(data1, 99)); // -1
        System.out.println("findIndex(data2, 7) = " + findIndex(data2, 7));   // 0

        // Q2: minValue
        int[] numsA = {9, 4, 11, 2, 8};
        int[] numsB = {5};
        System.out.println("minValue(numsA) = " + minValue(numsA)); // 2
        System.out.println("minValue(numsB) = " + minValue(numsB)); // 5

        // Q3: allPositive
        int[] p1 = {1, 2, 3};
        int[] p2 = {5, -1, 10};
        System.out.println("allPositive(p1) = " + allPositive(p1)); // true
        System.out.println("allPositive(p2) = " + allPositive(p2)); // false

        // Q4: joinWords
        String[] pets = {"cat", "dog", "bird"};
        String[] one = {"solo"};
        System.out.println("joinWords(pets) = " + joinWords(pets)); // "cat dog bird"
        System.out.println("joinWords(one) = " + joinWords(one));   // "solo"

        // Q5: reverseArray
        int[] original = {10, 20, 30};
        int[] reversed = reverseArray(original);
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
        System.out.println(); // new line after loop
    }

    // Q1
    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Q2
    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Q3
    public static boolean allPositive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                return false;
            }
        }
        return true;
    }

    // Q4
    public static String joinWords(String[] arr) {
        if (arr.length == 0) {
            return "";
        }

        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i < arr.length - 1) {
                result += " ";
            }
        }
        return result;
    }

    // Q5
    public static int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }
}
