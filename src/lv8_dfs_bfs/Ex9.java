package lv8_dfs_bfs;

import java.util.Scanner;

public class Ex9 {
    static int[] combi;
    static int n, m;

    public void DFS(int level, int startNumber) {
        if (level == m) {
            for (int x : combi) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = startNumber; i <= n; i++) {
                combi[level] = i;
                DFS(level+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Ex9 T = new Ex9();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new int[m];
        T.DFS(0, 1);
    }
}
