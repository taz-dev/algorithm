package lv8_dfs_bfs;

import java.util.Scanner;

public class Ex3 {
    static int answer = Integer.MIN_VALUE, n, m;

    public void DFS(int level, int score, int time, int[] ps, int[] pt) {
        if (time > m) return;

        if (level == n) {
            answer = Math.max(answer, score);

        } else {
            DFS(level+1, score+ps[level], time+pt[level], ps, pt);
            DFS(level+1, score, time, ps, pt);
        }
    }

    public static void main(String[] args) {
        Ex3 T = new Ex3();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
            b[i] = kb.nextInt();
        }
        T.DFS(0, 0, 0, a, b);
        System.out.println(answer);
    }
}
