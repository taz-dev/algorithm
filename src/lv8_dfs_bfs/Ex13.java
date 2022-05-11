package lv8_dfs_bfs;

import java.util.Scanner;

public class Ex13 {
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int answer = 0, n;

    public void DFS(int x, int y, int[][] island) {
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < n && island[nx][ny] == 1) {
                island[nx][ny] = 0;
                DFS(nx, ny, island);
            }
        }
    }

    public void solution(int[][] island) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (island[i][j] == 1) {
                    answer++;
                    island[i][j] = 0;
                    DFS(i, j, island);
                }
            }
        }
    }

    public static void main(String[] args) {
        Ex13 T = new Ex13();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[][] island = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                island[i][j] = kb.nextInt();
            }
        }
        T.solution(island);
        System.out.println(answer);
    }
}
