//tc = O(n log n)  //sc = O(n)

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Arrays.sort(a);

        long waitingTime = 0;
        int satisfied = 0;

        for (int i = 0; i < n; i++) {

            if (waitingTime <= a[i]) {
                satisfied++;
                waitingTime += a[i];
            }
        }

        System.out.println(satisfied);

        sc.close();
    }
}