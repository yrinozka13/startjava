public class Calculator {
    public static void main(String[] args) {
        int c = 240;
        int d = 4;
        char sum = '+';
        char operation = '+';
        int sumNumbers = c + d;

        if (operation == sum) {
            System.out.println("Sum of numbers: 240 + 4 = " + sumNumbers);
        } else
            System.out.println(" ");
        System.out.println(" ");

        int m = 580;
        int l = 6;
        char subtraction = '-';
        char operation2 = '-';
        int subtractionNumbers = m - l;
        if (operation2 == subtraction) {
            System.out.println("Subtraction of numbers: 580 - 6 = " + subtractionNumbers);
        } else
            System.out.println(" ");
        System.out.println(" ");

        int s = 20;
        int n = 8;
        char multiplication = '*';
        char operation3 = '*';
        int multiplicationNumbers = s * n;
        if (operation3 == multiplication) {
            System.out.println("Multiplication of numbers: 20 * 8 = " + multiplicationNumbers);
        } else
            System.out.println(" ");
        System.out.println(" ");

        int e = 590;
        int k = 10;
        char division = '/';
        char operation4 = '/';
        int divisionNumbers = e / k;
        if (operation4 == division) {
            System.out.println("Division of numbers: 590 / 10 = " + divisionNumbers);
        } else
            System.out.println(" ");
        System.out.println(" ");

        char exponentiation = '^';
        char operation5 = '^';
        if (operation5 == exponentiation) {
            for (int a = 2; a <= 1024; a *= 2) {
                System.out.println("Raising to the power of the number 2 in the 5th degree = " + a);
            }
        } else
            System.out.println(" ");
        System.out.println(" ");

        int h = 258;
        int z = 8;
        char moduloDivision = '%';
        char operation7 = '%';
        double moduloDivisionNumbers = h % z;
        if (operation7 == moduloDivision) {
            System.out.println("Division modulo 258 by 8 = " + moduloDivisionNumbers);
        } else
            System.out.println(" ");
    }
}
