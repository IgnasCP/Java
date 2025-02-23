
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("How old are you?");
        int age = scan.nextInt();

        if (age >= 0 && age <= 100) {
            System.out.println("OK");
        }
        else {
                System.out.println("Impossible!");
            }
        }
    }
