//tc = O(n)  //sc = O(n)

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String userName = sc.next();

            if (set.contains(userName)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
                set.add(userName);
            }
        }

        sc.close();
    }
}