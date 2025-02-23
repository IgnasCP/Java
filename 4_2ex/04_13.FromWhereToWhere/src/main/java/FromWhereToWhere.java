
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where from?");
        int from = scanner.nextInt();
        System.out.println("Where to?");
        int to = scanner.nextInt();
        int start = Math.min(from, to);
        int end = Math.max(from, to);

        if (start <= end && from >= to) {
            for (int i = start; i <= end; i++) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
