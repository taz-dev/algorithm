package lv8_dfs_bfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex5 {
    static int answer = Integer.MAX_VALUE, n, m;

    public void DFS(int level, int sum, Integer[] arr) {
        if (sum > m) return;
        if (level >= answer) return;

        if (sum == m) {
            answer = Math.min(answer, level);

        } else {
            for (int i = 0; i < n; i++) {
                DFS(level+1, sum+arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Ex5 T = new Ex5();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder()); //내림차순
        m = kb.nextInt();
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
