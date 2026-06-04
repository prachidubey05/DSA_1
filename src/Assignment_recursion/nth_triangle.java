package Assignment_recursion;
import java.util.*;
public class nth_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sum(n));
    }
    public static int Sum(int n){
        if(n==0) return 0;
        return n+Sum(n-1);
    }
}
