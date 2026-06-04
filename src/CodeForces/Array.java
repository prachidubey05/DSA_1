package CodeForces;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                int smaller = 0, greater = 0;

                for (int j = i + 1; j < n; j++) {
                    if (a[j] < a[i]) smaller++;
                    else if (a[j] > a[i]) greater++;
                }

                System.out.print(Math.max(smaller, greater) + " ");
            }
            System.out.println();
        }
    }
}