import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Calculator calc = new Calculator();

       System.out.println("The calculator is running!");
       String answer = "Yes";
       while(answer.equals("Yes")) {
       System.out.print("Enter the first number: ");
       int firstNumber = scanner.nextInt();
       calc.setFirstNumber(firstNumber);

       System.out.print("Enter the sign of the math operation: ");
       String text = scanner.next();
       char mathOperation = text.charAt(0);
       calc.setMathOperation(mathOperation);

       System.out.print("Enter the second number: ");
       int secondNumber = scanner.nextInt();
       calc.setSecondNumber(secondNumber);

       calc.calculate();

       do {
            System.out.print("Want to continue? [Yes/Not]: ");
            answer = scanner.next();
       } while(!answer.equals("Yes") && !answer.equals("Not"));
       
       }
       System.out.println("The calculator has closed!");
    }
}


        