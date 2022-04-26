package lv8_dfs_bfs;

import java.util.Scanner;

public class Ex8 {
    static int n, fin;
    static int[] com, per, ck;
    boolean flag = false;
    int[][] dy = new int[35][35]; //메모이제이션

    public int combination(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }

    public void DFS(int level, int sum) {
        if (flag) return;

        if (level == n) {
            if (sum == fin) {
                for (int x : per) System.out.print(x + " ");
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) { //i 자체가 순열을 만드는 숫자
                if (ck[i] == 0) {
                    ck[i] = 1;
                    per[level] = i;
                    DFS(level + 1, sum + (per[level] * com[level]));
                    ck[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Ex8 T = new Ex8();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        fin = kb.nextInt();
        com = new int[n];
        per = new int[n];
        ck = new int[n+1]; //숫자 1부터 사용
        for (int i = 0; i < n; i++) {
            //미리 com 배열에 값을 집어넣음
            com[i] = T.combination(n-1, i);
        }
        T.DFS(0, 0);
    }
}
