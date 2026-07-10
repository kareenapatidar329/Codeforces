//tc O(n)  //sc O(n)


import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String userName = sc.next();

            if (!map.containsKey(userName)) {
                System.out.println("OK");
                map.put(userName, 1);
            } else {
                int count = map.get(userName);
                String newName = userName + count;

                System.out.println(newName);

                map.put(userName, count + 1);
                map.put(newName, 1);
            }
        }

        sc.close();
    }
}