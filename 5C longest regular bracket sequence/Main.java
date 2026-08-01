//tc = O(n)  //sc = O(n)

import java.util.*;

public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        Stack<Integer> stack = new Stack<>();

        stack.push(-1);

        int maxLength = 0;
        int count = 1;

        for(int i = 0; i < s.length(); i++){

            int curr = i;

            if(s.charAt(i) == '('){

                stack.push(curr);

            }else{

                stack.pop();

                if(stack.isEmpty()){

                    stack.push(curr);

                }else{

                    int length = curr - stack.peek();

                    if(length > maxLength){

                        maxLength = length;
                        count = 1;

                    }else if(length == maxLength){

                        count++;

                    }
                }
            }
        }

        if(maxLength == 0){

            System.out.println("0 1");

        }else{

            System.out.println(maxLength + " " + count);

        }

        sc.close();
    }
}