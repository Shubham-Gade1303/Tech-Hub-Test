//Q1. Write a java program to print this pattern. //


import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // leading spaces
            for (int s = 0; s < n - i; s++) System.out.print("  ");

            // increasing part
            int val = i;
            for (int j = 0; j < i; j++) {
                System.out.print((val + j) + " ");
            }
            // decreasing part
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((val + j) + " ");
            }

            System.out.println();
        }
        sc.close();
    }
}
