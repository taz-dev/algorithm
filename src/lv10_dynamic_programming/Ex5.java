package lv10_dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    static int n, m;
    static int[] dy;

    public int solution(int[] coin) {
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = coin[i]; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j-coin[i]]+1);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        Ex5 T = new Ex5();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = kb.nextInt();
        }
        m = kb.nextInt();
        dy = new int[m+1];
        System.out.println(T.solution(coin));
    }
}
