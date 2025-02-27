
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter begining number: ");
        int beginning = scanner.nextInt();

        System.out.println("Enter ending number: ");
        int ending = scanner.nextInt();

        divisibleByThreeInRange(beginning, ending);
    }

    public static void divisibleByThreeInRange(int beginning, int ending) {
        for (int i = beginning; i <= ending; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }


}
