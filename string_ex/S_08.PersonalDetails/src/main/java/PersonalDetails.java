
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAge = 0;
        int count = 0;
        String longestName = "";

        while (true) {
            System.out.println("Enter name and birth year (name,birth year): ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }


            String[] parts = input.split(",");

            if (parts.length == 2) {
                String name = parts[0].trim();
                int birthYear = Integer.parseInt(parts[1].trim());


                if (name.length() > longestName.length()) {
                    longestName = name;
                }

                totalAge += birthYear;
                count++;
            }
        }

        double averageAge = (double) totalAge / count;

        System.out.println("The longest name is: " + longestName);
        System.out.println("The average birth year is: " + averageAge);
    }
}