import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];

        System.out.println("Enter array elements: ");

        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the int element to find in the array");
        int target = sc.nextInt();

        int result = binarySearch(array, target);
        System.out.println("Array: "+ Arrays.toString(array));

        if (result == -1){
            System.out.println("Element not found in the array");
        }else {
            System.out.println("Element found at the index: "+ result);
        }
    }

    private static int binarySearch(int[] array, int target){
        int start = 0;
        int end = array.length-1;

        while(start <= end){

            int middle = start + (end -start)/2;

            if (array[middle] == target){
                return middle;
            }
            if (target > array[middle]) {
                start = middle +1;
            }else {
                end = middle -1;
            }
        }
        return -1;
    }

}
 