package CodeForces;
import java.util.*;
public class Cyclists {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n+1];
            for(int i=1;i<=n;i++){
                a[i] = sc.nextInt();
            }

            int w = a[p];

            if(p <= k){
                System.out.println(m / w);
            }
            else{
                int cost = 0;
                for(int i=1;i<=p-k;i++){
                    cost += a[i];
                }

                if(cost > m) System.out.println(0);
                else System.out.println((m - cost) / w);
            }
        }
    }
}
