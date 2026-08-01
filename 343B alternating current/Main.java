// tc = O(n)  //sc = O(n)

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){

            char curr = s.charAt(i);
            if(!stack.isEmpty() && curr == stack.peek()){
            stack.pop();
            }else{
               stack.push(curr);
            }
        }

        if(stack.isEmpty()){

            System.out.println("YES");

        }else{

            System.out.println("NO");

        }

        sc.close();

    }

}