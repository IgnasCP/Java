
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the second number: ");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the third number: ");
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int sum = firstNumber + secondNumber + thirdNumber;
        double average = (double) sum / 3;
        System.out.println(average);
    }
}
