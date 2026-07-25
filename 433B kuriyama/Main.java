//tc O(n log n + m)  //sc = O(n)

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int[] sorted = a.clone();

        Arrays.sort(sorted);

        long[] prefixOriginal = new long[n + 1];
        long[] prefixSorted = new long[n + 1];


        for(int i = 0; i < n; i++){
            prefixOriginal[i+1] = prefixOriginal[i] + a[i];
            prefixSorted[i+1] = prefixSorted[i] + sorted[i];
        }


        int m = sc.nextInt();

        while(m-- > 0){

            int type = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            long ans;

            if(type == 1){
                ans = prefixOriginal[r] - prefixOriginal[l-1];
            }
            else{
                ans = prefixSorted[r] - prefixSorted[l-1];
            }

            System.out.println(ans);
        }

        sc.close();
    }
}