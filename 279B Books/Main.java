//tc O(n) //sc O(1)

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long t = sc.nextLong();

        int[] books = new int[n];

        for (int i = 0; i < n; i++) {
            books[i] = sc.nextInt();
        }

        int left = 0;
        long sum = 0;
        int maxLength = 0;

        for (int right = 0; right < n; right++) {

            // Current book ko window me add karo
            sum += books[right];

            // Jab tak time limit cross ho rahi hai,
            // left side se books remove karo
            while (sum > t) {
                sum -= books[left];
                left++;
            }

            int currentLength = right - left + 1;
            maxLength = Math.max(maxLength, currentLength);
        }

        System.out.println(maxLength);
    }
}