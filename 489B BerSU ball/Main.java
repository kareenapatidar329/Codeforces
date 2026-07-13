// time complexity O(n log n + m log m) //tc of boys is nlogn and for girls mlogm
//space complexity O(1)


import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] boys = new int[n];

        for (int i = 0; i < n; i++) {
            boys[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] girls = new int[m];

        for (int i = 0; i < m; i++) {
            girls[i] = sc.nextInt();
        }

        Arrays.sort(boys);
        Arrays.sort(girls);

        int i = 0;
        int j = 0;
        int count = 0;

        while (i < boys.length && j < girls.length) {

            if (Math.abs(boys[i] - girls[j]) <= 1) {
                count++;
                i++;
                j++;
            } 
            else if (boys[i] < girls[j]) {
                i++;
            } 
            else {
                j++;
            }
        }

        System.out.println(count);
    }
}