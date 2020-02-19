public class Calculator {
    public static void main(String[] args) {
        int result = 1;
        for (int i = 0; i <= 13; i++) {
            result = result + i;
            if (result % 2 == 0) {
                System.out.println("Number " + result + " event");
            } else {
                System.out.println("Nubber " + result + " no event");
            }
        }
        System.out.println("Sum of numbers: 2 + 6 + 2 + 22 + 20 + 6 + 12 + 8 + 4 + 10 = " + result);
        System.out.println(" ");

        int result2 = 990;
        for (int i = 1; i <= 20; i++) {
            result2 = result2 - i;
            if (result2 % 2 == 0) {
                System.out.println("Number " + result2 + " event");
            } else {
                System.out.println("Nubber " + result2 + " no event");
            }
        }
        System.out.println("Subtraction of numbers: 990 - 20 - 10 - 14 - 16 - 20 - 10 - 12 - 4 - 104 = " + result2);
        System.out.println(" ");

        int result3 = 2;
        for (int i = 2; i <= 5; i++) {
            result3 = result3 * i;
            if (result3 % 2 == 0) {
                System.out.println("Number " + result3 + " event");
            } else {
                System.out.println("Nubber " + result3 + " no event");
            }
        }
        System.out.println("Multiplication: 2 * 2 * 6 * 10 = " + result3);
        System.out.println(" ");

        int result4 = 198880;
        for (int i = 2; i <= 5; i++) {
            result4 = result4 / i;
            if (result4 % 2 == 0) {
                System.out.println("Number " + result4 + " event");
            } else {
                System.out.println("Nubber " + result4 + " no event");
            }
        }
        System.out.println("Division of numbers: 198880 / 2 / 3 / 4 / 5 = " + result4);
        System.out.println(" ");

        int b = 1;
        for (int j = 1; j <= 5; j++) b *= 4;
        {
            if (b % 2 == 0) {
                System.out.println("Number " + b + " event");
            } else {
                System.out.println("Nubber " + b + " no event");
            }
        }
        System.out.println("Number 2 raised to the power of 5 = " + b);
        System.out.println(" ");

        double x = 46894.60;
        for (int j = 1; j <= 5; j++) {
            if (x % 2 == 0) {
                System.out.println("x mod j = " + x % j);
            } else {
                System.out.println("x mod j = " + x % j);
            }
        }
    }
}