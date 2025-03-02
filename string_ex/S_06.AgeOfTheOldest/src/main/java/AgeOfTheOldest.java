
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;

        while (true) {
            System.out.println("Please enter a name and age: ");
            String input = scanner.nextLine();

            String[] parts = input.split(",");


            if (input.isEmpty()) {
                break;
            }

            if (parts.length == 2) {

                String name = parts[0];
                int age = Integer.parseInt(parts[1]);

                if (age > max) {
                    max = age;
                }
            }

        }
        System.out.println("The oldest age is:" + max);
    }
}