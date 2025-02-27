

public class FromParameterToOne {

    public static void main(String[] args) {
   int number = 5;
   printFromNumberToOne(number);
    }

    public static void printFromNumberToOne(int number) {
        for (int i = number; i >= 1; i--) {
            System.out.print(i);
        }
    }

}
