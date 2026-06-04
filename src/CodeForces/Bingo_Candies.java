package CodeForces;

//public class Bingo_Candies {
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            int[] freq = new int[n * n + 1];
//            boolean possible = true;
//
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    int x = sc.nextInt();
//                    freq[x]++;
//
//                    if (freq[x] > n) {
//                        possible = false;
//                    }
//                }
//            }
//
//            if (possible)
//                System.out.println("YES");
//            else
//                System.out.println("NO");
//        }
//    }
//}
import java.util.*;
public class Bingo_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> freq = new HashMap<>();
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int x = sc.nextInt();
                    freq.put(x, freq.getOrDefault(x, 0) + 1);

                    if (freq.get(x) > n) {
                        possible = false;
                    }
                }
            }

            if (possible)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
