import java.util.Arrays;

public class LowerBoundBinarySearch {
    public static void main(String[] args) {
        int[] arr = {13, 45, 567, 900, 1119, 3456, 4213, 9028};
        int n = 8;
        int x = 3457;
        int ind = lowerBound(arr, n, x);
        System.out.println("Array is: " + Arrays.toString(arr));
        System.out.println("x: " + x);
        System.out.println("The lower bound is the index: " + ind);
    }

    private static int lowerBound(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= x) {
                ans = mid;
                //search smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // search on the right
            }
        }
        return ans;
    }
}