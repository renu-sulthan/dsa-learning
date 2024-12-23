import java.util.Arrays;
import java.util.Scanner;

public class FIndMinAndMaxOfIntArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];

        System.out.println("Enter array elements: ");

        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array : " + Arrays.toString(array));

        findMinElementInAnArray(array);
        findMaxElementInAnArray(array);

    }

    private static void findMinElementInAnArray(int[] array) {
        // At first assume first element is the minimum
        int minElement = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        System.out.println("Min element" + minElement);
    }


    private static void findMaxElementInAnArray(int[] array) {
        int maxElement = array[0];

        for (int element : array) {
            if (element > maxElement) {
                maxElement = element;
            }
        }
        System.out.println("Max Element : " + maxElement);
    }

}
