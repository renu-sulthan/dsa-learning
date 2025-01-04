public class UpperBoundBinarySearch {

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19};
        int n = 6;
        int x = 9;
        int ind = upperBound(arr, x, n);

        System.out.println("The upper bound is the index: " + ind);
    }

    public static int upperBound(int[] arr, int x, int n) {
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }
}
