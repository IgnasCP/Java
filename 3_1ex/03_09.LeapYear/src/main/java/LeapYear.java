
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year: ");
        int years = scan.nextInt();
        boolean leapyear = false;

        if (years % 4 == 0) {
            if (years % 100 == 0)
            {
                if (years % 400 == 0) {
                    leapyear = true;
                }
                else {
                    leapyear = false;
                }
            }
            else {
                leapyear = true;
            }
        }
        else {
         leapyear = false;
        }
        if (leapyear) {
            System.out.println("The year is a leap year");
        }
        else {
            System.out.println("The year is not a leap year");
        }
    }
}
