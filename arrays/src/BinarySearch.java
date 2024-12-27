import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 or 2");
        System.out.println("1. Ascending order array\n2. Descending order array");
        int userSelection = sc.nextInt();
        System.out.println("Enter array size: ");

        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];

        if (userSelection == 1) {
            System.out.println("Enter array elements in ascending order: ");
        } else {
            System.out.println("Enter array elements in descending order: ");
        }

        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the int element to find in the array");
        int target = sc.nextInt();
        int result;

        if (userSelection == 1) {
            result = binarySearchAscendingOrderArray(array, target);
        } else {
            result = binarySearchDescendingOrderArray(array, target);
        }

        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at the index: " + result);
        }
    }

    private static int binarySearchAscendingOrderArray(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int middle = start + (end - start) / 2;

            if (array[middle] == target) {
                return middle;
            }
            if (target > array[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }

    private static int binarySearchDescendingOrderArray(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int middle = start + (end - start) / 2;

            if (array[middle] == target) {
                return middle;
            }
            if (target < array[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }

}
 