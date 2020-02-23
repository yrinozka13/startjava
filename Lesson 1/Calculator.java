public class Calculator {
    public static void main(String[] args) {
        int num1 = 240;
        int num2 = 4;
        char[] operation = new char[]{'+', '-', '*', '/', '^', '%'};
        if (operation[1] != '+') {
            System.out.println("Subtraction of numbers: 240 - 4 = " + (num1 - num2));
        } else if (operation[2] != '+') {
            System.out.println("Multiplication of numbers: 240 * 4 = " + (num1 * num2));
        } else if (operation[3] != '+') {
            System.out.println("Division of numbers: 240 / 4 = " + (num1 / num2));
        } else if (operation[4] != '+') {
            for (int a = 2; a <= 1024; a *= 2) {
                System.out.println("Raising to the power of the number 2 in the 5th degree = " + a);
            }
        } else if (operation[5] != '+') {
            System.out.println("Division modulo 240 by 42 = " + (num1 % num2));
        } else if (operation[0] == '+') {
            System.out.println("Sum of numbers: 240 + 4 = " + (num1 + num2));
        }
    }
}
