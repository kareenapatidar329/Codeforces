//tc = O(n log n + q log n)  //sc = O(n)

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        Arrays.sort(prices);

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int mi = sc.nextInt();

            int left = 0;
            int right = n - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (prices[mid] <= mi) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            System.out.println(left);
        }

        sc.close();
    }
}