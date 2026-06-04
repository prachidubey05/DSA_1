package CodeForces;
import java.util.*;
public class Passing_the_ball {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean[] visited = new boolean[n + 1];

            int current = 1;
            visited[current] = true;

            for (int i = 0; i < n; i++) {
                if (s.charAt(current - 1) == 'R') {
                    current++;
                } else {
                    current--;
                }
                visited[current] = true;
            }

            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (visited[i]) count++;
            }

            System.out.println(count);
        }

}
}
