package Assignment_recursion;
import java.util.*;
public class replace_0_with_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(replace(n));
    }

    public static int replace(int n) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        if (rem == 0) {
            rem = 5;
        }
        int ques =replace(n / 10);
        return ques * 10 + rem;
    }
}
