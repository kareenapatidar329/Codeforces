//tc = O(n)  //sc = O(1)

public class Main{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
 
        HashSet<Integer> set = new HashSet<>();
            set.add(a);
            set.add(b);
            set.add(c);
            set.add(d);
    
        int answer = 4-set.size();
        System.out.println(answer);

    }
}