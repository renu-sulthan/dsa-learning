import java.util.ArrayList;
import java.util.Collections;

public class FirstAndLastPositionOfElementArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 2, 3, 3, 3, 4, 5, 5, 6);
        System.out.println("ArrayList: " + list);
        int[] result = firstAndLastPosition(list, list.size(), 3);
        System.out.println("First and Last Position of 3: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {

        int lowerBoundIndex = lowerBound(arr, n, k);

        if (lowerBoundIndex == n || arr.get(lowerBoundIndex) != k) {
            return new int[]{-1, -1};
        }
        return new int[]{lowerBoundIndex, upperBound(arr, n, k) - 1};
    }

    static int lowerBound(ArrayList<Integer> arr, int n, int k) {
        int low = 0;
        int high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) >= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int upperBound(ArrayList<Integer> arr, int n, int k) {
        int low = 0;
        int high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) > k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
