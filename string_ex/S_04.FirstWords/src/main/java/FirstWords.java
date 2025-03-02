
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter a sentence: ");
            String sentence = scanner.nextLine();

            if (sentence.isEmpty()) {
                break;
            }
            String[] words = sentence.split(" ");
            for (words.length > 0) {
                System.out.println(words[0]);
            }
        }

    }
}