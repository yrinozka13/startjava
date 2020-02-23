public class Calculator {
    public static void main(String[] args) {
        int num1 = 240;
        int num2 = 4;
        char sign = '+';

        if (sign == '+') {
            System.out.println("Sum of numbers: 240 + 4 = " + (num1 + num2));
        } else if (sign == '-') {
            System.out.println("Subtraction of numbers: 240 - 4 = " + (num1 - num2));
        } else if (sign == '*') {
            System.out.println("Multiplication of numbers: 240 * 4 = " + (num1 * num2));
        } else if (sign == '/') {
            System.out.println("Division of numbers: 240 / 4 = " + (num1 / num2));
        } else if (sign == '^') {
            int result = 1;
            int power = 1;
            while (power <= 8) {
                result = result * num2;
                System.out.println(num2 + " to the extent " + power + " = " + result);
                power++;
            }
        } else if (sign == '%') {
            System.out.println("Division modulo 240 by 42 = " + (num1 % num2));
        }
    }
}

