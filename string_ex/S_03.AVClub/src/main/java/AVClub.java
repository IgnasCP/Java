import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter something: ");
            String sentence = scanner.nextLine();

            if (sentence.isEmpty()) {
                break;
            }

            String[] words = sentence.split(" ");


            boolean foundAv = false;


            for (String word : words) {
                if (word.toLowerCase().contains("av")) {
                    System.out.println(word);
                    foundAv = true;
                }
            }

        }

        scanner.close();
    }
}