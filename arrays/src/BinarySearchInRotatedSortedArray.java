import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchInRotatedSortedArray {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 5, 6, 7, 1, 2, 3, 4);
        System.out.println("ArrayList: " + list);
        int target = 3;
        int result = search(list, list.size(), target);
        System.out.println("Position of " + target + ": " + result);
    }

    public static int search(ArrayList<Integer> list, int n, int k) {

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid) == k) return mid;
            if (list.get(low) <= list.get(mid)) {
                if (list.get(low) <= k && k <= list.get(mid)) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (list.get(mid) <= k && k <= list.get(high)) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }
        }
        return -1;
    }
}