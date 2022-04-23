package lv8_dfs_bfs;

import java.util.Scanner;

public class Ex4 {
    static int[] pm;
    static int n, m;

    public void DFS(int level) {
        if (level == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();

        } else {
            for (int i = 1; i <= n; i++) {
                pm[level] = i;
                DFS(level+1);
            }
        }
    }

    public static void main(String[] args) {
        Ex4 T = new Ex4();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];
        T.DFS(0);
    }
}
