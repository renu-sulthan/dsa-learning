import java.util.Scanner;
/*
Problem statement
You are given a positive integer ‘n’.

Your task is to find and return its square root. If ‘n’ is not a perfect square, then return the floor value of sqrt(n).

Example:
Input: ‘n’ = 7

Output: 2

Explanation:
The square root of the number 7 lies between 2 and 3, so the floor value is 2.
 */


public class SqrtOfNumberBinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find its integer square root:");
        long n = scanner.nextLong();
        int result = sqrtN(n);
        System.out.println("The integer square root of " + n + " is " + result);
        scanner.close();
    }

    private static int sqrtN(long n) {
        long low = 0;
        long high = n;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid * mid <= n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int) high;
    }
}
