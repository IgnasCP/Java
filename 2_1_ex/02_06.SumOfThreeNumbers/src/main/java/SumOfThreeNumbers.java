
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number: ");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter third number: ");
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int sum = firstNumber + secondNumber + thirdNumber;
        System.out.println(sum);


    }
}
