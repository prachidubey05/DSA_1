package CodeForces;
import java.util.Scanner;
public class Antimedian
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] p = new int[n];

                for (int i = 0; i < n; i++) {
                    p[i] = sc.nextInt();
                }
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    if (n == 1) {
                        result.append(1);
                    } else {
                        result.append(2);
                    }
                    if (i < n - 1) {
                        result.append(" ");
                    }
                }
                System.out.println(result.toString());
            }
        }
    }
