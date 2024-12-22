import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];

        System.out.println("Enter array elements: ");

        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the int element to find in the array");
        int findElement = sc.nextInt();

        linearSearchInteger(array, findElement);
    }

    private static void linearSearchInteger(int[] array, int findElement) {
        System.out.println("Given Array: " + Arrays.toString(array));
        System.out.println("Finding element is : " + findElement);

        // Just iterate over the array un-till the required element found
        for (int i = 0; i < array.length; i++) {
            if (array[i] == findElement) {
                System.out.println("Element found at the index of : " + i);
                return;
            }
        }
        System.out.println("Element is not present in the array");
    }

}