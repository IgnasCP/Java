package lt.techin.praktinis;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {3, 2, 1, 4, 6, 5};
        int n = arr.length + 1;

        int minMark = getMin(arr);
        System.out.printf("Min mark: %d\n", minMark);
        System.out.println(getFirstElement(arr));
        System.out.println(getLastElement(arr));
        System.out.println(getMin(arr));
        System.out.println(getMax(arr));
        System.out.println(getSum(arr));
        System.out.println(getAverage(arr));
        System.out.println(countElements(arr, n));
        System.out.println(contains(arr, minMark));
        System.out.println(lastIndexOf(arr, minMark));

    }

    //Metodas turi grąžinti pirmą masyvo elementą
    public static int getFirstElement(int[] arr) {
        int firstElement = arr[0];
        return firstElement;
    }

    //Metodas turi grąžinti paskutinį masyvo elementą
    public static int getLastElement(int[] arr) {
        int lastElement = arr[arr.length - 1];
        return lastElement;
    }

    //Raskite mažiausią masyvo elementą
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    //Raskite didžiausią masyvo elementą
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //Suskaičiuokite masyvo elementų sumą
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //Raskite masyvo elementų vidurkį
    public static double getAverage(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }


    //Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    public static int countElements(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                count++;
            }
        }
        return count;
    }

    //Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    public static boolean contains(int[] arr, int n) {
        boolean contains = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }
        return false;
    }

    //Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    public static int lastIndexOf(int[] arr, int n) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
}

