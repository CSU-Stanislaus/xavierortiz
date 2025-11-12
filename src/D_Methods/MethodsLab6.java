package D_Methods;

public class MethodsLab6 {

    public static void main(String[] args) {

        // ===========================
        // TEST YOUR METHODS HERE
        // ===========================

        // Q1: isAdult
        System.out.println("isAdult(17) = " + isAdult(17)); // false
        System.out.println("isAdult(18) = " + isAdult(18)); // true
        System.out.println("isAdult(25) = " + isAdult(25)); // true

        // Q2: formatMoney
        System.out.println(formatMoney("Alice", 12.5));
        System.out.println(formatMoney("Bob", 100.0));

        // Q3: areaOfRectangle
        System.out.println("areaOfRectangle(5, 4) = " + areaOfRectangle(5, 4));
        System.out.println("areaOfRectangle(10, 2) = " + areaOfRectangle(10, 2));

        // Q4: firstChar
        System.out.println("firstChar(\
