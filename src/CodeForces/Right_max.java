package CodeForces;

import java.util.*;

public class Right_max {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            int[] a = new int[n + 1];
//            int[] pos = new int[n + 1];
//
//            for (int i = 1; i <= n; i++) {
//                a[i] = sc.nextInt();
//                pos[a[i]] = i;
//            }
//
//            int operations = 0;
//            int limit = n + 1;
//
//            for (int val = n; val >= 1; val--) {
//                if (pos[val] < limit) {
//                    operations++;
//                    limit = pos[val];
//                }
//            }
//
//            System.out.println(operations);
//        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int maxSeen = 0;
            int operations = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] > maxSeen) {
                    operations++;
                    maxSeen = a[i];
                }
            }

            System.out.println(operations);
        }
    }
}
