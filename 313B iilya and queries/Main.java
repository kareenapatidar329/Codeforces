//TC = O(n + m)  building prefix = O(n)  each query = O(m)
//SC = O(n)

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();

        int[] prefix = new int[n];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1];

            if (s.charAt(i - 1) == s.charAt(i)) {
                prefix[i]++;
            }
        }

        int m = sc.nextInt();

        for (int q = 0; q < m; q++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            int answer = prefix[r - 1] - prefix[l - 1];

            System.out.println(answer);
        }

        sc.close();
    }
}