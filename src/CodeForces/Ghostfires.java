package CodeForces;

import java.util.*;

public class Ghostfires {

    static class Pair {
        int count;
        char ch;

        Pair(int c, char ch) {
            this.count = c;
            this.ch = ch;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int g = sc.nextInt();
            int b = sc.nextInt();

            PriorityQueue<Pair> pq = new PriorityQueue<>(
                    (a, b1) -> b1.count - a.count
            );

            if (r > 0) pq.add(new Pair(r, 'R'));
            if (g > 0) pq.add(new Pair(g, 'G'));
            if (b > 0) pq.add(new Pair(b, 'B'));

            StringBuilder res = new StringBuilder();

            while (!pq.isEmpty()) {
                List<Pair> temp = new ArrayList<>();
                boolean placed = false;

                while (!pq.isEmpty()) {
                    Pair cur = pq.poll();

                    int len = res.length();

                    // check constraints
                    boolean ok = true;

                    if (len >= 1 && res.charAt(len - 1) == cur.ch) {
                        ok = false;
                    }
                    if (len >= 3 && res.charAt(len - 3) == cur.ch) {
                        ok = false;
                    }

                    if (ok) {
                        res.append(cur.ch);
                        cur.count--;
                        if (cur.count > 0) pq.add(cur);
                        placed = true;
                        break;
                    } else {
                        temp.add(cur);
                    }
                }

                // push back skipped
                for (Pair p : temp) pq.add(p);

                if (!placed) break;
            }

            System.out.println(res.toString());
        }
    }
}
