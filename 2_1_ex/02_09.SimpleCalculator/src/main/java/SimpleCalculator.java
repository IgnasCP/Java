
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number: ");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int sum = firstNumber + secondNumber;
        int subtract = firstNumber - secondNumber;
        int multiply = firstNumber * secondNumber;
        int divide = firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sum );
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtract );
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiply);
        System.out.println(firstNumber + " / " + secondNumber + " = " + divide);

    }
}
