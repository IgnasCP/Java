
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanString = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanString.nextLine();
        scanString.close();

        Scanner scanInt = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int integer = scanInt.nextInt();
        scanInt.close();

        Scanner scanDouble = new Scanner(System.in);
        System.out.println("Enter a double: ");
        double doubleNumber = scanDouble.nextDouble();
        scanDouble.close();

        Scanner scanBoolean = new Scanner(System.in);
        System.out.println("Enter a boolean: ");
        boolean bool = scanBoolean.nextBoolean();
        scanBoolean.close();

        System.out.println("You gave the string: " + string);
        System.out.println("You gave the integer: " + integer);
        System.out.println("You gave the double: " + doubleNumber);
        System.out.println("You gave the bool: " + bool);

    }
}
