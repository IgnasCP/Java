
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]: ");
       int points = scan.nextInt();
       if (points > 100) {
           System.out.println("incredible!");
           return;
       }
       if (points >= 90) {
           System.out.println("5");
           return;
       }
       if (points >= 80) {
           System.out.println("4");
           return;

       }
       if (points >= 70) {
           System.out.println("3");
           return;

       }
       if (points >= 60) {
           System.out.println("2");
           return;
       }
       if (points >= 50) {
           System.out.println("1");
          return;
       }
       if (points >= 0) {
           System.out.println("failed");
           return;
       }
       if (points < 0) {
           System.out.println("impossible!");
           return;

       }
    }
}
