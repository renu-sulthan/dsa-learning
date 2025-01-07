
public class BinarySearchInRotatedSortedArrayWithDuplicates {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 2, 3, 3};

        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int target = 3;
        boolean result = searchInARotatedSortedArray(arr, target);

        System.out.println("Is " + target + " present in the array? " + result);

        target = 10;
        result = searchInARotatedSortedArray(arr, target);
        System.out.println("Is " + target + " present in the array? " + result);

    }

    public static boolean searchInARotatedSortedArray(int[] arr, int k) {
        // Write your code here.
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) return true;

            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && k <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] <= k && k <= arr[high]) {
                    low = mid + 1;

                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}
