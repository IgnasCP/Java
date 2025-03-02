
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String username = scanner.nextLine();

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        String alexUsername = "alex";
        String alexPassword = "sunshine";

        String emmaUsername = "emma";
        String emmaPassword = "haskell";

        if (username.equals(alexUsername) && password.equals(alexPassword)) {
            System.out.println("You have successfully logged in!");
        }
        else if (username.equals(emmaUsername) && password.equals(emmaPassword)) {
            System.out.println("You have successfully logged in!");
        }
        else {
            System.out.println("Incorrect username or password!");
        }
    }
}
