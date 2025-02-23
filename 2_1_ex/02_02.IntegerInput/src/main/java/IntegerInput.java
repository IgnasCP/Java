
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(number);

    }
}
