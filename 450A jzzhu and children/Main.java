//tc = O(summation a[i]/m)  //sc = O(n)

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Queue<Student> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {

            int requiredCandies = sc.nextInt();

            q.offer(new Student(i, requiredCandies));
        }

        int lastStudent = -1;

        while (!q.isEmpty()) {

            Student curr = q.poll();

            int student = curr.studentNumber;
            int candies = curr.remainingCandies;

            if (candies <= m) {

                lastStudent = student;

            } else {

                candies = candies - m;

                q.offer(new Student(student, candies));
            }
        }

        System.out.println(lastStudent);

        sc.close();
    }
}

class Student {

    int studentNumber;
    int remainingCandies;

    Student(int studentNumber, int remainingCandies) {
        this.studentNumber = studentNumber;
        this.remainingCandies = remainingCandies;
    }
}