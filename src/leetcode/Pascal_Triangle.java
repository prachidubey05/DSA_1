package leetcode;
import java.util.*;
public class Pascal_Triangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println(ncr(row-1,col-1));
    }
    public static int ncr(int n , int r){
        int ncr = fact(n)/(fact(r)*fact(n-r));
        return ncr;
    }

    public static int fact(int x){
        int p = 1;
        while(x>0){
            p*=x;
            x--;
        }
        return p;
    }
}
