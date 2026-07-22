//tc = O(n log n + n log k)  //sc = O(n)

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        long low = arr[n / 2];
        long high = arr[n / 2] + k;
        long ans = low;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (canMake(arr, n, k, mid)) {
                ans = mid;
                low = mid + 1;   // bigger median try karo
            } else {
                high = mid - 1;  // smaller median try karo
            }
        }

        System.out.println(ans);
        sc.close();
    }

    private static boolean canMake(long[] arr, int n, long k, long targetMedian) {
        long cost = 0;
        int medianIndex = n / 2;

        for (int i = medianIndex; i < n; i++) {
            if (arr[i] < targetMedian) {
                cost += targetMedian - arr[i];
            }
        }

        return cost <= k;
    }
}