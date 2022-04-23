package lv8_dfs_bfs;

import java.util.Scanner;

public class Ex2 {
    static int answer = Integer.MIN_VALUE, c, n;

    public void DFS(int level, int sum, int[] arr) {
        if (sum > c) return;

        if (level == n) {
            //sum <= c인 부분집합 완성
            answer = Math.max(answer, sum);

        } else {
            DFS(level+1, sum+arr[level], arr);
            DFS(level+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Ex2 T = new Ex2();
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt();
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=kb.nextInt();
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
