public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println("Number of 1 from 20: " + i);
        }
        System.out.println(" ");

        int k = -6;
        while (k <= 6) {
            System.out.println("k= " + k);
            k += 2;
        }
        System.out.println(" ");

        int sumOdd = 0;
        for (int j = 11; j <= 20; j += 2) {
            sumOdd = sumOdd + j;
            if (sumOdd % 2 != 0) {
                System.out.println("Sum " + sumOdd + " no event");
            }
        }
        System.out.println("Sum of numbers: 11 + 13 + 15 + 17 + 19 = " + sumOdd);
    }
}
