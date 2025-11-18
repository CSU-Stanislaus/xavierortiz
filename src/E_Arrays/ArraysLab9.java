package E_Arrays;

public class ArraysLab9 {

    public static void main(String[] args) {

        // Q1: totalLength
        String[] wordsA = {"hi", "apple", "sun"};
        String[] wordsB = {"a", "bb", "ccc", "dddd"};
        System.out.println("totalLength(wordsA) = " + totalLength(wordsA)); // 10
        System.out.println("totalLength(wordsB) = " + totalLength(wordsB)); // 10

        // Q2: containsValue
        int[] data1 = {3, 6, 9, 12};
        int[] data2 = {5, 5, 5};
        System.out.println("containsValue(data1, 9) = " + containsValue(data1, 9));   // true
        System.out.println("containsValue(data1, 10) = " + containsValue(data1, 10)); // false
        System.out.println("containsValue(data2, 5) = " + containsValue(data2, 5));   // true

        // Q3: howManyAbove
        int[] grades = {70, 85, 90, 60, 100};
        System.out.println("howManyAbove(grades, 80) = " + howManyAbove(grades, 80)); // 3
        System.out.println("howManyAbove(grades, 95) = " + howManyAbove(grades, 95)); // 1

        // Q4: copyFirstN
        int[] numsOriginal = {4, 5, 6, 7, 8};
        int[] first3 = copyFirstN(numsOriginal, 3);
        for (int i = 0; i < first3.length; i++) {
            System.out.print(first3[i] + " "); // 4 5 6
        }
        System.out.println();

        // Q5: indexOfSmallest
        int[] arr1 = {9, 4, 11, 2, 8};
        int[] arr2 = {5};
        System.out.println("indexOfSmallest(arr1) = " + indexOfSmallest(arr1)); // 3
        System.out.println("indexOfSmallest(arr2) = " + indexOfSmallest(arr2)); // 0
    }

    // Q1
    public static int totalLength(String[] words) {
        int total = 0;
        for (int i = 0; i < words.length; i++) {
            total += words[i].length();
        }
        return total;
    }

    // Q2
    public static boolean containsValue(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    // Q3
    public static int howManyAbove(int[] arr, int limit) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > limit) {
                count++;
            }
        }
        return count;
    }

    // Q4
    public static int[] copyFirstN(int[] arr, int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    // Q5
    public static int indexOfSmallest(int[] arr) {
        int minValue = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}


