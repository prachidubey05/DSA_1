package leetcode;
import java.util.*;
public class lenght_of_longest_common_prefix {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr1 = new int[n];
        int[]arr2 = new int[n];
        for(int i = 0;i<n;i++){
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        System.out.println(longestCommonPrefix(arr1,arr2));
    }
    public static int longestCommonPrefix(int[] arr1, int[] arr2) {

        HashSet<String> set = new HashSet<>();
        for (int num : arr1) {
            String s = String.valueOf(num);

            for (int i = 1; i <= s.length(); i++) {
                set.add(s.substring(0, i));
            }
        }

        int ans = 0;
        for (int num : arr2) {
            String s = String.valueOf(num);

            for (int i = 1; i <= s.length(); i++) {
                if (set.contains(s.substring(0, i))) {
                    ans = Math.max(ans, i);
                }
            }
        }

        return ans;
    }

}
