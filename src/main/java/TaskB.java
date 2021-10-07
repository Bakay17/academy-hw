import java.util.Random;
import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {
        createArray();
    }

    public static int[] createArray() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Size array: " );
//        int size = sc.nextInt();
        int size = 5;

        int[] arrayNumbers = new int[size];

        System.out.print("Your array: ");
        for (int i = 0; i < size; i++) {
            arrayNumbers[i] = new Random().nextInt(100) + 1;
            System.out.print( " " + arrayNumbers[i]);
        }

        System.out.println();
        avg1_30(arrayNumbers);
        avg31_60(arrayNumbers);
        avg61_100(arrayNumbers);
        return arrayNumbers;
    }

    public static int avg1_30(int[] array) {
        int result = 0;
        int count = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] <= 30) {
                result = array[i] + array[i];
                count++;
            }
        }
        System.out.println("from 1 to 30: " + (double)result / count + " count : " + count);
        return result;
    }

    public static void avg31_60(int[] array) {
        int result = 0;
        int count = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] <= 60) {
                result = array[i] + array[i];
                count++;
            }
        }
        System.out.println("from 31 to 60: " + (double)result / count + " count : " + count);
    }

    public static void avg61_100(int[] array) {
        int result = 0;
        int count = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] <= 30) {
                result = array[i] + array[i];
                count++;
            }
        }
        System.out.println("from 61 to 100: " + (double)result / count + " count : " + count);
    }
}
